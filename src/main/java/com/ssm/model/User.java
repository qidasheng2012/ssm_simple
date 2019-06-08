package com.ssm.model;

import com.ssm.common.bean.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 * @author qp
 * @date 2019/4/12 9:59
 */
@Data
public class User extends PageBean implements Serializable {
    private static final long serialVersionUID = 7611490901783856349L;

    private Integer id;
    private String name;
    private Integer age;
}
