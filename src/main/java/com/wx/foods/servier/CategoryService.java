package com.wx.foods.servier;

import com.wx.foods.dataobject.ProductCategory;

import java.util.List;

/**
 * @author lwj
 * @date 2020/3/4 14:06
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
