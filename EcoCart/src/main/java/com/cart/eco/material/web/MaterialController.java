package com.cart.eco.material.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.material.service.ModerReqVO;
import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;
import com.cart.eco.material.service.MreleDetailVO;
import com.cart.eco.material.service.MreleService;
import com.cart.eco.material.service.MreleaseVO;
import com.cart.eco.material.service.OrderService;
import com.cart.eco.material.service.ReDetailVO;
import com.cart.eco.material.service.ReceivingVO;

import groovyjarjarpicocli.CommandLine.Parameters;

@Controller
public class MaterialController {
	
	@Autowired
	MorderService morder;
	@Autowired
	OrderService orderSe;
	@Autowired
	MreleService mrele;
	
	@GetMapping("/materialList")
	public String materialList() {
		
		return "material/materialList";
	}
	
	@GetMapping("materialListInfo")
	@ResponseBody
	public List<MorderVO> materialListInfo() {
		return morder.selectOrderList();
	}
	
	//발주 Order목록 가져오는거
	@GetMapping("detailList")
	@ResponseBody
	public List<MorderdetailVO> detailList(MorderVO morderVO) {
		return morder.detailList(morderVO);
	}
	
	//발주등록페이지 이동
	@GetMapping("/materialinsert")
	public String materialInsert() {
		return "material/materialinsert";
	}
	
	//발주 등록
	@PostMapping("/insertOrderCh")
	@ResponseBody
	public int materialInsertInfo(@RequestBody ModerReqVO morderVO) {
		System.out.println(morderVO);
		return morder.insertOrder(morderVO);
	}
	
	//발주등록 목록 가져오기
	@GetMapping("/proInfo")
	@ResponseBody
	public List<MorderVO> proInfo(MorderVO morderVO) {
		return morder.proInfo(morderVO);
	}	
	//삭제
	@PostMapping("/deleteInfo")
	@ResponseBody
	public String delteInfo(@RequestBody List<MorderVO> morderVO) {
		return morder.deleteOrder(morderVO);
	}	

	@GetMapping("/materialreta")
	public String materialReta() {
		return "material/materialreta";
	}
	
	//입고검사페이지
	@GetMapping("/Wearingtest")
	public String WearingTest() {
		return "material/Wearingtest";
	}
	
	//입고현황
	@GetMapping("/WearingList")
	public String selectOrList(Model mo) {
		//발주번호가져오기 
		mo.addAttribute("orderList",morder.getOrderGroup("og-co"));
		return "material/WearingList";
	}
	
	@GetMapping("/releaseList")
	public String ReleaseList() {
		return "/material/releaseList";
	}
	
	//출고현황
	@GetMapping("/selectMrList")
	@ResponseBody
	public List<MreleaseVO> selectMrList() {
		return mrele.selectMrList();
	}
	
	//출고상세
	@GetMapping("/dataList")
	@ResponseBody
	public List<MreleDetailVO> dataList(MreleaseVO mrelea) {
		return mrele.dataList(mrelea);
	}
	
	@GetMapping("/release")
	public String Release() {
		return "material/release";
	}

	
	@GetMapping("/receivingList")
	public String ReceivingList() {
		return "material/receivingList";
	}
	
	@GetMapping("/badproduct")
	public String Badproduct() {
		return "material/badproduct";
	}
	
	@GetMapping("/matmove")
	public String Matmove() {
		return "material/matmove";
	}
	
	@GetMapping("/matment")
	public String Matment() {
		return "material/matment";
	}
	/////////////////////////////////////////////////commitOrder
	//확정
	@PostMapping("/commitOrder")
	@ResponseBody
	public int commitOrder(@RequestBody List<Integer> list  ) {
		System.out.println(list);
		return morder.commitOrder(list);
	}	
	
	@GetMapping("/searchOrder")
	@ResponseBody
	public List<MorderVO> searchOrder(int orderNo) {
		System.out.println("orderNo"+orderNo);
		return  morder.searchOrder(orderNo);
	}
	//입고마스터 
	@PostMapping("/insertReceiving")
	@ResponseBody
	public ReceivingVO insertReceiving(ReceivingVO vo) {
		System.out.println(vo);
		return morder.insertReceiving(vo);
	}	
	//입고상세
	@PostMapping("/insertReceivingD")
	@ResponseBody
	public int insertReceivingD(@RequestBody List<ReDetailVO> vo) {
		System.out.println("insertReceivingD"+vo);
		return morder.insertReceivingD(vo);
	}	
	//발주진행가져오기 
	@GetMapping("/orderWT")
	@ResponseBody
	public List<MorderVO> orderWT(String orderNo) {
		System.out.println("orderNo"+orderNo);
		return  morder.getOrderGroup(orderNo);
	}
	//확정
		@PostMapping("/OrderCancel")
		@ResponseBody
		public int OrderCancel(@RequestBody List<Integer> list  ) {
			System.out.println(list);
			return morder.OrderCancel(list);
		}	
		//확정
		@GetMapping("/getCoOrder")
		@ResponseBody
		public  List<MorderVO>  getCoOrder() {
			
			return morder.getCoOrder();
		}	
		
}
