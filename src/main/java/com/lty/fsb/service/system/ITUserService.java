package com.lty.fsb.service.system;

import com.lty.fsb.entity.system.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
public interface ITUserService extends IService<TUser> {

    TUser findByName(String userName);
}
