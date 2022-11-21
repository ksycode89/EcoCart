package com.cart.eco.mf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.mf.service.MfOrderService;
import com.cart.eco.mf.service.MfOrderVO;
import com.cart.eco.mf.service.MfPlanService;
import com.cart.eco.mf.service.MfPlanVO;
import com.cart.eco.mf.service.MfProcessService;
import com.cart.eco.mf.service.MfProcessVO;

@Controller
public class MfController {
	
	@Autowired
	MfOrderService mforder;
	
	@Autowired
	MfPlanService mfplan;
	
	@Autowired
	MfProcessService mfprocess;
	
	@GetMapping("/mfPlanList")
	public String mfPlanList(Model model) {
		return "manufacture/mfPlanList";
	}
	
	@GetMapping("/mfPlanListAll")
	@ResponseBody
	public List<MfPlanVO> mfPlanListAll(){
		return mfplan.getMfPlanList();
	}
	
	@GetMapping("/mfPlanManage")
	public String mfPlanManage(Model model) {
		return "manufacture/mfPlanManage";
	}
	
	@GetMapping("/mfPlanDeleteList")
	@ResponseBody
	public List<MfPlanVO> mfPlanDeleteList(){
		return mfplan.getMfDeletePlanList();
	}
	
	@GetMapping("/mfPlanOrderList")
	@ResponseBody
	public List<MfPlanVO> mfPlanOrderList(){
		return mfplan.getOrderList();
	}
	
	@GetMapping("/mfOrderList")
	public String mfOrderList(Model model) {
		return "manufacture/mfOrderList";
	}
	
	@GetMapping("/mfOrderListAll")
	@ResponseBody
	public List<MfOrderVO> mfOrderListAll(){
		return mforder.getMfOrderList();
	}
	
	@GetMapping("/mfOrderDecide")
	public String mfOrderDecide(Model model) {
		return "manufacture/mfOrderDecide";
	}
	
	@GetMapping("/mfOrderDecideAll")
	@ResponseBody
	public List<MfOrderVO> mfOrderDecideAll(){
		return mforder.getMfReadyOrderList();
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
	
	@GetMapping("/mfProcessListAll")
	@ResponseBody
	public List<MfProcessVO> mfProcessListAll(){
		return mfprocess.getMfProcessList();
	}
	
}
