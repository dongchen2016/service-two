package com.mdd.springboot2.controller.httpController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by madongdong on 2017/8/26.
 */
@RestController
public class HttpUrlConnectionController {

    @RequestMapping()
    public String index(String name){
        return "1234";
    }
}
