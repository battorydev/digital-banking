package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import com.example.demo.dao.AccountBalanceRepository;
import com.example.demo.dao.entity.AccountBalanceEntity;
import java.math.BigDecimal;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@ActiveProfiles("test")
@SpringBootTest
public class AccountBalanceServiceTest {

  @MockitoBean
  private AccountBalanceRepository accountBalanceRepository;

  @Autowired
  private AccountBalanceService accountBalanceService;

  @Test
  void getBalance_ShouldReturnsCorrectAmount() {
    String testUser = "000018b0e1a211ef95a30242ac180002";
    String accountId = "000020ece1a211ef95a30242ac180002";
    BigDecimal expectedAmount = new BigDecimal("86048.06");

    AccountBalanceEntity accountBalanceEntity = new AccountBalanceEntity();
    accountBalanceEntity.setAmount(expectedAmount);

    when(accountBalanceRepository.findByUserIdAndAccountId(testUser, accountId))
        .thenReturn(Optional.of(accountBalanceEntity));

    BigDecimal actualAmount = accountBalanceService.getBalance(testUser, accountId);

    assertEquals(expectedAmount, actualAmount);
  }

  @Test
  void getBalance_AccountNotFound_ShouldThrowsException() {
    String testUser = "user1";
    String accountId = "account1";

    when(accountBalanceRepository.findByUserIdAndAccountId(testUser, accountId))
        .thenReturn(Optional.empty());

    assertThrows(RuntimeException.class, () -> accountBalanceService.getBalance(testUser, accountId));
  }
}
