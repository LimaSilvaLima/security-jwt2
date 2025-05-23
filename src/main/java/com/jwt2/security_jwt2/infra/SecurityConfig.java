package com.jwt2.security_jwt2.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //authorizeConfig.anyRequest().permitAll();
        return http
            .authorizeHttpRequests(
                authorizeConfig ->{
                    //authorizeConfig.anyRequest().permitAll();
                    authorizeConfig.requestMatchers("/public").permitAll();
                    authorizeConfig.requestMatchers("/logout").permitAll();
                    authorizeConfig.anyRequest().authenticated();// para  permitir acesso substituir por permitAll
                }
            )
            .formLogin(Customizer.withDefaults())
            .build();
        
        
    }

}
