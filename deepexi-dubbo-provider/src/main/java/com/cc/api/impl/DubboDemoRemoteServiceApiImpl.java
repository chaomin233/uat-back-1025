package com.cc.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cc.api.DubboDemoRemoteServiceApi;
import com.cc.api.model.PageDemo;
import com.cc.api.model.dto.DubboDemoDTO;
import com.cc.api.model.query.DubboDemoQuery;
import com.cc.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0")
public class DubboDemoRemoteServiceApiImpl implements DubboDemoRemoteServiceApi {

    @Autowired
    DubboDemoService service;

    @Override
    public PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query) {
        return service.listPage(query);
    }

    @Override
    public DubboDemoDTO get(String id) {
        return service.get(id);
    }

}
