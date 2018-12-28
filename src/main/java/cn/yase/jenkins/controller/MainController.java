package cn.yase.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yase
 * @create 2018-12-28
 */
@RestController
public class MainController {

    @GetMapping("/test")
    public String test(String message){
        return message;
    }

}
