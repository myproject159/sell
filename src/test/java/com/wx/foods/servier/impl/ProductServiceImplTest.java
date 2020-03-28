package com.wx.foods.servier.impl;



import com.wx.foods.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lwj
 * @date 2020/3/4 20:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertNotEquals(0,productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = PageRequest.of(0, 5);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(5);
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("http://aaaa.jpg");
        productInfo.setProductDescription("哈哈哈啊");
        productInfo.setProductStock(99);
        productInfo.setProductPrice(new BigDecimal(10));
        productInfo.setProductName("牛肉面");
        productInfo.setProductId("23456");

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);

    }
}