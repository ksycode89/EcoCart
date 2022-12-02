package com.cart.eco.material.mapper;

import java.util.List;

import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;
import com.cart.eco.material.service.ReDetailVO;
import com.cart.eco.material.service.ReceivingVO;

public interface MorderMapper{
	
	// 입력될 자재발주번호
		public int getOrderNo(MorderVO morderVO); 
		
		// 발주현황
		public List<MorderVO> selectOrderList();
		
		// 발주상세현황
		public List<MorderdetailVO> detailList(MorderVO morderVO);
		
		// 발주등록목록
		public List<MorderVO> proInfo(MorderVO morderVO);
		
		// 발주등록
		public int insertOrder(MorderVO morderVO);
		//발주 수량 (업데이트)
		public int updateNum (MorderVO morderVO);
		
		public int insertOrder1(MorderdetailVO morderVO);

		// 발주삭제
		public int deleteOrder(MorderVO morderVO);
		
		//////////////////////////////////////
		//발주현황에 진행변경 (group)
		public int commitOrder(MorderVO morderVO);
		
		public List<MorderVO> searchOrder (int orderNo);
		// 입고테이블 마스터 입력
		public int insertReceiving(ReceivingVO vo); 
		//입고처리 상세
		public int insertReceivingD(ReDetailVO vo);
		
		//발주번호로 주문번호호출
		public String searchReNo(int orderNo);
		//발주진행목록 가져오기
		public List<MorderVO> getOrderGroup(String group);
		//발주에서 ->입고로
		public int completeOrder(MorderVO morderVO);
		
	
}
