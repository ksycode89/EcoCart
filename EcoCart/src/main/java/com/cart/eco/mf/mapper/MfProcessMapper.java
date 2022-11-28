package com.cart.eco.mf.mapper;

import java.util.List;

import com.cart.eco.mf.service.MfProcessVO;

public interface MfProcessMapper {

	//공정전체목록
	public List<MfProcessVO> getMfProcessList();
	
	//미사용설비목록
	public List<MfProcessVO> getMfSystemList();
	
	//설비변경
	public int updateMfSystem(MfProcessVO vo);
}
