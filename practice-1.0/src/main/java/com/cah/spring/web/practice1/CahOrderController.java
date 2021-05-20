package com.cah.spring.web.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cash.service.practice1.ICahOrderService;

@Controller
public class CahOrderController {
	@Autowired
	ICahOrderService cahOrderService;

	@RequestMapping("/createOrder")
	public @ResponseBody String createOrder() {
		return cahOrderService.createOrder();
		
	}
	@RequestMapping("/updateOrder")
	public @ResponseBody String updateOrder() {
		return cahOrderService.updateOrder();
	}
	@RequestMapping("/deleteOrder")
	public @ResponseBody String deleteOrder() {
		return cahOrderService.deleteOrder();
	}

}