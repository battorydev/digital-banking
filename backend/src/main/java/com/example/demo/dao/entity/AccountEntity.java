package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "account")
public class AccountEntity {

  @Id
  @Column(name = "account_id", length = 50)
  private String accountId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "type", length = 50)
  private String type;

  @Column(name = "currency", length = 10)
  private String currency;

  @Column(name = "account_number", length = 20)
  private String accountNumber;

  @Column(name = "issuer", length = 100)
  private String issuer;

  @Column(name = "dummy_col_3")
  private String dummyCol3;

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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getDummyCol3() {
    return dummyCol3;
  }

  public void setDummyCol3(String dummyCol3) {
    this.dummyCol3 = dummyCol3;
  }
}
