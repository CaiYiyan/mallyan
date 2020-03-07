package com.yan.mallyan.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by yan on 2020/03/07.
 */
@Configuration
@MapperScan("com.yan.mallyan.tiny.mbg.mapper")
public class MyBatisConfig {
}
