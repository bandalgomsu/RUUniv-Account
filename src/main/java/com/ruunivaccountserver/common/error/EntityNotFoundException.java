package com.ruunivaccountserver.common.error;

public class EntityNotFoundException extends BusinessException {
    
    public EntityNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
