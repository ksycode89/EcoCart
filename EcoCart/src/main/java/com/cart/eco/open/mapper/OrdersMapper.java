package com.cart.eco.open.mapper;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.service.EstimateVO;
import com.cart.eco.open.service.OrderDVO;
import com.cart.eco.open.service.OrdersVO;

public interface OrdersMapper {
	
	//주문서 조회
	public List<OrdersVO> OrdersList();
	
	//주문서 조회
	public List<OrdersVO> OrdersListOk();
	
	
	//주문서 상세 조회
	public List<Map<String, Object>> OrdersDList(String orderCode);
	
	//제품코드 조회
	public List<ProductVO> proList();
	
	//승인 견적서 조회 모달창
	public List<EstimateVO>MestmtList(String estmtCode);

	
	//승인 견적서 상세 조회 모달창
	public List<Map<String,Object>> MestmtListD(String estmtCode);
	

	
	//셀렉트옵션 
	public List<EstimateVO> selectEstmtCode();
	
	//주문서 등록
	public int insertOrder(OrdersVO vo);

	public int insertOrderD(OrderDVO vo);
	
	
	
	
	//주문서 등록시 견적서 승인 업데이트
	public int updateEstmtSt(EstimateVO vo);

	//주문 번호 가져오기
	public List<OrdersVO> getOrderCode();
	
	
	//승인 업데이트
	public int updateOrderSt(OrdersVO vo);
	
	// 주문 마감 업데이트
	public int updateOrderCanSt(OrdersVO vo);
	
	// 주문 마감 업데이트
	public int updateCanNum(OrderDVO vo);
	
	
}
