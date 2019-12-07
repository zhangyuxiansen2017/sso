package cn.zhangguimin.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author Mr. Zhang
 * @date 2019-04-02 10:34
 * @website https://www.zhangguimin.cn
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClientApplication02 {

    @GetMapping(value = "/user")
    public Authentication user(Authentication user){
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClientApplication02.class,args);
    }
}