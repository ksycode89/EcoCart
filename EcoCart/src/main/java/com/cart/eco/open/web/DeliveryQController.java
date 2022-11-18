package com.cart.eco.open.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.open.service.DeliveryGVO;
import com.cart.eco.open.service.DeliveryProVO;
import com.cart.eco.open.service.DeliveryQService;
import com.cart.eco.open.service.DeliveryQVO;

@Controller
public class DeliveryQController {

	@Autowired
	DeliveryQService deliverQService;
	
	//출고요청Q
	
	//출고요청1
	@GetMapping("/deliveryQ")
	public String deliveryQ() {
		return "open/deliveryQ";
	}
	
	//전체조회
	@GetMapping("listDeliveryQ")
	@ResponseBody
	public List<DeliveryQVO> listDeliveryQ(DeliveryQVO vo){
		
		return deliverQService.DeliveryQList();
	}
	
	
	//tr누르면 상세 조회
	@GetMapping("/listDeliveryQd")
	@ResponseBody
	public List<Map<String,Object>> listDeliveryQD(String dlivyCode){
		
		return deliverQService.DeliveryQDList(dlivyCode);
				
	}
	
	
	/////////////////////////////////////////////////////////////////////////
	
	//출고등록G
	
	//출고등록2
	@GetMapping("/deliveryG")
	public String deliveryG() {
		return "open/deliveryG";
	}
	
	//출고등록 전체 조회
	@GetMapping("listDeliveryG")
	@ResponseBody
	public List<DeliveryGVO> listDeliveryG(DeliveryGVO vo){
		
		return deliverQService.DeliveryGList();
	}
	
	
	//tr누르면 상세 조회
	@GetMapping("/listDeliveryGd")
	@ResponseBody
	public List<Map<String,Object>> listDeliveryGD(String dlivyCode){
		
		return deliverQService.DeliveryGDList(dlivyCode);
				
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	//출고처리
	
	//출고처리3
	@GetMapping("/deliveryPro")
	public String deliveryPro() {
		return "open/deliveryPro";
	}
	
	//출고등록 전체 조회
	@GetMapping("listDeliveryPro")
	@ResponseBody
	public List<DeliveryProVO> listDeliveryPro(DeliveryProVO vo){
		
		return deliverQService.DeliveryPList();
	}	
	
	
	///////////////////////////////////////////////////////////////////////////////
	
	//배송정보
	@GetMapping("/deliveryInfo")
	public String deliveryInfo() {
		return "open/deliveryInfo";
	}	
	
	//배송정보 전체 조회
	@GetMapping("listDeliveryProInfo")
	@ResponseBody
	public List<DeliveryProVO> listDeliverInfo(DeliveryProVO vo){
		
		return deliverQService.DeliveryInfoList();
	}		
	
	
	
	
}
