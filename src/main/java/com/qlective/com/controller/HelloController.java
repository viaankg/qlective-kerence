package com.qlective.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by testmac on 1/8/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String greetMe(){
        return "Qlective Kerence is best in the market"!!
    }

}
