package com.example.demo.controller;

import com.example.demo.service.AccountBalanceService;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountBalanceController {

  private static final Logger LOG = LoggerFactory.getLogger(AccountBalanceController.class);

  private final AccountBalanceService accountBalanceService;

  public AccountBalanceController(AccountBalanceService accountBalanceService) {
    this.accountBalanceService = accountBalanceService;
  }

  @GetMapping("/accounts/balance")
  public ResponseEntity<BigDecimal> getAccountBalance(String user, String account) {
    LOG.info("getUserGreeting : {}", user);

    BigDecimal greetingMessage = accountBalanceService.getBalance(user, account);
    return new ResponseEntity<>(greetingMessage, HttpStatus.OK);
  }

}
