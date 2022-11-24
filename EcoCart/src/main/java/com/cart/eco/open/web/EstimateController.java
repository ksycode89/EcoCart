package com.cart.eco.open.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.open.service.EstimateDVO;
import com.cart.eco.open.service.EstimateService;
import com.cart.eco.open.service.EstimateVO;
import com.fasterxml.jackson.annotation.JsonCreator;


@Controller
public class EstimateController {
	
	@Autowired
	EstimateService estimateService;

	
	//견적 페이지 보여주는거 (+전체조회)
	@GetMapping("/estimate")
	public String Estimate(EstimateVO vo, Model model) {
		//셀렉트 옵션에 제품코드 가져오기, 제품,  거래처명,
		model.addAttribute("proCode",estimateService.selectProCode());
		model.addAttribute("clientName",estimateService.selectClientName());
		
		
		Map<String, String> estmtPlusPro= new HashMap<>();
		
		//
//		String product[];
//		model.addAttribute("proCode",product[]);
//		
		
		
		

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
	
	//견적번호 가져오기
	@GetMapping("/getEstmtCode")
	@ResponseBody
	public List<EstimateVO> getEstmtCode(EstimateVO vo, Model model) {
		
		System.out.println("------------------------");
		estimateService.getEstmtCode();
		
		System.out.println(vo.getEstmtCode());
		
		
		return estimateService.getEstmtCode();
		
	}

	//견적서insert
	@PostMapping("/insertEstmt") 
	@ResponseBody
	@JsonCreator
	public EstimateVO insertEstmt (@RequestBody List<EstimateVO> vo) {
		
		EstimateVO a = vo.get(0);
		System.out.println(vo.get(0));
		estimateService.insertEstmt(a);
		System.out.println(a);
		System.out.println( a.getClass().getName()) ;
		
		System.out.println(	a.getEstmtCode());
			//System.out.println(vo.getEstmtCode() + "컨트롤러");
			//String pkCode = vo.getEstmtCode();
	
	 	return a;
	}
	

	
	
	//견적서 상세 insert
	@PostMapping("/insertEstmtD")
	@ResponseBody
	public int insertEstmtD( @RequestBody List<EstimateDVO> vo ) {
		
		return estimateService.insertEstmtD(vo);
	}


	//견적서 상태 update
	@PostMapping("/updateEstmtSt")
	@ResponseBody
	public int updateEstmtSt (@RequestBody List<EstimateVO> vo) {
		
		
		
		return estimateService.updateEstmtSt(vo); 
	}
	
	
	

	//주문
//	@GetMapping("/order")
//	public String Order() {
//		return "open/order";
//	}
	
//	//주문마감
//	@GetMapping("/orderCan")
//	public String OrderCan() {
//		return "open/orderCan";
//	}
//	
//	//출고요청1
//	@GetMapping("/deliveryQ")
//	public String deliveryQ() {
//		return "open/deliveryQ";
//	}
	
//	//출고등록2
//	@GetMapping("/deliveryG")
//	public String deliveryG() {
//		return "open/deliveryG";
//	}
	
//	//출고처리3
//	@GetMapping("/deliveryPro")
//	public String deliveryPro() {
//		return "open/deliveryPro";
//	}
	
//	//재고/bom현황
//	@GetMapping("/proBom")
//	public String proBom() {
//		return "open/proBom";
//	}

//	//배송정보
//	@GetMapping("/deliveryInfo")
//	public String deliveryInfo() {
//		return "open/deliveryInfo";
//	}
	
	
	
	
}
