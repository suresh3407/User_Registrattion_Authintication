/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.model;

import java.sql.Date;

/**
 *
 * @author suresh
 */
public class UserModel {
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private String authKey;
    private Date addedDate;
    private Boolean status;

    public UserModel() {
    }

    public UserModel(Integer userId, String userName, String password, String email, String authKey, Date addedDate, Boolean status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.authKey = authKey;
        this.addedDate = addedDate;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
