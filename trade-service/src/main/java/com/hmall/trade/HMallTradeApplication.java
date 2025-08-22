package com.hmall.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hmall.trade.mapper")
@SpringBootApplication
public class HMallTradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HMallTradeApplication.class, args);
    }
}