package com.cc.exception.common;

import com.cc.constant.BizCode;
import com.cc.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }

}
