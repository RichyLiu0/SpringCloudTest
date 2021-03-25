package com.rui.srvprovider;

import com.rui.iprovider.IController1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 implements IController1 {

    @Value("${server.port}")
    String port;

    public  String hello(String userName)
    {
        return  port+":hello," +userName;
    }
}
