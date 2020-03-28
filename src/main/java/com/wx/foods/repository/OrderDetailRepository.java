package com.wx.foods.repository;

import com.wx.foods.dataobject.OrderDetail;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author lwj
 * @date 2020/3/11 11:34
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
