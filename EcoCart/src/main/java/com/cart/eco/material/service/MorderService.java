package com.cart.eco.material.service;

import java.util.List;

public interface MorderService {
	
	// 입력될 자재발주번호
	public int getOrderNo(MorderVO morderVO); 
	
	// 발주현황
	public List<MorderVO> selectOrderList();
	
	// 발주상세현황
	public List<MorderdetailVO> detailList(MorderVO morderVO);
	
	// 발주등록목록 기본값
	public List<MorderVO> proInfo(MorderVO morderVO);
	
	// 발주등록
	public int insertOrder(ModerReqVO morderVO);

	// 발주삭제
	public String deleteOrder(List<MorderVO> morderVO);
	
	//////////////////////////////////////
	//발주현황에 진행변경 (group)
	public int commitOrder(List<Integer> list);
	//발주현황에 진행변경 (group)
	public int OrderCancel(List<Integer> list);
	//입고가져오기 (발주완료들)
	public List<MorderVO> searchOrder(int orderNo);
	//입고처리
	public ReceivingVO insertReceiving(ReceivingVO vo); 
	//입고처리 상세
	public int insertReceivingD(List<ReDetailVO> vo);
	//발주진행목록 가져오기
	public List<MorderVO> getOrderGroup(String group);
	//발주완료목록
	public  List<MorderVO>  getCoOrder( );
}
