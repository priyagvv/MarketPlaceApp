package com.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication()
                .withUser("client1").password("password").authorities("ROLE_CLIENT")
                .and()
                .withUser("client2").password("password").authorities("ROLE_CLIENT")
                .and()
                .withUser("contractor1").password("password").authorities("ROLE_CONTRACTOR");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/project").access("hasRole('ROLE_CLIENT') or hasRole('ROLE_CONTRACTOR')")
                .antMatchers("/projects", "createProject").access("hasRole('ROLE_CLIENT') or hasRole('ROLE_CONTRACTOR')")
                .antMatchers("/bid").access("hasRole('ROLE_CONTRACTOR')")
                .and()
                .httpBasic();

        http.csrf().disable();

    }

    @SuppressWarnings("")
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

}