package com.cloud.user.exception;

import lombok.Getter;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 自定义业务异常
 */
@Getter
public class BizException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private final int code;

    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream s) {
        printStackTrace(new PrintWriter(s));
    }

    public void printStackTrace(PrintWriter s) {
        System.out.println("bizException=====>>" + this + super.getMessage());
    }
}
