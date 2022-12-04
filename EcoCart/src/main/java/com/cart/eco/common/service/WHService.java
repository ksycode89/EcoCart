package com.cart.eco.common.service;

import java.util.List;

public interface WHService {
	 //창고관련//
	  
	  //창고조회//List
	  public List<WHVO>WHList(WHVO vo);
	  //창고등록 
	  public int WHInsert(WHVO vo);
	  //창고수정
	  public int WHUpdate(WHVO vo);
	  //창고수정
	  public int deleteWare(WHVO vo);

}
