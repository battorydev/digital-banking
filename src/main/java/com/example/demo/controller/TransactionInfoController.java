package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionInfoController {

  @GetMapping("/transaction/info")
  public String getTransactionInfo() {
    throw new RuntimeException("Transaction info not available");
  }
}
