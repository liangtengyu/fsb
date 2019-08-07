package com.lty.fsb.dao.daoDb2.oil;

import com.lty.fsb.entity.oil.Oillist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lty.fsb.entity.user.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
public interface OillistMapper extends BaseMapper<Oillist> {

    int insert(User entity);
}
