package com.boot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    public String getUrName() {
        return "I am is are spiderman";
    }
}
