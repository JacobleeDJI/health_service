package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Abdullah
 * @Description:
 * @Version 1.0
 * @Date: Create in 上午11:08 2017/2/8
 * @Modified by
 */
@Repository
public interface UserDao {
    User selectUserById(Long userId);
    User selectUserByPhoneOrEmail(String emailOrPhone, Short isDelete);
    List<User> selectAllUser();
}
