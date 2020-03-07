package com.next.wxsell.servier;

import com.next.wxsell.dataobject.ProductCategory;

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
