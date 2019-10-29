package com.sc.ajax.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.ajax.bean.Address;
import com.sc.ajax.dao.AddressMapper;

@Service("ajaxService")
public class AjaxServiceImpl implements AjaxService{
	
	@Resource
	private AddressMapper addressMapper;

	@Override
	public boolean addAddress(Address address) {
		int i = addressMapper.insert(address);
		if (i ==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delAddress(int addId) {
		int i = addressMapper.delAddress(addId);
		if (i ==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Address address) {
		int i = addressMapper.updateByPrimaryKey(address);
		if (i ==1) {
			return true;
		}
		return false;
	}

	@Override
	public Address chaAddress(int addId) {
		Address address = addressMapper.selectByPrimaryKey(addId);
		return address;
	}

	@Override
	public List<Address> chaAddresslist() {
		List<Address> list = addressMapper.chaAddresslist();
		return list;
	}

}
