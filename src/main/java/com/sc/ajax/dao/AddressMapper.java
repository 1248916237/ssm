package com.sc.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.ajax.bean.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    
    List<Address> chaAddresslist();
    
    int delAddress(@Param("addId")int addId);
}