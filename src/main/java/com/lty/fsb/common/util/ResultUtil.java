package com.lty.fsb.common.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultUtil {
    private static Logger logger = LoggerFactory.getLogger(ResultUtil.class);
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        logger.info("成功结果>>>>>> \n"+object.toString());
        return result;
    }
    public static Result success(String msg){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        logger.info("成功结果>>>>>> \n"+msg);
        return result;
    }
    public static Result success(String msg,Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        result.setData(object);
        logger.info("成功结果>>>>>> \n"+msg+object.toString());
        return result;
    }

    public static Result failed(String msg){
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(msg);
        logger.info("返回失败原因>>>>>> \n"+msg);
        return result;
    }
    public static Result failed(String msg,Object o){
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(msg);
        result.setData(o);
        logger.info("返回失败原因>>>>>> :"+msg+o.toString());
        return result;
    }

    public static Result success(){
        return success("");
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
