package com.roadvirushn.dns.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Article {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private Integer user_id;

  private String content;

  private String registered_date;

  private String updated_date;
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return user_id;
  }

  public void setUserId(Integer user_id) {
    this.user_id = user_id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getRegisteredDate() {
    return registered_date;
  }

  public void setRegisteredDate(String registered_date) {
    this.registered_date = registered_date;
  }

  public String getUpdatedDate() {
    return updated_date;
  }

  public void setUpdatedDate(String updated_date) {
    this.updated_date = updated_date;
  }  
}