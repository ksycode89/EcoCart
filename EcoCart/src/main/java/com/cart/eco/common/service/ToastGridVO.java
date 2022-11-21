package com.cart.eco.common.service;

import java.util.List;

import lombok.Data;

@Data
public class ToastGridVO<T> {
	private List<T> updatedRows;
	private List<T> deletedRows;
	private List<T> createdRows;
}