package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "debit_cards")
public class DebitCardEntity {

  @Id
  @Column(name = "card_id", length = 50)
  private String cardId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "name", length = 100)
  private String name;

  @Column(name = "dummy_col_7")
  private String dummyCol7;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDummyCol7() {
    return dummyCol7;
  }

  public void setDummyCol7(String dummyCol7) {
    this.dummyCol7 = dummyCol7;
  }
}
