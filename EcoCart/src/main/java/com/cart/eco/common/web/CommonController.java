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

	// 페이지 이동
	@GetMapping("/login")
	public String loginForm() {
			
		return "common/login.html";
	}

	@GetMapping("/test")
	public String test01() {

		return "common/toasttest.html";
	}

	// 사원관리 페이지.
	@GetMapping("/empList")
	public String empForm() {

		return "common/employees";
	}
	// ============= employees(사원)테이블
	// ===========================================================//

	// 사원조회 ajax.
	@PostMapping("ajax/list")
	@ResponseBody

	public List<EmpVO> ajaxList(EmpVO vo) {
		System.out.println(vo);
		return empService.getEmpList(vo);
	}

	// 담당자 ajax.
	@GetMapping("ajax/empInfo")
	@ResponseBody
	public List<EmpVO> ajaxEmpInfo(EmpVO vo) {

		return empService.selectM(vo);
	}

	// 담당자의 담당사원 조회 ajax.
	@GetMapping("ajax/emplist")
	@ResponseBody
	public EmpVO ajaxEmpList(String empNum) {
		System.out.println("result " + empNum);
		return empService.selectManager(empNum);
	}

	// 사원 이름 모달 ajax.
	@GetMapping("ajax/empName")
	@ResponseBody
	public List<EmpVO> ajaxEmpName(EmpVO vo) {

		return empService.getEmpList(vo);
	}

	// 부서 모달 ajax.
	@GetMapping("ajax/dept")
	@ResponseBody
	public List<CommonVO> ajaxDepName() {

		return commonService.getDept();

	}

	// 사원 등록 ajax.
	@PostMapping("/insertEmp")
	@ResponseBody
	public String ajaxIn(EmpVO vo) {
		System.out.println("insertEmp : " + vo);
		int result = empService.inEmpInfo(vo);

		String mes = result + "건 등록에 성공했습니다.";
		if (result == 0) {
			mes = "등록에 실패하였습니다!!!";
			return mes;
		}

		return mes;
	}

	// 사원정보 수정.
	@PostMapping("/updateEmp")

	@ResponseBody
	public String updateEmp(@RequestBody ToastGridVO<EmpVO> vo) {
		System.out.println("updaate : " + vo.getUpdatedRows());
		int data = 0;
		String result = "수정 실패!!!";
		for (EmpVO res : vo.getUpdatedRows()) {
			data += empService.upEmpInfo(res);
		}
		if (data > 0) {
			return result = data + "건이 수정되었습니다.";
		}

		return result;
	}

	// 사원 삭제 ajax.
	@PostMapping("/delEmp")
	@ResponseBody
	public int deleteEmp(@RequestBody List<EmpVO> vo) {

		return empService.delEmpInfo(vo);
	}

	// 물품 조회 ajax.
	@PostMapping("ajax/selectPro")
	@ResponseBody
	public List<ProAllVO> selectPro(ProAllVO vo) {
		System.out.println(vo);
		return proService.selectPro(vo);
	}

	// 물품 등록 ajax.
	@PostMapping("ajax/insertPro")
	@ResponseBody
	public int insertPro(ProAllVO vo) {
		System.out.println("insertPro" + vo);
		return proService.insertPro(vo);
	}

	// 물품 삭제 ajax.
	@PostMapping("ajax/deletePro")
	@ResponseBody
	public String deletePro(@RequestBody List<ProAllVO> vo) {

		return proService.deletePro(vo);
	}

	// 물품 수정.
	@PostMapping("ajax/updatePro")
	@ResponseBody
	public int updatePro(ProAllVO vo) {
		System.out.println("updatePro" + vo);
		return proService.updateProInfo(vo);
	}

