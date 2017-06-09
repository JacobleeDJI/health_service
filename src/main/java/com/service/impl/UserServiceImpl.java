package com.service.impl;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Abdullah
 * @Description:
 * @Version 1.0
 * @Date: Create in 下午1:43 2017/2/8
 * @Modified by
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User getUserByPhoneOrEmail(String phoneOrEmail, Short isDelete) {
        return userDao.selectUserByPhoneOrEmail(phoneOrEmail, isDelete);
    }

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
}
