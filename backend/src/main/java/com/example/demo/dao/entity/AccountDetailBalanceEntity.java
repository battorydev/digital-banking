package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "account_details")
public class AccountDetailBalanceEntity {

  @Id
  @Column(name = "account_id", length = 50)
  private String accountId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "color", length = 10)
  private String color;

  @Column(name = "is_main_account")
  private Boolean mainAmount;

  @Column(name = "progress")
  private Long progress;

  @Column(name = "dummy_col_5")
  private String dummyCol5;

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

  public Boolean getMainAmount() {
    return mainAmount;
  }

  public void setMainAmount(Boolean mainAmount) {
    this.mainAmount = mainAmount;
  }

  public String getDummyCol5() {
    return dummyCol5;
  }

  public void setDummyCol5(String dummyCol5) {
    this.dummyCol5 = dummyCol5;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Boolean isMainAmount() {
    return mainAmount;
  }

  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }
}
