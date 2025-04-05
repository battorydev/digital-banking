package com.example.demo.controller;

import com.example.demo.service.AccountBalanceService;
import java.math.BigDecimal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountBalanceController {

  private final AccountBalanceService accountBalanceService;

  public AccountBalanceController(AccountBalanceService accountBalanceService) {
    this.accountBalanceService = accountBalanceService;
  }

  @GetMapping("/accounts/balance")
  public ResponseEntity<BigDecimal> getAccountBalance() {
    String testUser = "fffff95ee1a111ef95a30242ac180002";
    String testAccount = "0000016ce1a211ef95a30242ac180002";
    BigDecimal greetingMessage = accountBalanceService.getBalance(testUser, testAccount);
    return new ResponseEntity<>(greetingMessage, HttpStatus.OK);
  }
}
