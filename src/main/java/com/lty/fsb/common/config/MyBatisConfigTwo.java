package com.lty.fsb.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * create by  lty
 * on  2019-04-28  16:10
 */
@Configuration
@MapperScan(value = "com.lty.fsb.dao.daoDb2.**",sqlSessionFactoryRef = "sqlSessionFactoryBean2")
public class MyBatisConfigTwo {
    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;
    @Bean
    SqlSessionFactory sqlSessionFactoryBean2() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dsTwo);
        Resource[] resources = new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapping/Db2/*/*.xml");

        sqlSessionFactoryBean.setMapperLocations(resources);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        return  new SqlSessionTemplate(sqlSessionFactoryBean2());
    }
}
