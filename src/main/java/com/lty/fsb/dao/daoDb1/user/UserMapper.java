package com.lty.fsb.dao.daoDb1.user;

import com.lty.fsb.entity.user.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Override
    int insert(User entity);

    List<User>  selectAll();
}
