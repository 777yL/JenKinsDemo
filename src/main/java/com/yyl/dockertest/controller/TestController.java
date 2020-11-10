package com.yyl.dockertest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/26 10:36
 */
@RestController
public class TestController {

    @PostMapping("/docker")
    public String testDocker(){
        return "Hello,JenKins"+ new Date();
    }

}
