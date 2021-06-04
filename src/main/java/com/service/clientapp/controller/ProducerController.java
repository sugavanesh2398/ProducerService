package com.service.clientapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProducerController {
    @RequestMapping(method = RequestMethod.GET,path = "/getproducts")
    public String getProductList(){
        return "Hey there!, Here is your product lsit";
    }
}
