package com.example.demo.service;

import com.example.demo.dao.UserGreetingsRepository;
import com.example.demo.dao.entity.UserGreetingsEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserGreetingsRepository userGreetingsRepository;

  public UserService(UserGreetingsRepository userGreetingsRepository) {
    this.userGreetingsRepository = userGreetingsRepository;
  }

  public String getGreeting(String testUser) {

    UserGreetingsEntity userGreetings = userGreetingsRepository.findByUserId(testUser)
        .orElseThrow(() -> new RuntimeException("User not found"));

    return userGreetings.getGreeting();
  }
}
