package com.lty.fsb.controller;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.lty.fsb.common.util.MD5Util;
import com.lty.fsb.common.util.Result;
import com.lty.fsb.common.util.ResultUtil;
import com.lty.fsb.entity.system.TUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

import static org.apache.shiro.SecurityUtils.getSubject;

/**
 * create by  lty
 * on  2019-08-07  10:22
 */
@Validated
@RestController
@CrossOrigin
public class HomeController  {
    @RequestMapping("home")
    public String home(){
        return "homePage";
    }

    @RequestMapping("login")
    public Result login(
            @NotBlank(message = "{required}") String username,
            @NotBlank(message = "{required}") String password,
            /*@NotBlank(message = "{required}") String verifyCode,*/
            boolean rememberMe, HttpServletRequest request) throws Exception {
    /*    password = MD5Util.encrypt(username.toLowerCase(), password);*/
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = getSubject();
        if (subject != null) {
            subject.logout();
        }
        try {
            subject.login(token);
        }catch (Exception e){
            throw new Exception();
        }

        boolean authenticated = subject.isAuthenticated();
        Serializable userToken = subject.getSession().getId();

        return ResultUtil.success(userToken);
    }




    public static void main(String[] args) {
        String admin = MD5Util.encrypt("admin123", "123123");
        System.out.println(admin);
    }
}

