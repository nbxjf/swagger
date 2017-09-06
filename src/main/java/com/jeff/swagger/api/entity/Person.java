package com.jeff.swagger.api.entity;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Jeff_xu on 2017/9/5.
 *
 * @author Jeff_xu
 * @date 2017/09/05
 */
public class Person {
    @ApiModelProperty("用户Id")
    private int userId;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("手机号")
    private String phoneNumber;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
