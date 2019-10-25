package com.cc.exception.common;

import com.cc.constant.BizCode;
import com.cc.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_PERMISSION_ERROR)
public class DataPermissionException extends RuntimeException {

    public DataPermissionException(String message) {
        super(message);
    }

}
