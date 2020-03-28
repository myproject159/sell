package com.wx.foods.dto;

import lombok.Data;

/**
 * @author lwj
 * @date 2020/3/21 14:29
 */
@Data
public class CartDTO {

    /**商品Id*/
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
