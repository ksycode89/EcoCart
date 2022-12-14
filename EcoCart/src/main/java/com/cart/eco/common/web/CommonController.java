package com.cart.eco.common.web;

import java.util.List;

import javax.security.auth.message.callback.SecretKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpRequest;
import org.springframework.security.authentication.jaas.DefaultLoginExceptionResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.common.service.BomChildernVO;
import com.cart.eco.common.service.BomService;
import com.cart.eco.common.service.BomVO;
import com.cart.eco.common.service.ClientService;
import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.CommonService;
import com.cart.eco.common.service.CommonVO;
import com.cart.eco.common.service.EmpService;
import com.cart.eco.common.service.EmpVO;
import com.cart.eco.common.service.ProAllVO;
import com.cart.eco.common.service.ProductService;
import com.cart.eco.common.service.ProductVO;
import com.cart.eco.common.service.ToastGridVO;
import com.cart.eco.common.service.WHService;
import com.cart.eco.common.service.WHVO;
import com.cart.eco.material.service.ReDetailService;
import com.cart.eco.material.service.ReDetailVO;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import ch.qos.logback.core.net.server.Client;
import groovy.util.logging.Log4j2;

@Controller
@Log4j2
public class CommonController {

	@Autowired
	EmpService empService;
	@Autowired
	CommonService commonService;
	@Autowired
	WHService whService;
	@Autowired
	ProductService proService;
	@Autowired
	ReDetailService reService;
	@Autowired
	BomService bomService;
	@Autowired
	ClientService clientServcie;

	// ????????? ??????
	@GetMapping("/login")
	public String loginForm() {
			
		return "common/login.html";
	}

	@GetMapping("/test")
	public String test01() {

		return "common/toasttest.html";
	}

	// ???????????? ?????????.
	@GetMapping("/empList")
	public String empForm() {

		return "common/employees";
	}
	// ============= employees(??????)?????????
	// ===========================================================//

	// ???????????? ajax.
	@PostMapping("ajax/list")
	@ResponseBody

	public List<EmpVO> ajaxList(EmpVO vo) {
		System.out.println(vo);
		return empService.getEmpList(vo);
	}

	// ????????? ajax.
	@GetMapping("ajax/empInfo")
	@ResponseBody
	public List<EmpVO> ajaxEmpInfo(EmpVO vo) {

		return empService.selectM(vo);
	}

	// ???????????? ???????????? ?????? ajax.
	@GetMapping("ajax/emplist")
	@ResponseBody
	public EmpVO ajaxEmpList(String empNum) {
		System.out.println("result " + empNum);
		return empService.selectManager(empNum);
	}

	// ?????? ?????? ?????? ajax.
	@GetMapping("ajax/empName")
	@ResponseBody
	public List<EmpVO> ajaxEmpName(EmpVO vo) {

		return empService.getEmpList(vo);
	}

	// ?????? ?????? ajax.
	@GetMapping("ajax/dept")
	@ResponseBody
	public List<CommonVO> ajaxDepName() {

		return commonService.getDept();

	}

	// ?????? ?????? ajax.
	@PostMapping("/insertEmp")
	@ResponseBody
	public String ajaxIn(EmpVO vo) {
		System.out.println("insertEmp : " + vo);
		int result = empService.inEmpInfo(vo);

		String mes = result + "??? ????????? ??????????????????.";
		if (result == 0) {
			mes = "????????? ?????????????????????!!!";
			return mes;
		}

		return mes;
	}

	// ???????????? ??????.
	@PostMapping("/updateEmp")

	@ResponseBody
	public String updateEmp(@RequestBody ToastGridVO<EmpVO> vo) {
		System.out.println("updaate : " + vo.getUpdatedRows());
		int data = 0;
		String result = "?????? ??????!!!";
		for (EmpVO res : vo.getUpdatedRows()) {
			data += empService.upEmpInfo(res);
		}
		if (data > 0) {
			return result = data + "?????? ?????????????????????.";
		}

		return result;
	}

	// ?????? ?????? ajax.
	@PostMapping("/delEmp")
	@ResponseBody
	public int deleteEmp(@RequestBody List<EmpVO> vo) {

		return empService.delEmpInfo(vo);
	}

	// ?????? ?????? ajax.
	@PostMapping("ajax/selectPro")
	@ResponseBody
	public List<ProAllVO> selectPro(ProAllVO vo) {
		System.out.println(vo);
		return proService.selectPro(vo);
	}

