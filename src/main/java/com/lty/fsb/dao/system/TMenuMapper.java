package com.lty.fsb.dao.system;

import com.lty.fsb.entity.system.TMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
public interface TMenuMapper extends BaseMapper<TMenu> {

    List<TMenu> findUserPermissions(String userName);
}
