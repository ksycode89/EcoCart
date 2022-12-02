package com.cart.eco.mf.mapper;

import java.util.List;
import java.util.Map;

import com.cart.eco.mf.service.MfProcessVO;

public interface MfProcessMapper {

	//공정전체목록
	public List<MfProcessVO> getMfProcessList();
	
	//미사용설비목록
	public List<Map<String, Object>> getMfSystemList(String sysDiv);
	
	//설비변경
	public int updateMfSystem(MfProcessVO vo);

	//설비상태변경(미사용->사용)
	public int updateSystemUsing(MfProcessVO vo);
	
	//설비상태변경(사용->미사용)
	public int updateSystemUnusing(MfProcessVO vo);
	
}
