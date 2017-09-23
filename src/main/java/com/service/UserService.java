package com.service;

import com.model.User;

import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
public interface UserService {
    List<User> getAllUser();
    User getUserByPhone(String userPhone);
    User getUserById(Long userId);
    User getUserByUid(String userUid);
    User getUserByname(String UserName);
    User queryForLogin(String userPhone, String userPwd);
    int setChangeProfilePassword(User user);
    int setChangeProfile(User user);
    int setChangeProfileGender(User user);
    int setChangeProfileEmail(User user);
    int setChangeProfilePhone(User user);
    int setChangeProfileAddress(User user);
    int setChangeProfileAge(User user);
    int setupLoadA(User user);
    int setupLoadB(User user);
    int setupLoadC(User user);
    int setupLoadD(User user);
    int setfirstCalibTime(User user);
    Long getinsertUser(User user);
    int getMid(User user);//绑定机器号(User user);
    User getselectDocPatient(Integer docId);
}
