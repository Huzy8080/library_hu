package com.hotmail.huzy8080.library_hu.异常;

public enum Result {

    SUCCESS("0000","success!"),
    ERROR("9999","error!")
    ;
    private final String code;
    private final String message;

    Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
