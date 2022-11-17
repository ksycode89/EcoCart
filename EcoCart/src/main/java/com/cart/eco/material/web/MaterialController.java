package com.cart.eco.material.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;

@Controller
public class MaterialController {
	
	@Autowired
	MorderService morder;
	
	@GetMapping("/materialList")
	public String materialList() {
		
		return "material/materialList";
	}
	
	@GetMapping("materialListInfo")
	@ResponseBody
	public List<MorderVO> materialListInfo() {
		return morder.selectOrderList();
	}
	
	@GetMapping("detailList")
	@ResponseBody
	public List<MorderdetailVO> detailList(MorderVO morderVO) {
		System.out.println("너 언제쳐오냐 ? : "+morder.detailList(morderVO));
		
		return morder.detailList(morderVO);
	}
	
	
	@GetMapping("/materialinsert")
	public String materialInsert() {
		return "material/materialinsert";
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

	@GetMapping("/WearingList")
	public String WearingList() {
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
