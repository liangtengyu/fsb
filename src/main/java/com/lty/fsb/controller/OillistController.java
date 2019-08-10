package com.lty.fsb.controller;


import com.lty.fsb.dao.OillistMapper;
import com.lty.fsb.entity.Oillist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lty
 * @since 2019-08-10
 */
@RestController
@RequestMapping("/oil")
public class OillistController {

@Autowired
OillistMapper oillistMapper;

@RequestMapping("select")
 //第二数据源测试实例
    public int select(){
    int oillist = oillistMapper.insert(new Oillist("name"));
    return oillist;
}

}
