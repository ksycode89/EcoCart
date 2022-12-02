package com.cart.eco.mf.service;

import java.util.List;
import java.util.Map;

public interface MfProcessService {
	
	//공정전체목록조회
	public List<MfProcessVO> getMfProcessList();
	
	//미사용설비목록조회
	public List<Map<String, Object>> getMfSystemList(String sysDiv);
	
	//설비변경
	public int updateMfSystem(List<MfProcessVO> vo);
		
	//설비상태변경(미사용->사용)
	public int updateSystemUsing(List<MfProcessVO> vo);

	//설비상태변경(사용->미사용)
	public int updateSystemUnusing(List<MfProcessVO> vo);
}
