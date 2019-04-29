package com.qianfeng.po;


public class UserInfo {

  private long userId;
  private String userName;
  private String userAccount;
  private String userPassword;
  private long userAvail;
  private String userMail;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public long getUserAvail() {
    return userAvail;
  }

  public void setUserAvail(long userAvail) {
    this.userAvail = userAvail;
  }


  public String getUserMail() {
    return userMail;
  }

  public void setUserMail(String userMail) {
    this.userMail = userMail;
  }

}
