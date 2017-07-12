package com.dao;

import com.model.Sys;
import com.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
@Repository
public interface UserDao {
    User selectUserById(Long userId);//通过ID查询用户信息-已实现
    User selectUserByname(String userName);//通过姓名查询用户信息-已实现
    User selectUserByPhone(String userPhone);//通过电话查询用户信息-已实现
    List<User> selectAllUser();//查询所有的用户信息-已实现
    User queryForLogin(@Param("userPhone") String userPhone, @Param("userPwd") String userPwd);//通过查询数据库验证用户登录
    int changeProfile(User user);//修改用户信息name
    int changeProfileGender(User user);//修改用户信息gender
    int changeProfileEmail(User user);//修改用户信息email
    int changeProfilePhone(User user);//修改用户信息phone
    int changeProfileAddress(User user);//修改用户信息address
    Long insertUser(User user);//注册用户-已实现

}

