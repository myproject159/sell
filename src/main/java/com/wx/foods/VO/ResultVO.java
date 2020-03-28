package com.wx.foods.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author lwj
 * @date 2020/3/6 19:46
 */
@Data
public class ResultVO<T> {

    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
