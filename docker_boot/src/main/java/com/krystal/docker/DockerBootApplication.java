package com.krystal.docker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author krystal
 * @create 2023-09-05 21:51
 */
@SpringBootApplication
@MapperScan("com.krystal.docker.mapper")
public class DockerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class, args);
    }
}
