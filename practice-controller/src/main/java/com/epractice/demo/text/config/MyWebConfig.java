package com.epractice.demo.text.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义一个配置类，mapper 扫描也可在此写上
 */
@Configuration
@MapperScan("com.epractice.demo.text.mapper")
public class MyWebConfig {
    /**
     * 分页插件
     * @return 分页插件的实例
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 乐观锁插件
     * @return 乐观锁插件的实例
     * 在数据表中增加一个 version 字段。
     * 　　取数据时，获取该字段，更新时以该字段为条件进行处理（即set version = newVersion where version = oldVersion），若 version 相同，则更新成功（给新 version 赋一个值，一般加 1）。若 version 不同，则更新失败，可以重新尝试更新操作。
     */
//    @Bean
//    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
//        return new OptimisticLockerInterceptor();
//    }
}
