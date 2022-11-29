package com.cart.eco.common.service;

import java.util.List;

public interface ClientService {
	//거래처 조회
	public List<ClientVO> clientList(ClientVO vo);
	//거래처등록
	public String  insertClinet(List<ClientVO> vo );
	//거래처삭제 
	public String deleteClient(List<ClientVO> vo );
}
