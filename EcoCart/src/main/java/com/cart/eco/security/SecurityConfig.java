package com.cart.eco.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Autowired
	DataSource dataSource;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public CustomLoginSuccessHandler successHandler() {
		return new CustomLoginSuccessHandler();
	}

	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new WebAccessDenyHandler();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> 
							requests
							.antMatchers( "/*").permitAll()
							.antMatchers("/common/**").hasAuthority("ROLE_MANAGER")
							.anyRequest().authenticated())
				.formLogin().loginPage("/login")
							.usernameParameter("userId")
							.loginProcessingUrl("/login")
							.successHandler(successHandler())
//							.defaultSuccessUrl("/top")
							.and()
				.logout().logoutUrl("/logout")
					      .logoutSuccessUrl("/")
						 .invalidateHttpSession(true)
						 .deleteCookies("JSESSIONID")
						 .and()
				.exceptionHandling()
					     .accessDeniedHandler(accessDeniedHandler())
					     .and()
				// .csrf().disable()
			    // .userDetailsService(userService());
					     ;

		return http.build();
	}

	
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/css/**","/assets/**");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		String loginSql = "select emp_num, emp_pw, 1 from employees where emp_num = ?";
		String authSql = "select emp_num, author from employees where emp_num = ?";
		System.out.println("check login");
		auth.jdbcAuthentication()
		    .dataSource(dataSource)
		    .usersByUsernameQuery(loginSql)
		    .authoritiesByUsernameQuery(authSql)
		//    .passwordEncoder(passwordEncoder())
		    ;
		System.out.println(auth.jdbcAuthentication());
	}

	
}
