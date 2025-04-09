package com.example.demo.controller;

import com.example.demo.service.AccountBalanceService;
import com.example.demo.service.UserService;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

  private final Logger LOG = LoggerFactory.getLogger(UserController.class);

  private final UserService userService;

  private final AccountBalanceService accountBalanceService;

  public UserController(UserService userService, AccountBalanceService accountBalanceService) {
    this.userService = userService;
    this.accountBalanceService = accountBalanceService;
  }

  @GetMapping("/users/greeting")
  public ResponseEntity<String> getUserGreeting(String user) {
    LOG.info("getUserGreeting : {}", user);

    String greetingMessage = userService.getGreeting(user);
    return new ResponseEntity<>(greetingMessage, HttpStatus.OK);
  }

  @GetMapping("/users/{userId}/balance")
  public ResponseEntity<BigDecimal> getUserBalance(@PathVariable("userId") String user) {
    LOG.info("getUserBalance : {}", user);

    BigDecimal amount = accountBalanceService.getBalance(user);
    return new ResponseEntity<>(amount, HttpStatus.OK);
  }
}
