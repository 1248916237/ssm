package com.sc.ajax.service;

import java.util.List;

import com.sc.ajax.bean.Address;

public interface AjaxService {
	
	//��
	boolean addAddress(Address address);
	
	//ɾ
	boolean delAddress(int addId);
	
	//��
	boolean update(Address address);
	
	//�鵥��
	Address chaAddress(int addId);
	
	//������
	List<Address> chaAddresslist();
	
	
}
