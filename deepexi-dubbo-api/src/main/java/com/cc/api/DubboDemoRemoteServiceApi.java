package com.cc.api;

import com.cc.api.model.PageDemo;
import com.cc.api.model.dto.DubboDemoDTO;
import com.cc.api.model.query.DubboDemoQuery;

public interface DubboDemoRemoteServiceApi {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
