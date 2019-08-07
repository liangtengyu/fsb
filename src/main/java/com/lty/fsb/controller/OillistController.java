package com.lty.fsb.controller;


import com.lty.fsb.dao.daoDb2.oil.OillistMapper;
import com.lty.fsb.entity.oil.Oillist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
@RestController
@RequestMapping("/oillist")
public class OillistController {
    @Autowired
    OillistMapper oillistMapper;
    @RequestMapping("/insert")
    public Integer insertUser(@RequestBody Oillist entity){
        return oillistMapper.insert(entity);

    }

}
