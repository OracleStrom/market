package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandsService;

@Service
public class BrandServiceImpl implements BrandsService {

	@Autowired
	private TbBrandMapper BrandMapper;
	@Override
	public List<TbBrand> findAll() {
		// TODO Auto-generated method stub
		return BrandMapper.selectByExample(null);
	}

}
