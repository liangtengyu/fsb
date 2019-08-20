package com.lty.fsb.service.system.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lty.fsb.common.util.MD5Util;
import com.lty.fsb.common.util.Result;
import com.lty.fsb.common.util.ResultUtil;
import com.lty.fsb.entity.system.TUser;
import com.lty.fsb.dao.system.TUserMapper;
import com.lty.fsb.service.system.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDateTime;

import static org.apache.shiro.SecurityUtils.getSubject;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

    @Autowired
    private TUserMapper mapper;
    @Override
    public TUser findByName(String userName) {
        TUser user = mapper.selectOne(new QueryWrapper<TUser>()
                .eq("username", userName));
    return user;
    }

    @Override
    public Result insertOneUser(String Data) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(Data);
        String username = (String) jsonObject.get("username");
        String password = (String) jsonObject.get("password");
        String encrypt = MD5Util.encrypt(username, password);
        TUser user = new TUser();
        user.setUsername(username);
        user.setPassword(encrypt);


        user.setCreateTime(LocalDateTime.now());
        int insert = mapper.insert(user);
        if (insert>=1) {

            UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);
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
        return ResultUtil.failed("插入用户失败",-1) ;
    }
}
