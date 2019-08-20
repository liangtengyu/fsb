/*
package com.lty.fsb.common.exception;


import com.lty.fsb.common.util.ResultUtil;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               HttpServletResponse response, Exception e) throws MyException{
        String message = e.getMessage();
        return ResultUtil.failed("报错了  " + message, "-1");
    }
}
*/
