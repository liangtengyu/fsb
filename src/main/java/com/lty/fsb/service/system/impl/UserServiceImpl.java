package com.lty.fsb.service.system.impl;

import com.lty.fsb.entity.system.User;
import com.lty.fsb.dao.system.UserMapper;
import com.lty.fsb.service.system.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
