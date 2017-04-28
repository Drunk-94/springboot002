package com.wode.dao;

import com.wode.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by ZUI on 2017/4/28.
 */
public interface UserDao extends JpaRepository<User,Integer> {
    public User findUserByUserNameAndUserPwd(String name, String pwd);

}
