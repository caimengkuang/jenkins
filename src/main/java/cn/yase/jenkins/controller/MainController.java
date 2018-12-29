package cn.yase.jenkins.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yase
 * @create 2018-12-28
 */
@RestController
public class MainController {

    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/test")
    public String test(String message){
        logger.info("message : {} "+message);
        return message;
    }

}
