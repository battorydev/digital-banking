package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

  @Bean
  public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
    UserDetails user1 = User.builder()
        .username("user1")
        .password(passwordEncoder.encode("password"))
        .roles("USER")
        .build();

    UserDetails user2 = User.builder()
        .username("user2")
        .password(passwordEncoder.encode("password"))
        .roles("USER")
        .build();

    return new InMemoryUserDetailsManager(user1, user2);
  }
}