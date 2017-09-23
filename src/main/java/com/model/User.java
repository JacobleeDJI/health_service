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
    private double userComfortA;
    private double userComfortB;
    private double userComfortC;
    private double userComfortD;
    private List<Responsible> responsible;
    private Posts posts;


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

    public double getUserComfortA() {
        return userComfortA;
    }

    public void setUserComfortA(double userComfortA) {
        this.userComfortA = userComfortA;
    }

    public double getUserComfortB() {
        return userComfortB;
    }

    public void setUserComfortB(double userComfortB) {
        this.userComfortB = userComfortB;
    }

    public double getUserComfortC() {
        return userComfortC;
    }

    public void setUserComfortC(double userComfortC) {
        this.userComfortC = userComfortC;
    }

    public double getUserComfortD() {
        return userComfortD;
    }

    public void setUserComfortD(double userComfortD) {
        this.userComfortD = userComfortD;
    }
}