	// ?????? ?????? ajax.
	@PostMapping("ajax/insertPro")
	@ResponseBody
	public int insertPro(ProAllVO vo) {
		System.out.println("insertPro" + vo);
		return proService.insertPro(vo);
	}

	// ?????? ?????? ajax.
	@PostMapping("ajax/deletePro")
	@ResponseBody
	public String deletePro(@RequestBody List<ProAllVO> vo) {

		return proService.deletePro(vo);
	}

	// ?????? ??????.
	@PostMapping("ajax/updatePro")
	@ResponseBody
	public int updatePro(ProAllVO vo) {
		System.out.println("updatePro" + vo);
		return proService.updateProInfo(vo);
	}

// ??????????????????.

	// ????????????????????????

	// ????????? ????????????
	@GetMapping("/callClient")
	@ResponseBody
	public List<ClientVO> callClient() {

		return commonService.callClient();
	}

	// ????????????????????????
	@PostMapping("/callCommon")
	@ResponseBody
	public List<CommonVO> callCommon(CommonVO vo, HttpServletRequest request) {

		EmpVO sess = (EmpVO) request.getSession().getAttribute("infos");
		System.out.println("inner callclient : " + sess);

		System.out.println("callCommon : " + commonService.callCommon(vo));
		return commonService.callCommon(vo);
	}

	@GetMapping("/callRead")
	@ResponseBody
	public List<CommonVO> callRead(CommonVO vo) {

		System.out.println("callCommon : " + commonService.callCommon(vo));
		return commonService.callCommon(vo);
	}

	@PostMapping("/callInsert")
	@ResponseBody
	public int callInsert(@RequestBody ToastGridVO<CommonVO> vo) {
		System.out.println("create : " + vo.getCreatedRows());
		int result = 0;
		for (CommonVO common : vo.getCreatedRows()) {

			result += commonService.callInsert(common);
		}
		System.out.println("????????? ?????? : " + result);
		return result;
	}

	// ????????????
	@PostMapping("/callupdate")
	@ResponseBody
	public int callupdate(@RequestBody ToastGridVO<CommonVO> vo) {
		int result = 0;
		System.out.println("create : " + vo.getUpdatedRows());
		for (CommonVO common : vo.getUpdatedRows()) {

			result += commonService.callupdate(common);
		}
		System.out.println("result update : " + result);
		return result;
	}

	// ??????????????????
	@PostMapping("/callDelete")
	@ResponseBody
	public int callDelete(@RequestBody ToastGridVO<CommonVO> vo) {
		int result = 0;
		System.out.println("create : " + vo.getDeletedRows());
		for (CommonVO common : vo.getDeletedRows()) {

			result += commonService.callDelete(common);
		}
		System.out.println("result delete : " + result);
		return result;
	}

	// ????????? ??????, ?????? ????????????.
	@GetMapping("/callProItem")
	@ResponseBody
	public List<CommonVO> proItem() {

		return commonService.getProItem();
	}
	
	// ????????? ??????, ?????? ????????????.
	@GetMapping("/getChildPro")
	@ResponseBody
	public List<BomVO> getChildPro() {
		
		return bomService.getChildPro();
	}
	
	// ===================== ??? ?????? ????????????=====================================//

	// ??????????????????.

	@GetMapping("/coCode")
	public String moveCoCode(Model model) {
		List<CommonVO> list = commonService.commonGroupNull();

		String json = new Gson().toJson(list);

		model.addAttribute("list", json);
		return "common/coCode";
	}

	// ????????? ?????? ?????????.
	@GetMapping("/client")
	public String clientForm(Model model) {
		CommonVO vo = new CommonVO();
		vo.setCodeGroup("WT");
		model.addAttribute("WTlist", commonService.callCommon(vo));
		vo.setCodeGroup("CG");
		model.addAttribute("CGlist", commonService.callCommon(vo));
		return "common/client";
	}

	// ?????????????????? ?????????.
	@GetMapping("/totalCheck")
	public String totalCheckForm() {

		return "common/totalCheck.html";
	}

	// ???????????? ?????????.
	@GetMapping("/product")
	public String productForm() {

		return "common/product";
	}

