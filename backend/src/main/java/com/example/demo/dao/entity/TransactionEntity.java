package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "transactions")
public class TransactionEntity {

  @Id
  @Column(name = "transaction_id", length = 50)
  private String transactionId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "name", length = 100)
  private String name;

  @Column(name = "image")
  private String image;

  @Column(name = "isBank")
  private Boolean isBank;

  @Column(name = "dummy_col_6")
  private String dummyCol6;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Boolean getBank() {
    return isBank;
  }

  public void setBank(Boolean bank) {
    isBank = bank;
  }

  public String getDummyCol6() {
    return dummyCol6;
  }

  public void setDummyCol6(String dummyCol6) {
    this.dummyCol6 = dummyCol6;
  }
}
