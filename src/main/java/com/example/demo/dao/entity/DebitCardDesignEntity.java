package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "debit_card_design")
public class DebitCardDesignEntity {

  @Id
  @Column(name = "card_id", length = 50)
  private String cardId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "color", length = 10)
  private String color;

  @Column(name = "border_color", length = 10)
  private String borderColor;

  @Column(name = "dummy_col_9")
  private String dummyCol9;

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

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public String getDummyCol9() {
    return dummyCol9;
  }

  public void setDummyCol9(String dummyCol9) {
    this.dummyCol9 = dummyCol9;
  }
}
