package com.cc.exception.common;

import com.cc.constant.BizCode;
import com.cc.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_EXIST_ERROR)
public class DataExistException extends RuntimeException {

    public DataExistException(String message) {
        super(message);
    }

}
