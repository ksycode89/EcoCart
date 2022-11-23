package com.cart.eco.material.mapper;

import java.util.List;

import com.cart.eco.material.service.ReDetailVO;

public interface ReceivingMapper {

 //제품찾기(창고 ) - 입고테이블에서 
 public List<ReDetailVO>collectPro(ReDetailVO  vo);
}
