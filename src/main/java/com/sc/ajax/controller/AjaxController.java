package com.sc.ajax.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.ajax.bean.Address;
import com.sc.ajax.bean.ResultBean;
import com.sc.ajax.service.AjaxService;

@Controller
public class AjaxController {
	
	@Resource
	private AjaxService ajaxService;
	
	@RequestMapping("/allList")
	@ResponseBody
	public List<Address> getAllList()
	{
		List<Address> list = ajaxService.chaAddresslist();
		return list;
	}
	
	@RequestMapping("/delAdd")
	@ResponseBody
	public ResultBean delAddress(Integer addId)
	{
		boolean b = ajaxService.delAddress(addId);
		ResultBean bean = new ResultBean();
		bean.setState(b);
		return bean;
	}
	
	@RequestMapping("/addAdd")
	@ResponseBody
	public ResultBean addAddress(Address address)
	{
		boolean b = ajaxService.addAddress(address);
		ResultBean bean = new ResultBean();
		bean.setState(b);
		return bean;
	}
	
	@RequestMapping("/chaAdd")
	@ResponseBody
	public Address chaAddress(Integer addId)
	{
		Address address = ajaxService.chaAddress(addId);
		return address;
	}
	
	@RequestMapping("/updateAdd")
	@ResponseBody
	public ResultBean updateAddress(Address address)
	{	address.setDef(1);
		address.setState(1);
		boolean b = ajaxService.update(address);
		System.out.println("ÐÞ¸Ä£º"+b);
		ResultBean bean = new ResultBean();
		bean.setState(b);
		return bean;
	}
}
