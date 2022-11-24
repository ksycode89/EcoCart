package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.WHVO;

public interface WarehouseMapper {
	//창고리스트
	public List<WHVO>WHList(WHVO vo);
	 //창고등록 
	  public int WHInsert(WHVO vo);
	  //창고수정
	  public int WHUpdate(WHVO vo);

}
