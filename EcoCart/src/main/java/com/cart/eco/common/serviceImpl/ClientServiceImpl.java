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
	//거래처 조회 
	@Override
	public List<ClientVO> clientList(ClientVO vo) {
		return Cmapper.clientList(vo);
	}
	//거래처 등록 
	@Override
	public String insertClinet(List<ClientVO> vo) {
		int result = 0;
		String mes ;
		for(ClientVO one : vo) {
			
			result += Cmapper.insertClinet(one);
		}
		if(result == vo.size()) {
			mes = result+"등록되었습니다.";
		}else {
			mes = "입력에 실패했습니다.("+result + "/"+vo.size()+")";
		}
		
		return mes;
	}
	@Override 
	public String deleteClient(List<ClientVO> vo) {
		
		int result = 0;
		String mes ;
		for(ClientVO one : vo) {
			
			result += Cmapper.deleteClient(one);
		}
		if(result == vo.size()) {
			mes = result+"삭제되었습니다.";
		}else {
			mes = "삭제에 실패했습니다.("+result + "/"+vo.size()+")";
		}
		
		return mes;
	}

}
