package com.lty.fsb.controller;

import com.lty.fsb.common.util.MD5Util;
import com.lty.fsb.common.util.Result;
import com.lty.fsb.common.util.ResultUtil;
import com.lty.fsb.service.system.impl.TUserServiceImpl;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import static org.apache.shiro.SecurityUtils.getSubject;

/**
 * create by  lty
 * on  2019-08-07  10:22
 */
@Validated
@RestController
@CrossOrigin
public class HomeController  {
    @Autowired
    TUserServiceImpl userService;

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

    @RequestMapping("reg")
    public Result regTest(@RequestBody String Data) throws Exception {
        Result result = userService.insertOneUser(Data);
        return result;
    }


    public static void main(String[] args) {
        String admin = MD5Util.encrypt("admin123", "123123");
        System.out.println(admin);
    }
}

