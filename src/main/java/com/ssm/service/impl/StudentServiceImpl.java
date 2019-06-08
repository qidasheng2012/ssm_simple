package com.ssm.service.impl;

import com.ssm.common.enums.CodeEnum;
import com.ssm.common.exception.BusinessException;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public void test() {
        throw new BusinessException(CodeEnum.PARAM_NULL.getCode(), CodeEnum.PARAM_NULL.getMsg());
    }

}
