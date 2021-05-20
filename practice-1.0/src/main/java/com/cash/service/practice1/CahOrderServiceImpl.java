package com.cash.service.practice1;

import org.springframework.stereotype.Service;

@Service
public class CahOrderServiceImpl implements ICahOrderService{

	@Override
	public String createOrder() {
		return "Order created";
	}

	@Override
	public String updateOrder() {
		return "Order updated";
	}

	@Override
	public String deleteOrder() {
		return "Order deleted";
	}

}
