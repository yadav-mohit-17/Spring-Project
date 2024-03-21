package com.swiggy.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.order.entity.SwiggyOrder;

@Repository
public interface OrderRepository extends JpaRepository<SwiggyOrder, String>{
	
	List<SwiggyOrder> findByEmailIdAndOrderStatus(String emailId,String orderStatus);
}
