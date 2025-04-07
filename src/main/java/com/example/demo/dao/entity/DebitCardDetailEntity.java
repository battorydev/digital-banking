package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "debit_card_details")
public class DebitCardDetailEntity {

  @Id
  @Column(name = "card_id", length = 50)
  private String cardId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "issuer", length = 100)
  private String issuer;

  @Column(name = "number", length = 25)
  private String number;

  @Column(name = "dummy_col_10")
  private String dummyCol10;

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getDummyCol10() {
    return dummyCol10;
  }

  public void setDummyCol10(String dummyCol10) {
    this.dummyCol10 = dummyCol10;
  }
}
