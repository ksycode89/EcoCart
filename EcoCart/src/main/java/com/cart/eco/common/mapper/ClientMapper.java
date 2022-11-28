package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ClientVO;

public interface ClientMapper {
	//거래처 조회
	public List<ClientVO> clientList(ClientVO vo);
}
