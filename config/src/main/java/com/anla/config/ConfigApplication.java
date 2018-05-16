/**
 * @user junbao
 * @time 18-5-14 下午11:55
 */
package com.anla.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class,args);
    }
}
