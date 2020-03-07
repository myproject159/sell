package com.next.wxsell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwj
 * @date 2020/3/3 14:59
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello ";
    }
}
