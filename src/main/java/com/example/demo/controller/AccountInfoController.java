package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountInfoController {

  @GetMapping("/account/info")
  public String getAccountInfo() {
    throw new RuntimeException("Account info not available");
  }
}
