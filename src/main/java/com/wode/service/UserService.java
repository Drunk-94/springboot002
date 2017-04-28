package com.wode.service;

import com.wode.bean.User;

import java.util.List;

/**
 * Created by ZUI on 2017/4/28.
 */
public interface UserService {
    public User login(String name, String pwd);
    public List<User> findAllUser();
}
