package cj.test.feigin;

import cj.test.feigin.remote.FeignTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"cj.life.ability","cj.test.feigin"})
@EnableEurekaClient
@EnableFeignClients(basePackages = "cj.test.feigin.remote")
public class CjTestFeiginApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjTestFeiginApplication.class, args);
    }

}
