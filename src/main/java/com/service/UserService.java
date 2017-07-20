package com.service;

import com.model.Sys;
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
    User getUserByname(String UserName);
    User queryForLogin(String userPhone, String userPwd);
    int setChangeProfilePassword(User user);
    int setChangeProfile(User user);
    int setChangeProfileGender(User user);
    int setChangeProfileEmail(User user);
    int setChangeProfilePhone(User user);
    int setChangeProfileAddress(User user);
    Long getinsertUser(User user);
    List<User> getDocUser(Long userId);
}
