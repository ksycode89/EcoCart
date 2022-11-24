package com.cart.eco.material.service;

import java.util.List;

import lombok.Data;

@Data
public class ModerReqVO {
	MorderVO morder;
	List<MorderdetailVO> detailOrder;
}
