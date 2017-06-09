package com.service;

import com.model.User;

import java.util.List;

/**
 * @author Abdullah
 * @Description:
 * @Version 1.0
 * @Date: Create in 下午1:40 2017/2/8
 * @Modified by
 */
public interface UserService {
    List<User> getAllUser();
    User getUserByPhoneOrEmail(String phoneOrEmail, Short isDelete);
    User getUserById(Long userId);
}
