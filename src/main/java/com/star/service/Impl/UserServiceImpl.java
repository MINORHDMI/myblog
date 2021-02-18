package com.star.service.Impl;

import com.star.dao.UserDao;
import com.star.entity.User;
import com.star.service.UserService;
import com.star.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 用户业务层接口实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        // 查找时先将密码MD5加密
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}