package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "user_greetings")
public class UserGreetingsEntity {

  @Id
  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "greeting")
  private String greeting;

  @Column(name = "dummy_col_2")
  private String dummyCol2;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public String getDummyCol2() {
    return dummyCol2;
  }

  public void setDummyCol2(String dummyCol2) {
    this.dummyCol2 = dummyCol2;
  }
}
