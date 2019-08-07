package com.lty.fsb.service.user.impl;

import com.lty.fsb.entity.user.User;
import com.lty.fsb.dao.daoDb1.user.UserMapper;
import com.lty.fsb.service.user.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
