package com.example.demo.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "banner")
public class BannerEntity {

  @Id
  @Column(name = "banner_id", length = 50)
  private String bannerId;

  @Column(name = "user_id", length = 50)
  private String userId;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "image")
  private String image;

  @Column(name = "dummy_col_11")
  private String dummyCol11;

  public String getBannerId() {
    return bannerId;
  }

  public void setBannerId(String bannerId) {
    this.bannerId = bannerId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getDummyCol11() {
    return dummyCol11;
  }

  public void setDummyCol11(String dummyCol11) {
    this.dummyCol11 = dummyCol11;
  }
}
