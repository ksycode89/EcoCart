package com.cart.eco.common.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.CommonService;
import com.cart.eco.common.service.CommonVO;
import com.cart.eco.common.service.EmpService;
import com.cart.eco.common.service.EmpVO;


@Controller
public class CommonController {
	
	
	@Autowired 	EmpService empService;
	@Autowired CommonService commonService;
	
	 
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
	//===================================================================================//
	// 사원조회 ajax 응답.
	
	  @GetMapping("ajax/list")
	  
	  @ResponseBody 
	  public List<EmpVO> ajaxList() {
		  
		  return empService.getEmpList();
	  }
	 
	// 담당 사원 ajax 응답.
	  @GetMapping("ajax/empInfo")
	  @ResponseBody
	  public List<EmpVO> ajaxEmpInfo() {
		 
		  return empService.getEmpList();
	  }
	  
	// 사원 이름 모달 ajax 응답.
	  @GetMapping("ajax/empName")
	  @ResponseBody
	  public List<EmpVO> ajaxEmpName() {
		  
		  return empService.getEmpList();
	  }
	
	// 부서 모달 ajax 응답.
		  @GetMapping("ajax/dept")
		  @ResponseBody
		  public List<CommonVO> ajaxDepName() {
			  
			  return commonService.getDept();
		  }
		//공통코드가져오기
	      
	      //거래처 들고오기
	         @GetMapping("/callClient")
	         @ResponseBody
	         public List<ClientVO>callClient(){
	            
	            return commonService.callClient();
	         }
	         
	         //공통코드가져오기
	         @PostMapping("/callCommon")
	         @ResponseBody
	         public List<CommonVO>callCommon(CommonVO vo){
	            
	            System.out.println("callCommon : "+commonService.callCommon(vo));
	            return commonService.callCommon(vo);
	         }	  
	//===================================================================================//
	
	         
	         // 공통코드이동.
	@GetMapping("/coCode")
	public String moveCoCode() {
		
		return "common/coCode.html";
	}
	
	// 거래처 등록 페이지.
	@GetMapping("/client")
	public String clientForm() {
		
		return "common/client.html";
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
	public String wareHouseForm() {
		
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
	
	
	
	
}
