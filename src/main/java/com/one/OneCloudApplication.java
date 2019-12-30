package com.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *
 * </p>
 *
 * @author wangzhaozhou
 * @date 2019/12/30
 */
@SpringBootApplication
/**
 *当前使用eureka的server
 */
@EnableEurekaServer
public class OneCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneCloudApplication.class, args);
    }

}
