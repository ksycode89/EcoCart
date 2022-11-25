package com.cart.eco.mf.mapper;

import java.util.List;
import java.util.Map;

import com.cart.eco.mf.service.MfOrderVO;

public interface MfOrderMapper {
	
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
	
	//생산지시코드조회
	public List<MfOrderVO> getMfOrderCode();
	
	//생산지시등록
	public int insertMfOrder(MfOrderVO vo);
		
	//생산지시상세등록
	public int insertMfOrderDetail(MfOrderVO vo);
		
	//필요자재LOT등록
	public int insertMfOrderLot(MfOrderVO vo);
		
	//필요자재LOT상세등록
	public int insertMfOrderLotDetail(MfOrderVO vo);
		
	//자재재고변경
	public int updateReceivingDetail(MfOrderVO vo);
	
	//생산지시확정변경
	public int decideMfOrder(MfOrderVO mfvo);
}
