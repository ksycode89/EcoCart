package com.cart.eco.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.ClientMapper;
import com.cart.eco.common.service.ClientService;
import com.cart.eco.common.service.ClientVO;
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired ClientMapper Cmapper;
	
	@Override
	public List<ClientVO> clientList(ClientVO vo) {
	
	
		return Cmapper.clientList(vo);
	}

}
