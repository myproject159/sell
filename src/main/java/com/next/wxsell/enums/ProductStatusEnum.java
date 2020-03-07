package com.next.wxsell.enums;

import lombok.Getter;

/**
 * @author lwj
 * @date 2020/3/4 17:42
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
