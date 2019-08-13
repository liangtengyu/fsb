package com.lty.fsb.service.system.impl;

import com.lty.fsb.entity.system.TUserRole;
import com.lty.fsb.dao.system.TUserRoleMapper;
import com.lty.fsb.service.system.ITUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
@Service
public class TUserRoleServiceImpl extends ServiceImpl<TUserRoleMapper, TUserRole> implements ITUserRoleService {

}
