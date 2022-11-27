package com.cart.eco.mf.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//생산계획현황 페이지
	@GetMapping("/mfPlanList")
	public String mfPlanList(Model model) {
		return "manufacture/mfPlanList";
	}
	
	//생산계획현황 - 전체목록조회
	@GetMapping("/mfPlanListAll")
	@ResponseBody
	public List<MfPlanVO> mfPlanListAll(){
		return mfplan.getMfPlanList();
	}
	
	//생산계획관리 페이지
	@GetMapping("/mfPlanManage")
	public String mfPlanManage(Model model) {
		return "manufacture/mfPlanManage";
	}
	
	//생산계획관리 - 생산계획등록 모달창 주문서목록조회
	@GetMapping("/mfPlanOrderList")
	@ResponseBody
	public List<MfPlanVO> mfPlanOrderList(){
		return mfplan.getOrderList();
	}
	
	//생산계획관리 - 생산계획등록 모달창 제품목록조회
	@GetMapping("/mfProductList")
	@ResponseBody
	public List<MfPlanVO> mfProductList() {
		return mfplan.getProductList();
	}
	
	//생산계획관리 - 생산계획등록
	@PostMapping("/mfInsertPlan")
	@ResponseBody
	public int mfInsertPlan(@RequestBody List<MfPlanVO> vo) {
		return mfplan.insertMfPlan(vo);
	}
	
	//생산계획관리 - 생산계획취소 취소가능목록조회
	@GetMapping("/mfPlanDeleteList")
	@ResponseBody
	public List<MfPlanVO> mfPlanDeleteList(){
		return mfplan.getMfDeletePlanList();
	}
	
	//생산계획관리 - 생산계획취소
	@PostMapping("/mfPlanCheckDelete")
	@ResponseBody
	public int mfPlanCheckDelete(@RequestBody List<MfPlanVO> vo) {
		return mfplan.deleteMfPlan(vo);
	}

	//생산지시현황 페이지
	@GetMapping("/mfOrderList")
	public String mfOrderList(Model model) {
		return "manufacture/mfOrderList";
	}
	
	//생산지시현황 - 전체목록조회
	@GetMapping("/mfOrderListAll")
	@ResponseBody
	public List<MfOrderVO> mfOrderListAll(){
		return mforder.getMfOrderList();
	}
	
	//생산지시확정 페이지
	@GetMapping("/mfOrderDecide")
	public String mfOrderDecide(Model model) {
		return "manufacture/mfOrderDecide";
	}
	
	//생산지시확정 - 대기목록조회
	@GetMapping("/mfOrderDecideAll")
	@ResponseBody
	public List<MfOrderVO> mfOrderDecideAll(){
		return mforder.getMfReadyOrderList();
	}
	
	//생산지시확정 - 지시상태변경(대기->확정)
	@PostMapping("/mfOrderDecideClick")
	@ResponseBody
	public int mfOrderDecideClick(@RequestBody MfOrderVO vo) {
		return mforder.decideMfOrder(vo);
	}
	
	//생산지시등록 페이지
	@GetMapping("/mfOrderRegist")
	public String mfOrderRegist(Model model) {
		return "manufacture/mfOrderRegist";
	}
	
	//생산지시등록 - 생산지시코드 자동등록
	@GetMapping("/mfOrderCodeBring")
	@ResponseBody
	public List<MfOrderVO> mfOrderCodeBring(MfOrderVO vo){
		return mforder.getMfOrderCode();
	}
	
	//생산지시등록 - 생산지시코드 자동등록
	@GetMapping("/releaseCodeBring")
	@ResponseBody
	public List<MfOrderVO> releaseCodeBring(MfOrderVO vo){
		return mforder.getReleaseCode();
	}

	//생산지시등록 - 해당BOM자재목록 자동등록
	@GetMapping("/mfOrderNeedList")
	@ResponseBody
	public List<Map<String,Object>> mfOrderNeedList(String mfPlanCode){
		return mforder.getMfOrderMaterialList(mfPlanCode);
	}
	
	//생산지시등록 - 모달창 해당자재LOT목록조회
	@GetMapping("/mfOrderLotList")
	@ResponseBody
	public List<Map<String,Object>> mfOrderLotList(String proCode){
		return mforder.getMfLotList(proCode);
	}
	
	//생산지시등록 - 생산지시등록
	@PostMapping("/mfOrderInsert")
	@ResponseBody
	public int mfOrderInsert(@RequestBody List<MfOrderVO> vo){
		return mforder.insertMfOrder(vo);
	}
	
	//생산지시등록 - 생산지시디테일등록
	@PostMapping("/mfOrderDetailInsert")
	@ResponseBody
	public int mfOrderDetailInsert(@RequestBody List<MfOrderVO> vo){
		return mforder.insertMfOrderDetail(vo);
	}
	
	//생산지시등록 - 자재출고등록
	@PostMapping("/mfReleaseInsert")
	@ResponseBody
	public int mfReleaseInsert(@RequestBody List<MfOrderVO> vo){
		return mforder.insertMfOrderLot(vo);
	}
	
	//생산지시등록 - 자재출고디테일등록
	@PostMapping("/mfReleaseDetailInsert")
	@ResponseBody
	public int mfReleaseDetailInsert(@RequestBody List<MfOrderVO> vo){
		return mforder.insertMfOrderLotDetail(vo);
	}
	
	//생산지시등록 - 자재재고변경
	@PostMapping("/mfReceivingDetailUpdate")
	@ResponseBody
	public int mfReceivingDetailUpdate(@RequestBody List<MfOrderVO> vo){
		return mforder.updateReceivingDetail(vo);
	}
	
	//생산지시등록 - 자재출고상태변경(대기->승인)
	@PostMapping("/mfReleaseDetailUpdate")
	@ResponseBody
	public int mfReleaseDetailUpdate(@RequestBody List<MfOrderVO> vo){
		return mforder.updateMfOrderLotDetail(vo);
	}
	
	//생산관리 페이지
	@GetMapping("/mfMaking")
	public String mfMaking(Model model) {
		return "manufacture/mfMaking";
	}
	
	//공정실적조회 페이지
	@GetMapping("/mfResult")
	public String mfResult(Model model) {
		return "manufacture/mfResult";
	}
	
	//생산공정관리 페이지
	@GetMapping("/mfProcess")
	public String mfProcess(Model model) {
		return "manufacture/mfProcess";
	}
	
	//생산공정관리 - 전체목록조회
	@GetMapping("/mfProcessListAll")
	@ResponseBody
	public List<MfProcessVO> mfProcessListAll(){
		return mfprocess.getMfProcessList();
	}
	
	//생산공정관리 - 모달창 미사용설비목록조회
	@GetMapping("/mfSystemList")
	@ResponseBody
	public List<MfProcessVO> mfSystemList(){
		return mfprocess.getMfSystemList();
	}
}
