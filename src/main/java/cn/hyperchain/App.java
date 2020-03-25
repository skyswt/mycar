package cn.hyperchain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("cn.hyperchain.dao")
@ServletComponentScan(basePackages = "cn.hyperchain.config")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
