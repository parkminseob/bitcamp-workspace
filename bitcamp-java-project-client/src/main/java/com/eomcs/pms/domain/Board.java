package com.eomcs.pms.domain;

import java.sql.Date;

public class Board {
  private int bno;
  private String title;
  private String content;
  private Member writer;
  private Date registeredDate;
  private int viewCount;

  public int getNo() {
    return bno;
  }
  public void setNo(int no) {
    this.bno = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Member getWriter() {
    return writer;
  }
  public void setWriter(Member writer) {
    this.writer = writer;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
}






