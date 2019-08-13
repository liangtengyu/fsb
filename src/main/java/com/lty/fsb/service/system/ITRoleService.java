package com.lty.fsb.service.system;

import com.lty.fsb.entity.system.TRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
public interface ITRoleService extends IService<TRole> {

    List<TRole> findUserRole(String userName);
}
