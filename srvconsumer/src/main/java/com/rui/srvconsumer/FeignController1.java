package com.rui.srvconsumer;


import com.rui.iprovider.IController1;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SrvProvider")
public interface FeignController1 extends IController1 {

}
