package com.cart.eco.material.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.material.service.ModerReqVO;
import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;
import com.cart.eco.material.service.OrderCheckVO;
import com.cart.eco.material.service.OrderService;

@Controller
public class MaterialController {
	
	@Autowired
	MorderService morder;
	OrderService order;
	
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

	@GetMapping("/Wearingtest")
	public String WearingTest() {
		return "material/Wearingtest";
	}

	@GetMapping("/Wearingprocess")
	public String WearingProcess() {
		return "material/Wearingprocess";
	}

	@GetMapping("/selectOrList")
	@ResponseBody
	public String selectOrList(List<OrderCheckVO> ordervo) {
		return "material/WearingList";
	}

	@GetMapping("/release")
	public String Release() {
		return "material/release";
	}

	@GetMapping("/releaseList")
	public String ReleaseList() {
		return "material/releaseList";
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
	
}
