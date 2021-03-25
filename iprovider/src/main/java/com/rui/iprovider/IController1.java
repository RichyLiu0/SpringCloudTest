package com.rui.iprovider;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public interface IController1 {

    @RequestMapping(value = "/hello/{userName}")
    String hello(@PathVariable(value = "userName") String userName);


}
