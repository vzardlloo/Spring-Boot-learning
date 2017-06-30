package org.vzard.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by V-zar on 2017/6/28.
 */

@RestController
public class HelloWorldController {
    @RequestMapping
    public String sayHello(){
        return "HelloWorld";
    }

}
