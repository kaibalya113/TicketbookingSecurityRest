package com.login.booking.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

	@Autowired
	DataSource dataSource;
	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().antMatchers("/start/tickets/**")
		
		.hasAnyRole("user").and().formLogin();
		
		http.csrf().disable()
		.authorizeRequests().antMatchers("/start/ticket/getall")
		.hasAnyRole("admin").and().formLogin();
		
		
	}*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().antMatchers("/start/tickets/**")
		.access("hasRole('ROLE_ADMIN')")
		.anyRequest().permitAll()
		.and()
			.formLogin()
			.usernameParameter("name").passwordParameter("password");
		
		http.csrf().disable()
		.authorizeRequests().antMatchers("/start/ticket/getall")
		.access("hasRole('ROLE_ADMIN')")
		.anyRequest().permitAll()
		.and()
			.formLogin()
			.usernameParameter("name").passwordParameter("password");
		
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().withUser("krishna").password("123").roles("admin").and().passwordEncoder(new BCryptPasswordEncoder());
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select name,password enabled from users where name =?"  )
			.authoritiesByUsernameQuery("select name, role from roles where name =?");
			
		
		//auth.inMemoryAuthentication().withUser("mohanty").password("1234").roles("admin", "user");
		
	}
	
	
	/*protected void registerAuthentication(AuthenticationManagerBuilder registry) throws Exception {
        BCryptPasswordEncoder encoder = passwordEncoder();
        registry
                .inMemoryAuthentication()
                .passwordEncoder(passwordEncoder())
                 .withUser("krishna").password("123").roles("admin");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}
