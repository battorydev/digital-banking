package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "debit_card_status")
public class DebitCardStatusEntity {

  @Id
  @Column(name = "card_id", length = 50)
  private String cardId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "status", length = 20)
  private String status;

  @Column(name = "dummy_col_8")
  private String dummyCol8;

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDummyCol8() {
    return dummyCol8;
  }

  public void setDummyCol8(String dummyCol8) {
    this.dummyCol8 = dummyCol8;
  }
}
