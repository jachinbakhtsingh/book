package com.book2.book2api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping( value="/hello")
    public String gethello(){
        return "Jesus loves you" +
                " this i know";
    }
}
