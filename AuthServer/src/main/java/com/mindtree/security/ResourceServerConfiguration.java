package com.mindtree.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableWebSecurity
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId("rest").stateless(false);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .requestMatchers()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling().accessDeniedHandler(new CustomErrorHandler())
                .and().httpBasic().disable();

    }

    private class CustomErrorHandler implements org.springframework.security.web.access.AccessDeniedHandler {
        @Override
        public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                           AccessDeniedException e) throws IOException, ServletException {

        }
    }
}
