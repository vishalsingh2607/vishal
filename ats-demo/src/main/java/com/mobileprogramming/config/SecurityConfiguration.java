package com.mobileprogramming.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter{


	
	@Autowired
	private DataSource dataSource;
		 
	       @Override
		    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		        // Set your configuration on the auth object
		        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(getPasswordEncoder());
		    }
			
	     /*  @Bean
			public AuthenticationProvider authProvider() {
				DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
				provider.setUserDetailsService(atsUserDetailsService);
				provider.setPasswordEncoder(getPasswordEncoder());
				return provider;
				
			}*/
		    @Bean
		    public PasswordEncoder getPasswordEncoder() {
		        return new BCryptPasswordEncoder();
		    }

		    @Override
		    protected void configure(HttpSecurity http) throws Exception {
		        http.csrf().disable().
		        authorizeRequests()
		                .antMatchers("/candidates").hasRole("ADMIN")
		                .antMatchers("/candidates/{id}").hasRole("ADMIN")
		                .antMatchers("/").permitAll()
		                .and().formLogin();
	    }
	
}
