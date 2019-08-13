package com.lty.fsb.service.system.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.lty.fsb.entity.system.TUser;
import com.lty.fsb.dao.system.TUserMapper;
import com.lty.fsb.service.system.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
