package com.xiaoxiaohei.service;

import com.xiaoxiaohei.dao.UserDao;
import com.xiaoxiaohei.dao.UserDaoImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by raid on 2017/2/5.
 */
@Transactional
public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("start dao");
        userDao.add();
        System.out.println("end dao");
    }
}
