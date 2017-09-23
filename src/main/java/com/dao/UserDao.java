package com.dao;

import com.model.Responsible;
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
    User selectUserByUid(String userUid);//通过Uid查询用户信息
    User selectUserByname(String userName);//通过姓名查询用户信息-已实现
    User selectUserByPhone(String userPhone);//通过电话查询用户信息-已实现
    List<User> selectAllUser();//查询所有的用户信息-已实现
    User queryForLogin(@Param("userPhone") String userPhone, @Param("userPwd") String userPwd);//通过查询数据库验证用户登录
    int changeProfilePassword(User user);//修改用户信息password
    int changeProfile(User user);//修改用户信息name
    int changeProfileGender(User user);//修改用户信息gender
    int changeProfileEmail(User user);//修改用户信息email
    int changeProfilePhone(User user);//修改用户信息phone
    int changeProfileAddress(User user);//修改用户信息address
    int changeProfileAge(User user);//修改用户信息age
    int upLoadA(User user);//上传标定数据A
    int upLoadB(User user);//上传标定数据B
    int upLoadC(User user);//上传标定数据C
    int upLoadD(User user);//上传标定数据D
    int firstCalibTime(User user);//上传首次定标时间
    int setMid(User user);//绑定机器号
    Long insertUser(User user);//注册用户-已实现
    User selectDocPatient(Integer docId);
}

