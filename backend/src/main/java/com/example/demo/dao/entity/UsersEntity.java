package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users")
public class UsersEntity {

  @Id
  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "name", length = 100)
  private String name;

  @Column(name = "dummy_col_1")
  private String dummyCol1;

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

  public String getDummyCol1() {
    return dummyCol1;
  }

  public void setDummyCol1(String dummyCol1) {
    this.dummyCol1 = dummyCol1;
  }
}
