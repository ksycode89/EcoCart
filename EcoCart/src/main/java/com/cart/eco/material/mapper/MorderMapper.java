package com.cart.eco.material.mapper;

import java.util.List;

import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;

public interface MorderMapper{
	
	// 입력될 자재발주번호
		public int getOrderNo(MorderVO morderVO); 
		
		// 발주현황
		public List<MorderVO> selectOrderList();
		
		// 발주상세현황
		public List<MorderdetailVO> detailList(MorderVO morderVO);
		
		// 발주등록
		public int insertOrder(MorderVO morderVO);

		// 발주삭제
		public int deleteOrder(MorderVO morderVO);
}