	// ???????????? ?????????.
	@GetMapping("/wareHouse")
	public String wareHouseForm(Model model) {
		CommonVO vo = new CommonVO();
		vo.setCodeGroup("wh_field");
		model.addAttribute("CClist", commonService.callCommon(vo));
		return "common/wareHouse";
	}

	// BOM ?????? ?????????.
	@GetMapping("/bom")
	public String bomForm() {

		return "common/bom";
	}

	// BOM ????????? ?????????.
	@GetMapping("/bomR")
	public String bomReversalForm() {

		return "common/bomReversal";
	}

	// ???????????? ?????????.
	@GetMapping("/check")
	public String checkForm() {

		return "common/check";
	}

//	========???  ??????  ???  =========================================//
	@PostMapping("/whList")
	@ResponseBody
	public List<WHVO> whList(WHVO vo) {
		System.out.println(vo);
		return whService.WHList(vo);

	}

	// ?????? ??? ?????? ????????????
	@GetMapping("/selectName")
	@ResponseBody
	public List<ProductVO> selectName() {

		return proService.selectName();
	}

	@PostMapping("/innerWH")
	@ResponseBody
	public List<ReDetailVO> collectPro(ReDetailVO vo) {

		return reService.collectPro(vo);

	}

	// ????????????
	@PostMapping("/WHInsert")
	@ResponseBody
	public int WHInsert(@RequestBody ToastGridVO<WHVO> vo) {
		int result = 0;
		for (WHVO wh : vo.getCreatedRows()) {

			result += whService.WHInsert(wh);
		}
		//System.out.println("????????? ?????? : " + result);
		return result;
	}

	// ????????????
	@PostMapping("/WHUpdate")
	@ResponseBody
	public int WHUpdate(@RequestBody ToastGridVO<WHVO> vo) {
		int result = 0;
		for (WHVO wh : vo.getUpdatedRows()) {

			result += whService.WHUpdate(wh);
		}
		//System.out.println("????????? ?????? : " + result);
		return result;
	}

	// ????????????
	@PostMapping("/deleteWare")
	@ResponseBody
	public int deleteWare(@RequestBody ToastGridVO<WHVO> vo) {
		System.out.println("update : " + vo.getUpdatedRows());
		int result = 0;
		for (WHVO wh : vo.getDeletedRows()) {

			result += whService.deleteWare(wh);
		}
		System.out.println("????????? ?????? : " + result);
		return result;
	}
//	====================BOM=======================================

	// ????????????
	@PostMapping("/bomInsert")
	@ResponseBody
	public BomVO bomInsert(BomVO vo) {
		System.out.println("insert : " + vo);
		return bomService.bomInsert(vo);
	}

	// ???????????? bomList
	@PostMapping("/bomList")
	@ResponseBody
	public List<BomVO> bomList(BomVO vo) {
		System.out.println(vo);
		return bomService.bomList(vo);
	}

	// ??????????????? bomChildren
	@PostMapping("/bomChildren")
	@ResponseBody
	public List<BomChildernVO> bomChildren(BomVO vo) {
		System.out.println("bomChildren : " + vo);
		return bomService.bomChildren(vo);
	}

	@PostMapping("/bomInsertOP")
	@ResponseBody
	public String bomInsertOP(@RequestBody List<BomChildernVO> vo) {
		System.out.println("bomInsertOP : " + vo);

		return bomService.bomInsertOP(vo);
	}

//			====================????????? ======================================= //
	// ???????????????
	@PostMapping("/clientList")
	@ResponseBody
	public List<ClientVO> clientList(ClientVO vo) {
		System.out.println("clientList : " + vo);

		return clientServcie.clientList(vo);

	}

	// ???????????????
	@PostMapping("/insertClinet")
	@ResponseBody
	public String insertClinet(@RequestBody List<ClientVO> vo) {
		System.out.println("insertClinet : " + vo);
		return clientServcie.insertClinet(vo);

	}

	// ????????? ??????
	@PostMapping("/updateClient")
	@ResponseBody
	public int updateClient(@RequestBody ToastGridVO<ClientVO> vo) {
		System.out.println("updateClient : " + vo.getUpdatedRows());

		return clientServcie.updateClient(vo.getUpdatedRows());

	}

	// ????????? ??????
	@PostMapping("/deleteClient")
	@ResponseBody
	public String deleteClient(@RequestBody List<ClientVO> vo) {
		System.out.println("deleteClient : " + vo);
		return clientServcie.deleteClient(vo);

	}
}
