package com.lty.fsb.service.system.impl;

import com.lty.fsb.entity.system.TMenu;
import com.lty.fsb.dao.system.TMenuMapper;
import com.lty.fsb.service.system.ITMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author lty
 * @since 2019-08-13
 */
@Service
public class TMenuServiceImpl extends ServiceImpl<TMenuMapper, TMenu> implements ITMenuService {
        @Autowired
        private  TMenuMapper menuMapper;
    @Override
    public List<TMenu> findUserPermissions(String userName) {
       return menuMapper.findUserPermissions(userName);


    }
}
