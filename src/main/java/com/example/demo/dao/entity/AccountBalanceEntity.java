package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "account_balances")
public class AccountBalanceEntity {

  @Id
  @Column(name = "account_id", length = 50)
  private String accountId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "amount", scale = 2 , precision = 15)
  private BigDecimal amount;

  @Column(name = "dummy_col_4")
  private String dummyCol4;

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getDummyCol4() {
    return dummyCol4;
  }

  public void setDummyCol4(String dummyCol4) {
    this.dummyCol4 = dummyCol4;
  }
}
