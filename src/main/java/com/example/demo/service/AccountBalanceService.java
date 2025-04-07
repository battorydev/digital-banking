package com.example.demo.service;

import com.example.demo.dao.AccountBalanceRepository;
import com.example.demo.dao.entity.AccountBalanceEntity;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountBalanceService {

  private static final Logger log = LoggerFactory.getLogger(AccountBalanceService.class);

  private final AccountBalanceRepository accountBalanceRepository;

  public AccountBalanceService(AccountBalanceRepository accountBalanceRepository) {
    this.accountBalanceRepository = accountBalanceRepository;
  }

  public BigDecimal getBalance(String testUser, String accountId) {

    log.info("Fetching account balance...");

    AccountBalanceEntity accountBalanceEntity = accountBalanceRepository.findByUserIdAndAccountId(
            testUser, accountId)
        .orElseThrow(() -> new RuntimeException("Account not found"));

    return accountBalanceEntity.getAmount();
  }
}
