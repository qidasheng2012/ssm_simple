package com.ssm.common.page;

import lombok.Data;

/**
 * 分页bean
 * @author qp
 * @date 2019/4/26 15:03
 */
@Data
public class PageBean {
    // 当前页数,默认为第一页
    private Integer page = 1;
    // 要查询的记录数，默认一次查询10条记录
    private Integer size = 10;
}
