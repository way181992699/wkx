package com.wkx.service;

import java.util.List;

import com.wkx.pojo.SysMy;

public interface MyService {
			public void save(SysMy m) throws Exception;
			public void update(SysMy m) throws Exception;
			public void delete(String mId) throws Exception;
			public SysMy queryById(String mId) throws Exception;
			public List<SysMy> queryAll() throws Exception;
			public List<SysMy> queryList(SysMy m) throws Exception;
			public List<SysMy> queryPage(Integer page,Integer pageSize,SysMy m) throws Exception;
			public Integer count(SysMy m) throws Exception;
			
}
