package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qp
 * @date 2019/4/12 10:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser(User user) {
        // 开启分页插件,注意必须放在查询语句上面
        // 底层实现原理：将下面的查询方法中sql语句获取到之后利用AOP拼接 limit生成分页语句
        PageHelper.startPage(user.getPage(), user.getSize());

        return userDao.listUser();
    }
}
