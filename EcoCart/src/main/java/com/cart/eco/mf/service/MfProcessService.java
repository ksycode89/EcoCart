package com.cart.eco.mf.service;

import java.util.List;

public interface MfProcessService {
	
	//공정전체목록
	public List<MfProcessVO> getMfProcessList();
	
	//미사용설비목록
	public List<MfProcessVO> getMfSystemList();
	
}
