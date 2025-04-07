package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users/greeting")
  public ResponseEntity<String> getUserGreeting() {
    String testUser = "000018b0e1a211ef95a30242ac180002";
    String greetingMessage = userService.getGreeting(testUser);
    return new ResponseEntity<>(greetingMessage, HttpStatus.OK);
  }
}
