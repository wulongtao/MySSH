package com.xiaoxiaohei.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaoxiaohei.service.UserService;

/**
 * Created by raid on 2017/2/5.
 */
public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("action.......");
        System.out.println("start service.......");

        userService.add();

        System.out.println("end service.......");

        return NONE;
    }
}
