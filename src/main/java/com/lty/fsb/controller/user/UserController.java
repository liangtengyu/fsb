package com.lty.fsb.controller.user;


import com.lty.fsb.dao.daoDb1.user.UserMapper;
import com.lty.fsb.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public Integer insertUser(@RequestBody User entity){
        return userMapper.insert(entity);

    }

}
