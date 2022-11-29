package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ClientVO;

public interface ClientMapper {
	//거래처 조회
	public List<ClientVO> clientList(ClientVO vo);
	//거래처 등록
	public int insertClinet(ClientVO vo);
	//거래처 삭제
	public int deleteClient(ClientVO vo);
	
}
