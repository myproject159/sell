package com.wx.foods.exception;

import com.wx.foods.enums.ResultEnum;

/**
 * @author lwj
 * @date 2020/3/21 10:33
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
