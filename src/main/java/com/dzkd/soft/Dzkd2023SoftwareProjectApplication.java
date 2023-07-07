package com.dzkd.soft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzkd.soft.mapper")
public class Dzkd2023SoftwareProjectApplication {   // 微服务的启动入口

    public static void main(String[] args) {
        SpringApplication.run(Dzkd2023SoftwareProjectApplication.class, args);
    }

}
