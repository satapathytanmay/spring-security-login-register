package com.sp.main.SecurityConfig;

import com.sp.main.Service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class securityconfig {

        private final CustomUserDetailsService uds;

        public securityconfig(CustomUserDetailsService uds) {
            this.uds = uds;
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

        @Bean
        public AuthenticationProvider authenticationProvider() {
            DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
            provider.setUserDetailsService(uds);
            provider.setPasswordEncoder(passwordEncoder());
            return provider;
        }

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(csrf -> csrf.disable())
                    .authorizeHttpRequests(auth -> auth
                            .requestMatchers("/login","/register","/register/**").permitAll()
                            .anyRequest().authenticated()
                    ).formLogin(Customizer.withDefaults());
                   // .formLogin(form -> form
                         //   .loginPage("/login")  // Ensure this is correctly set up for custom login
                        //    .defaultSuccessUrl("/", true)
                         //   .permitAll()
                  //  )
                   // .logout(logout -> logout
                    //    .logoutSuccessUrl("/login")
                           // .permitAll()
                   // );
            return http.build();
        }
    }


