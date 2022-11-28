package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ProductVO;

public interface OrdersService {
	
	//주문서 조회
	public List<OrdersVO> OrdersList();
	
	//주문서 조회
	public List<OrdersVO> OrdersListOk();
	
	
	//주문서 상세 조회
	public List<Map<String, Object>> OrdersDList(String orderCode);
	
	//제품코드 조회
	public List<ProductVO> proList();
	

	
	//모달 승인 견적서 조회
	public List<EstimateVO> MestmtList(String estmtCode);
	
	//모달 승인 견적서 상세 조회
	public List<Map<String,Object>> MestmtListD(String estmtCode);
	
	
	
	//섹렉트 옵션 - 견적코드 
	public List<EstimateVO> selectEstmtCode();
	
	//주문서 등록
	public String insertOrder(OrdersVO vo);
	
	public int insertOrderD(List<OrderDVO> vo);
	
	
	
	
	//주문서 등록시 견적서 승인 업데이트
	public int updateEstmtSt(List<EstimateVO> vo);
	
	//주문 번호 가져오기
	public List<OrdersVO> getOrderCode();

	
	
	
	
	
	
	//승인 업데이트
	public int updateOrderSt(List<OrdersVO> vo);
	
	//마감 업데이트
	public int updateOrderCanSt(List<OrdersVO> vo);
	
	public int updateCanNum(List<OrderDVO> vo);




}
