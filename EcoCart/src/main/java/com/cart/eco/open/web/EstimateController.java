package com.cart.eco.open.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.open.service.EstimateService;
import com.cart.eco.open.service.EstimateVO;
import com.cart.eco.open.service.OrdersService;


@Controller
public class EstimateController {
	
	@Autowired
	EstimateService estimateService;
	
	
	
	
	//견적 페이지 보여주는거 (+전체조회)
	@GetMapping("/estimate")
	public String Estimate(EstimateVO vo) {
		
		return "open/estimate";
	}
	
	//견적 조건 조회 페이지 보여주는거
	@GetMapping("/listEstimate")
	@ResponseBody
	public List<EstimateVO> listEstimate(){
		
		return estimateService.selectEstimateList();
		
	}
	
	//tr누르면 상세 조회
	@GetMapping("/listEstimated")
	@ResponseBody
	public List<Map<String, Object>> listEstimated(String estmtCode){
//		System.out.println(estmtCode);
		
		Object a = estimateService.EstimateDList(estmtCode);
		System.out.println(a);
//		Map<String, Object>map =new HashMap<String, Object>();
		return estimateService.EstimateDList(estmtCode);
		
	}
	
	
//	@GetMapping("/estimate")
//	public String insertEstimate(Model model) {
//		return estimateService.insertEstimate();
//		
//	}
	
//	//셀렉트박스에 db 값 불러오기
//	@GetMapping("/estimate")
//	public void selectBox(Model model) {
//		model.addAttribute("selectList",estimateService.selectBox());
//	}
//	
	
	
	//주문
	@GetMapping("/order")
	public String Order() {
		return "open/order";
	}
	
	//주문마감
	@GetMapping("/orderCan")
	public String OrderCan() {
		return "open/orderCan";
	}
	
	//출고요청1
	@GetMapping("/deliveryQ")
	public String deliveryQ() {
		return "open/deliveryQ";
	}
	
	//출고등록2
	@GetMapping("/deliveryG")
	public String deliveryG() {
		return "open/deliveryG";
	}
	
	//출고처리3
	@GetMapping("/deliveryPro")
	public String deliveryPro() {
		return "open/deliveryPro";
	}
	
	//재고/bom현황
	@GetMapping("/proBom")
	public String proBom() {
		return "open/proBom";
	}

	//배송정보
	@GetMapping("/deliveryInfo")
	public String deliveryInfo() {
		return "open/deliveryInfo";
	}
	
	
	
	
}
