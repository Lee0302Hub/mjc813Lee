package com.spacrud.swimpool_app.swimpool.common;

public enum ResponseEnum {
    Success(0),
    SelFail(-10),
    InsFail(-20),
    ModFail(-30),
    DelFail(-40);
    private final Integer code;

    ResponseEnum(Integer code) {
        this.code = code;
    }
    public Integer getCode() {
        return this.code;
    }
}
