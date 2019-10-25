package com.cc.service.impl;

import com.cc.model.dto.DemoDTO;
import com.cc.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "welcome!";
    }

    @Override
    public DemoDTO get() {
        return new DemoDTO("1","demo","demo-desc");
    }

}
