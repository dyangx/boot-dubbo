package com.boot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.api.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getUrName() {
        return "I am is are spiderman";
    }
}
