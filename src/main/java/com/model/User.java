package com.model;

import java.util.Date;
import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */

public class User {
    private Long id;
    private int t_id;
    private String userPwd;
    private String userName;
    private String userGender;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private Date Time;
    private double comfort;
    private String userUid;
    private String userMid;
    private String userMac;
    private String userAge;
    private String userCalibtime;
    private List<Responsible> responsible;
    private Posts posts;

    private double userComfortA1;
    private double userComfortA2;
    private double userComfortA3;
    private double userComfortA4;
    private double userComfortB1;
    private double userComfortB2;
    private double userComfortB3;
    private double userComfortB4;
    private double userComfortC1;
    private double userComfortC2;
    private double userComfortC3;
    private double userComfortC4;
    private double userComfortD1;
    private double userComfortD2;
    private double userComfortD3;
    private double userComfortD4;


    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public List<Responsible> getResponsible() {
        return responsible;
    }

    public void setResponsible(List<Responsible> responsible) {
        this.responsible = responsible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getT_id() {
         return t_id;
    }

    public void setT_id(int t_id) {
         this.t_id = t_id;
    }

     public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

     public double getComfort() {
         return comfort;
     }

     public void setComfort(double comfort) {
         this.comfort = comfort;
     }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getUserMid() {
        return userMid;
    }

    public void setUserMid(String userMid) {
        this.userMid = userMid;
    }

    public String getUserMac() {
        return userMac;
    }

    public void setUserMac(String userMac) {
        this.userMac = userMac;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }


    public String getUserCalibtime() {
        return userCalibtime;
    }

    public void setUserCalibtime(String userCalibtime) {
        this.userCalibtime = userCalibtime;
    }

    public double getUserComfortA1() {
        return userComfortA1;
    }

    public void setUserComfortA1(double userComfortA1) {
        this.userComfortA1 = userComfortA1;
    }

    public double getUserComfortA2() {
        return userComfortA2;
    }

    public void setUserComfortA2(double userComfortA2) {
        this.userComfortA2 = userComfortA2;
    }

    public double getUserComfortA3() {
        return userComfortA3;
    }

    public void setUserComfortA3(double userComfortA3) {
        this.userComfortA3 = userComfortA3;
    }

    public double getUserComfortA4() {
        return userComfortA4;
    }

    public void setUserComfortA4(double userComfortA4) {
        this.userComfortA4 = userComfortA4;
    }

    public double getUserComfortB1() {
        return userComfortB1;
    }

    public void setUserComfortB1(double userComfortB1) {
        this.userComfortB1 = userComfortB1;
    }

    public double getUserComfortB2() {
        return userComfortB2;
    }

    public void setUserComfortB2(double userComfortB2) {
        this.userComfortB2 = userComfortB2;
    }

    public double getUserComfortB3() {
        return userComfortB3;
    }

    public void setUserComfortB3(double userComfortB3) {
        this.userComfortB3 = userComfortB3;
    }

    public double getUserComfortB4() {
        return userComfortB4;
    }

    public void setUserComfortB4(double userComfortB4) {
        this.userComfortB4 = userComfortB4;
    }

    public double getUserComfortC1() {
        return userComfortC1;
    }

    public void setUserComfortC1(double userComfortC1) {
        this.userComfortC1 = userComfortC1;
    }

    public double getUserComfortC2() {
        return userComfortC2;
    }

    public void setUserComfortC2(double userComfortC2) {
        this.userComfortC2 = userComfortC2;
    }

    public double getUserComfortC3() {
        return userComfortC3;
    }

    public void setUserComfortC3(double userComfortC3) {
        this.userComfortC3 = userComfortC3;
    }

    public double getUserComfortC4() {
        return userComfortC4;
    }

    public void setUserComfortC4(double userComfortC4) {
        this.userComfortC4 = userComfortC4;
    }

    public double getUserComfortD1() {
        return userComfortD1;
    }

    public void setUserComfortD1(double userComfortD1) {
        this.userComfortD1 = userComfortD1;
    }

    public double getUserComfortD2() {
        return userComfortD2;
    }

    public void setUserComfortD2(double userComfortD2) {
        this.userComfortD2 = userComfortD2;
    }

    public double getUserComfortD3() {
        return userComfortD3;
    }

    public void setUserComfortD3(double userComfortD3) {
        this.userComfortD3 = userComfortD3;
    }

    public double getUserComfortD4() {
        return userComfortD4;
    }

    public void setUserComfortD4(double userComfortD4) {
        this.userComfortD4 = userComfortD4;
    }
}
