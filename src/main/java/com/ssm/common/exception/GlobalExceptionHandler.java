package com.ssm.common.exception;

import com.ssm.common.enums.CodeEnum;
import com.ssm.common.bean.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author qp
 * @date 2019/4/12 10:10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultBean jsonErrorHandler(Exception e) {
        ResultBean res = ResultBean.builder().build();

        if (e instanceof BusinessException) {
            res.setCode(((BusinessException) e).getCode());
            res.setMsg(e.getMessage());
        } else {
            res.setCode(CodeEnum.SYS_ERROR.getCode());
            res.setMsg(CodeEnum.SYS_ERROR.getMsg());
        }

        return res;
    }
}
