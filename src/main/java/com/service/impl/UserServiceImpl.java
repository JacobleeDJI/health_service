package com.service.impl;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User getUserByPhone(String userPhone) {
        return userDao.selectUserByPhone(userPhone);
    }

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByUid(String userUid) { return  userDao.selectUserByUid(userUid); }

    public User getUserByname(String userName) {return userDao.selectUserByname(userName); }

    public Long getinsertUser(User user) {return userDao.insertUser(user); }

    public int getMid(User user) {return userDao.setMid(user); }

    public int setChangeProfilePassword(User user) { return userDao.changeProfilePassword(user); }

    public int setChangeProfile(User user) { return userDao.changeProfile(user);}

    public int setChangeProfileGender(User user) { return userDao.changeProfileGender(user); }

    public int setChangeProfileEmail(User user) { return userDao.changeProfileEmail(user); }

    public int setChangeProfilePhone(User user) { return userDao.changeProfilePhone(user); }

    public int setChangeProfileAddress(User user) { return userDao.changeProfileAddress(user); }

    public int setChangeProfileAge(User user) { return userDao.changeProfileAge(user); }

    public int setupLoadA(User user) { return userDao.upLoadA(user); }

    public int setupLoadB(User user) { return userDao.upLoadB(user); }

    public int setupLoadC(User user) { return userDao.upLoadC(user); }

    public int setupLoadD(User user) { return userDao.upLoadD(user); }

    public int setfirstCalibTime(User user) { return  userDao.firstCalibTime(user); }

    public User queryForLogin(String userPhone, String userPwd) {
        return userDao.queryForLogin(userPhone, userPwd);
    }

    public User getselectDocPatient(Integer docId) {return userDao.selectDocPatient(docId); }

}

