package com.lty.fsb.service.system;

import com.lty.fsb.entity.system.TMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
public interface ITMenuService extends IService<TMenu> {

    List<TMenu> findUserPermissions(String userName);

}
