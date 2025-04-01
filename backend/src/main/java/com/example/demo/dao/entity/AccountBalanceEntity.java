package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class AccountBalanceEntity {

  @Id
  @Column(name = "account_id")
  private Long accountId;

  @Column(name = "user_id")
  private Long userId;

  private BigDecimal amount;

  @Column(name = "dummy_col_4")
  private Long dummy_col_4;

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Long getDummy_col_4() {
    return dummy_col_4;
  }

  public void setDummy_col_4(Long dummy_col_4) {
    this.dummy_col_4 = dummy_col_4;
  }
}
