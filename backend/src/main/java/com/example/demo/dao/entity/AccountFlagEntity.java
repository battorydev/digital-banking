package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.sql.Timestamp;

@Entity(name = "account_flags")
public class AccountFlagEntity {

  @Id
  @Column(name = "flag_id")
  private Long flagId;

  @Column(name = "account_id", length = 50, nullable = false)
  private String accountId;

  @Column(name = "user_id", length = 50, nullable = false)
  private String userId;

  @Column(name = "flag_type", length = 50, nullable = false)
  private String flagType;

  @Column(name = "flag_value", length = 30, nullable = false)
  private String flagValue;

  @Column(name = "created_at")
  private Timestamp createdAt;

  @Column(name = "updated_at")
  private Timestamp updatedAt;

  public Long getFlagId() {
    return flagId;
  }

  public void setFlagId(Long flagId) {
    this.flagId = flagId;
  }

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

  public String getFlagType() {
    return flagType;
  }

  public void setFlagType(String flagType) {
    this.flagType = flagType;
  }

  public String getFlagValue() {
    return flagValue;
  }

  public void setFlagValue(String flagValue) {
    this.flagValue = flagValue;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
