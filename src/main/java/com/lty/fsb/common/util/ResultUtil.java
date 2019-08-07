package com.lty.fsb.common.util;


public class ResultUtil {

    public static String REQUESTFAILD = "request faild";  //请求失败


    /**
     * 请求成功
     * @param data
     * @return
     */
    public static Result
    requestSuccess(String data) throws Exception{
        Result result = new Result();
        result.setCode("00");
        result.setMsg("request success");
        if(data==null|| "".equals(data)){
            result.setData("");
        }
        return  result;
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static Result requestSuccess(String data,String msg) throws Exception{
        Result result = new Result();
        result.setCode("00");
        if(msg==null||"".equals(msg)){
            result.setMsg("request success");
        }else{
            result.setMsg(msg);
        }
        if(data==null|| "".equals(data)){
            result.setData("");
        }
        return  result;
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static Result requestSuccess(String data,String msg,String code) throws Exception{
        Result result = new Result();
        if(code==null||"".equals(code)){
            result.setCode("00");
        }else{
            result.setCode(code);
        }
        if(msg==null||"".equals(msg)){
            result.setMsg("request success");
        }else{
            result.setMsg(msg);
        }
        if(data==null|| "".equals(data)){
            result.setData("");
        }
        return  result;
    }

    /**
     * 请求成功
     * @param
     * @return
     */
    public static Result success(Object o){
        Result result = new Result();
        result.setCode("00");
        result.setMsg("request success");
        result.setData(o);
        return  result;
    }

    /**
     * 请求失败
     * @return
     */
    public static  Result requestFaild(String msg){
        Result result = new Result();
        result.setCode("-1");
        result.setData(null);
        if(msg==null||"".equals(msg)){
            result.setMsg(REQUESTFAILD);
        }else{
            result.setMsg(msg);
        }
        return  result;
    }


    /**
     * 请求失败
     * @return
     */
    public static  Result requestFaild(String msg,String code){
        Result result = new Result();
        result.setData(null);
        if(msg==null||"".equals(msg)){
            result.setCode("-1");
        }else{
            result.setCode(code);
        }
        if(msg==null||"".equals(msg)){
            result.setMsg(REQUESTFAILD);
        }else{
            result.setMsg(msg);
        }
        return  result;
    }

    /**
     * 请求失败
     * @return
     */
    public static  Result requestFaild(String data,String msg,String code){
        Result result = new Result();
        if(data==null||"".equals(data)){
            result.setData(null);
        }else{
            result.setData(data);
        }
        if(msg==null||"".equals(msg)){
            result.setCode("-1");
        }else{
            result.setCode(code);
        }
        if(msg==null||"".equals(msg)){
            result.setMsg(REQUESTFAILD);
        }else{
            result.setMsg(msg);
        }
        return  result;
    }




}
