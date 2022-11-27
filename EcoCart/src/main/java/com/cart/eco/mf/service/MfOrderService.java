package com.cart.eco.mf.service;

import java.util.List;
import java.util.Map;

public interface MfOrderService {
	
	//생산지시전체조회
	public List<MfOrderVO> getMfOrderList();
	
	//생산지시대기목록조회
	public List<MfOrderVO> getMfReadyOrderList();
	
	//생산계획목록조회
	public List<MfOrderVO> getMfReadyPlanList();
	
	//필요자재조회
	public List<Map<String, Object>> getMfOrderMaterialList(String proCode);
	
	//필요자재LOT조회
	public List<Map<String, Object>> getMfLotList(String proCode);
	
	//생산지시코드 - 자동입력용
	public List<MfOrderVO> getMfOrderCode();
	
	//출고코드 - 자동입력용
	public List<MfOrderVO> getReleaseCode();
	
	//생산지시등록
	public int insertMfOrder(List<MfOrderVO> vo);
	
	//생산지시상세등록
	public int insertMfOrderDetail(List<MfOrderVO> vo);
	
	//자재출고등록
	public int insertMfOrderLot(List<MfOrderVO> vo);
	
	//자재출고상세등록
	public int insertMfOrderLotDetail(List<MfOrderVO> vo);
	
	//자재재고변경
	public int updateReceivingDetail(List<MfOrderVO> vo);
	
	//자재출고상태변경
	public int updateMfOrderLotDetail(List<MfOrderVO> vo);
	
	//생산지시확정변경
	public int decideMfOrder(MfOrderVO mfvo);
}
