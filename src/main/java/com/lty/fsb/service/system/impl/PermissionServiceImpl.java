package com.lty.fsb.service.system.impl;

import com.lty.fsb.entity.system.Permission;
import com.lty.fsb.dao.system.PermissionMapper;
import com.lty.fsb.service.system.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-10
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
