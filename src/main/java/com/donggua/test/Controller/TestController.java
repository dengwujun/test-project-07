package com.donggua.test.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "getSomething/{id}")
    public String getSomething(@PathVariable String id) {


        return "success:" + id;
    }

}
