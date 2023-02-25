/*
 *@Project ：lvtt-mall
 *@Author  ：Levi_Bee
 *@Date    ：2023/2/24 3:03 下午
 */


package com.lvtt.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 * @author levi_bee
 */
@Configuration
@MapperScan("com.lvtt.mall.tiny.mbg.mapper")
public class MybatisConfig {
}
