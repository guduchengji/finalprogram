package com.xlx.controller;

import com.xlx.entity.User;
import com.xlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class RegistController {
    @Autowired
    private UserService userService;

    /**
     *
     * 用户的注册按钮
     * @param user
     * @return
     */
    @RequestMapping("regist")
    @ResponseBody
    public String regist(User user){
        userService.add(user);
        return "ok";
    }

    /**
     * 预留的用户注销按钮
     * @param user
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public String delete(User user){
        userService.delete(user);
        return "ok";
    }

    /**
     * @param user
     * @return1 没有查询到用户
     * @return2 密码错误
     * @return3 登陆成功
     */
    @RequestMapping("login")
    @ResponseBody
    public Integer login(User user){
        User one = userService.queryOne(user);
        if (one==null)return 1;
        if (one.getPassword().equals(user.getPassword()))return 2;
        return 3;
    }
}
