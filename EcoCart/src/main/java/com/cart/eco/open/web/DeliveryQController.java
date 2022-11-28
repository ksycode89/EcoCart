package com.cart.eco.open.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.service.DeliveryGDVO;
import com.cart.eco.open.service.DeliveryGVO;
import com.cart.eco.open.service.DeliveryProVO;
import com.cart.eco.open.service.DeliveryQDVO;
import com.cart.eco.open.service.DeliveryQService;
import com.cart.eco.open.service.DeliveryQVO;
import com.cart.eco.open.service.OrderDVO;

@Controller
public class DeliveryQController {

	@Autowired
	DeliveryQService deliverQService;
	
	//출고요청Q
	
	//출고요청1
	@GetMapping("/deliveryQ")
	public String deliveryQ(Model model) {
		model.addAttribute("proCode",deliverQService.selectProCode());
		model.addAttribute("clientName",deliverQService.selectClientName());
		model.addAttribute("emp",deliverQService.selectEmp());
		model.addAttribute("orderCode",deliverQService.selectOrderCode());
		
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
	
	//출고요청번호 가져오기
	@GetMapping("/getDlivyQCode")
	@ResponseBody
	public List<DeliveryQVO> getDelivyQCode(DeliveryQVO vo) {
			
		deliverQService.getDlivyQCode();
			
			
		return deliverQService.getDlivyQCode();
			
	}
	
	//출고요청 등록하기
	@PostMapping("/insertDlivyQ")
	@ResponseBody
	public int insertDlivyQ(@RequestBody List<DeliveryQVO> vo) {
		System.out.println("---------------------------------");
		
		return deliverQService.insertDlivyQ(vo);
	}
	
	//출고요청 등록하기
	@PostMapping("/insertDlivyQD")
	@ResponseBody
	public int insertDlivyQD(@RequestBody List<DeliveryQDVO> vo) {
		
		
		return deliverQService.insertDlivyQD(vo);
	}
	
	//출고요청시 주문서 남품수량 update
	@PostMapping("/updateOrderNum")
	@ResponseBody
	public int updateOrderNum(@RequestBody List<OrderDVO> vo) {
		
		return deliverQService.updateOrderNum(vo);
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	//출고등록G
	
	//출고등록2
	@GetMapping("/deliveryG")
	public String deliveryG(Model model) {
		model.addAttribute("deliveryQ",deliverQService.selectDeliveryQ());
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

	//모달창 출고요청  조회
	@GetMapping("/MdeliveryQList")
	@ResponseBody
	public List<DeliveryQVO> MdeliveryQList(DeliveryQVO vo){
		
		return deliverQService.MdeliveryQList();
	}
	
	//모달창 출고요청 코드 조회
	@GetMapping("/MdeliveryQListD")
	@ResponseBody
	public List<Map<String,Object>> MdeliveryQListD(String dlivyCode){
		
		return deliverQService.MdeliveryQListD(dlivyCode);
	}
		
	
	//출고등록번호 가져오기
	@GetMapping("/getDlivyGCode")
	@ResponseBody
	public List<DeliveryGVO> getDelivyGCode(DeliveryGVO vo) {
			
		deliverQService.getDlivyGCode();
			
			
		return deliverQService.getDlivyGCode();
			
	}
	
	
	
	//출고등록 등록하기
	@PostMapping("/insertDlivyG")
	@ResponseBody
	public int insertDlivyG(@RequestBody List<DeliveryGVO> vo) {
		
		return deliverQService.insertDlivyG(vo);
	}
	
	//출고등록 등록하기
	@PostMapping("/insertDlivyGD")
	@ResponseBody
	public int insertDlivyGD(@RequestBody List<DeliveryGDVO> vo) {
		
		return deliverQService.insertDlivyGD(vo);
	}
	
	//출고요청 상태 없데이트 하기
	@PostMapping("/updateQst")
	@ResponseBody
	public int updateQst(@RequestBody List<DeliveryQVO> vo) {
		
		return deliverQService.updateQst(vo);
		
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	//출고처리
	
	//출고처리3
	@GetMapping("/deliveryPro")
	public String deliveryPro(Model model) {
		model.addAttribute("deliveryG",deliverQService.selectDeliveryG());
		return "open/deliveryPro";
	}
	
	//출고등록 전체 조회
	@GetMapping("listDeliveryPro")
	@ResponseBody
	public List<DeliveryProVO> listDeliveryPro(DeliveryProVO vo){
		
		return deliverQService.DeliveryPList();
	}	
	
	//모달창 출고등록  조회
	@GetMapping("/MdeliveryGList")
	@ResponseBody
	public List<DeliveryQVO> MdeliveryGList(String dlivyCode){
		
		return deliverQService.MdeliveryGList(dlivyCode);
	}
	
	//모달창 출고요청 코드 조회
	@GetMapping("/MdeliveryGListD")
	@ResponseBody
	public List<Map<String,Object>> MdeliveryGListD(String dlivyCode){
		
		return deliverQService.MdeliveryGListD(dlivyCode);
	}
	
	//출고처리번호 가져오기
	@GetMapping("/getDlivyPCode")
	@ResponseBody
	public List<DeliveryProVO> getDelivyPCode(DeliveryProVO vo) {
			
		deliverQService.getDlivytPCode();
			
		return deliverQService.getDlivytPCode();
			
	}
	
	//출고처리 등록하기
	@PostMapping("/insertDlivyP")
	@ResponseBody
	public int insertDlivyP(@RequestBody List<DeliveryProVO> vo) {
		
		return deliverQService.insertDlivyP(vo);
	}
	
	
	

	///////////////////////////////////////////////////////////////////////////////
	
	//배송정보
	@GetMapping("/deliveryInfo")
	public String deliveryInfo(Model model) {
		model.addAttribute("deliveryPro",deliverQService.selectDeliveryP());
		model.addAttribute("proCode",deliverQService.selectProCode());
		model.addAttribute("clientName",deliverQService.selectClientName());
		model.addAttribute("emp",deliverQService.selectEmp());
		return "open/deliveryInfo";
	}	
	
	//배송정보 전체 조회
	@GetMapping("listDeliveryProInfo")
	@ResponseBody
	public List<DeliveryProVO> listDeliverInfo(DeliveryProVO vo){
		
		return deliverQService.DeliveryInfoList();
	}		
	
	//배송정보 등록하기
	@PostMapping("/updateInfo")
	@ResponseBody
	public int updateInfo(@RequestBody DeliveryProVO vo) {
		
		return deliverQService.updateInfo(vo);
	}
	
	
	//재고/bom현황
	@GetMapping("/proBom")
	public String proBom(Model model) {
		model.addAttribute("proCode",deliverQService.selectProCode());
		model.addAttribute("bomCode",deliverQService.selectBom());
		
		
		
		return "open/proBom";
	}
	
	
	//제품 재고 현황
	@GetMapping("/productList")
	@ResponseBody
	public List<ProductVO> proList(ProductVO vo){
		
		return deliverQService.productList();
		
	}
	
	//bom 수급현황
	@GetMapping("/bomList")
	@ResponseBody
	public List<Map<String,Object>> bomList(String proCode){
		System.out.println("dd");
		return deliverQService.bomList(proCode);
				
	}	
	
	
}
