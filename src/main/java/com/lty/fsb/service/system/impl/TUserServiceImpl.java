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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
    public Result insertOneUser(String Data)  {
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
            return ResultUtil.success("插入用户成功");
        }
        return ResultUtil.failed("插入用户失败",-1) ;
    }
}
