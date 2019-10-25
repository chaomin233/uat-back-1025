package com.cc.service;

import com.cc.api.model.PageDemo;
import com.cc.api.model.dto.DubboDemoDTO;
import com.cc.api.model.query.DubboDemoQuery;

public interface DubboDemoService {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
