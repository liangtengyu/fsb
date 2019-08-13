package com.lty.fsb.dao.system;

import com.lty.fsb.entity.system.TRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
public interface TRoleMapper extends BaseMapper<TRole> {

    List<TRole> findUserRole(String userName);

}