// 공통코드이동.

	// 공통코드가져오기

	// 거래처 들고오기
	@GetMapping("/callClient")
	@ResponseBody
	public List<ClientVO> callClient() {

		return commonService.callClient();
	}

	// 공통코드가져오기
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
		System.out.println("결과값 합산 : " + result);
		return result;
	}

	// 업데이트
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

	// 공통코드삭제
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

	// 품목군 코드, 이름 가져오기.
	@GetMapping("/callProItem")
	@ResponseBody
	public List<CommonVO> proItem() {

		return commonService.getProItem();
	}
	
	// 품목군 코드, 이름 가져오기.
	@GetMapping("/getChildPro")
	@ResponseBody
	public List<BomVO> getChildPro() {
		
		return bomService.getChildPro();
	}
	
	// ===================== ↓ 이동 페이지↓=====================================//

	// 공통코드이동.

	@GetMapping("/coCode")
	public String moveCoCode(Model model) {
		List<CommonVO> list = commonService.commonGroupNull();

		String json = new Gson().toJson(list);

		model.addAttribute("list", json);
		return "common/coCode";
	}

	// 거래처 등록 페이지.
	@GetMapping("/client")
	public String clientForm(Model model) {
		CommonVO vo = new CommonVO();
		vo.setCodeGroup("WT");
		model.addAttribute("WTlist", commonService.callCommon(vo));
		vo.setCodeGroup("CG");
		model.addAttribute("CGlist", commonService.callCommon(vo));
		return "common/client";
	}

	// 검사총괄관리 페이지.
	@GetMapping("/totalCheck")
	public String totalCheckForm() {

		return "common/totalCheck.html";
	}

	// 물품등록 페이지.
	@GetMapping("/product")
	public String productForm() {

		return "common/product";
	}

	// 창고등록 페이지.
	@GetMapping("/wareHouse")
	public String wareHouseForm(Model model) {
		CommonVO vo = new CommonVO();
		vo.setCodeGroup("wh_field");
		model.addAttribute("CClist", commonService.callCommon(vo));
		return "common/wareHouse";
	}

	// BOM 등록 페이지.
	@GetMapping("/bom")
	public String bomForm() {

		return "common/bom";
	}

	// BOM 역전개 페이지.
	@GetMapping("/bomR")
	public String bomReversalForm() {

		return "common/bomReversal";
	}

	// 불량코드 페이지.
	@GetMapping("/check")
	public String checkForm() {

		return "common/check";
	}

//	========↓  창고  ↓  =========================================//
	@PostMapping("/whList")
	@ResponseBody
	public List<WHVO> whList(WHVO vo) {
		System.out.println(vo);
		return whService.WHList(vo);

	}

	// 제품 명 이름 가져오기
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

	// 창고등록
	@PostMapping("/WHInsert")
	@ResponseBody
	public int WHInsert(@RequestBody ToastGridVO<WHVO> vo) {
		int result = 0;
		for (WHVO wh : vo.getCreatedRows()) {

			result += whService.WHInsert(wh);
		}
		//System.out.println("결과값 합산 : " + result);
		return result;
	}

	// 창고수정
	@PostMapping("/WHUpdate")
	@ResponseBody
	public int WHUpdate(@RequestBody ToastGridVO<WHVO> vo) {
		int result = 0;
		for (WHVO wh : vo.getUpdatedRows()) {

			result += whService.WHUpdate(wh);
		}
		//System.out.println("결과값 합산 : " + result);
		return result;
	}

	// 창고삭제
	@PostMapping("/deleteWare")
	@ResponseBody
	public int deleteWare(@RequestBody ToastGridVO<WHVO> vo) {
		System.out.println("update : " + vo.getUpdatedRows());
		int result = 0;
		for (WHVO wh : vo.getDeletedRows()) {

			result += whService.deleteWare(wh);
		}
		System.out.println("결과값 합산 : " + result);
		return result;
	}
//	====================BOM=======================================

	// 창고등록
	@PostMapping("/bomInsert")
	@ResponseBody
	public BomVO bomInsert(BomVO vo) {
		System.out.println("insert : " + vo);
		return bomService.bomInsert(vo);
	}

	// 창고조회 bomList
	@PostMapping("/bomList")
	@ResponseBody
	public List<BomVO> bomList(BomVO vo) {
		System.out.println(vo);
		return bomService.bomList(vo);
	}

	// 자제품조회 bomChildren
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

//			====================거래처 ======================================= //
	// 거래처목록
	@PostMapping("/clientList")
	@ResponseBody
	public List<ClientVO> clientList(ClientVO vo) {
		System.out.println("clientList : " + vo);

		return clientServcie.clientList(vo);

	}

	// 거래처등록
	@PostMapping("/insertClinet")
	@ResponseBody
	public String insertClinet(@RequestBody List<ClientVO> vo) {
		System.out.println("insertClinet : " + vo);
		return clientServcie.insertClinet(vo);

	}

	// 거래처 수정
	@PostMapping("/updateClient")
	@ResponseBody
	public int updateClient(@RequestBody ToastGridVO<ClientVO> vo) {
		System.out.println("updateClient : " + vo.getUpdatedRows());

		return clientServcie.updateClient(vo.getUpdatedRows());

	}

	// 거래처 삭제
	@PostMapping("/deleteClient")
	@ResponseBody
	public String deleteClient(@RequestBody List<ClientVO> vo) {
		System.out.println("deleteClient : " + vo);
		return clientServcie.deleteClient(vo);

	}
}
