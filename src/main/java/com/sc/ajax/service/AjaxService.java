package com.sc.ajax.service;

import java.util.List;

import com.sc.ajax.bean.Address;

public interface AjaxService {
	
	//增
	boolean addAddress(Address address);
	
	//删
	boolean delAddress(int addId);
	
	//改
	boolean update(Address address);
	
	//查单条
	Address chaAddress(int addId);
	
	//查所有
	List<Address> chaAddresslist();
	
	
}
