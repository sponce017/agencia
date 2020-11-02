package com.agencia.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//require all request to be authenticated except for the resource
		http.authorizeRequests().antMatchers("/javax.faces.resource/**")
			.permitAll().anyRequest().authenticated();
		
		//login
		http.formLogin().loginPage("/login.xhtml").permitAll()
			.failureUrl("/login.xhtml?error=true");
		
		//logout
		http.logout().logoutSuccessUrl("/login.xhtml");
		
		http.csrf().disable();		
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) 
		throws Exception{
		auth.inMemoryAuthentication().withUser("jonh.doe")
			.password("{noop}1234").roles("USER").and()
			.withUser("jane.doe").password("{noop}5678").roles("ADMIN");
	}

}
