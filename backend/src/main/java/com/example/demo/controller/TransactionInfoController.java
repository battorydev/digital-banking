package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionInfoController {

  @GetMapping("/transaction/info")
  public String getTransactionInfo() {
    return "transactionInfo";
  }
}
