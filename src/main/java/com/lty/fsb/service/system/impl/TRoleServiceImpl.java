package com.lty.fsb.service.system.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lty.fsb.entity.system.TRole;
import com.lty.fsb.dao.system.TRoleMapper;
import com.lty.fsb.service.system.ITRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
@Service
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements ITRoleService {
@Autowired
private TRoleMapper roleMapper;

    @Override
    public List<TRole> findUserRole(String userName) {
         return  roleMapper.findUserRole(userName);

    }
}
