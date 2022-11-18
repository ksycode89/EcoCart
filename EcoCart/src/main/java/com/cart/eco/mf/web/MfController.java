package com.cart.eco.mf.web;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.mf.service.MfPlanService;
import com.cart.eco.mf.service.MfPlanVO;

@Controller
public class MfController {
	
	@Autowired
	MfPlanService mfplan;
	
	@GetMapping("/mfPlanList")
	public String mfPlanList(Model model) {
		return "manufacture/mfPlanList";
	}
	
	@GetMapping("/mfPlanList1")
	@ResponseBody
	public List<MfPlanVO> mfPlanList1(){
		return mfplan.getMfPlanList();
	}
	
	@GetMapping("/mfPlanManage")
	public String mfPlanManage(Model model) {
		return "manufacture/mfPlanManage";
	}
	
	@GetMapping("/mfOrderList")
	public String mfOrderList(Model model) {
		return "manufacture/mfOrderList";
	}
	
	@GetMapping("/mfOrderDecide")
	public String mfOrderDecide(Model model) {
		return "manufacture/mfOrderDecide";
	}
	
	@GetMapping("/mfOrderRegist")
	public String mfOrderRegist(Model model) {
		return "manufacture/mfOrderRegist";
	}
	
	@GetMapping("/mfMaking")
	public String mfMaking(Model model) {
		return "manufacture/mfMaking";
	}
	
	@GetMapping("/mfResult")
	public String mfResult(Model model) {
		return "manufacture/mfResult";
	}
	
	@GetMapping("/mfProcess")
	public String mfProcess(Model model) {
		return "manufacture/mfProcess";
	}
	
}
