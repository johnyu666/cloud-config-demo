package cn.johnyu.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value(value = "${company.address}")
    private String address;

    @Value(value = "${spring.datasource.url}")
    private String url;
    @GetMapping(value = "/test1")
    public String test1(){
        return "address: "+address+"..."+url;
    }
}
