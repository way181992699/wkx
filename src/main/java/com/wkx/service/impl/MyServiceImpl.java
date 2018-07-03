package com.wkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.wkx.mapper.SysMyMapper;
import com.wkx.pojo.SysMy;
import com.wkx.service.MyService;

import tk.mybatis.mapper.entity.Example;
@Service
public class MyServiceImpl implements MyService {
	
		@Autowired
		private SysMyMapper sysMyMapper;
		
		
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(SysMy m) throws Exception {
		
		sysMyMapper.insert(m);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(SysMy m) throws Exception {
		sysMyMapper.updateByPrimaryKeySelective(m);

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(String mId) throws Exception {
		sysMyMapper.deleteByPrimaryKey(mId);

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public SysMy queryById(String mId) throws Exception {
		
		return sysMyMapper.selectByPrimaryKey(mId);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<SysMy> queryAll() throws Exception {
		
		return sysMyMapper.selectAll();
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<SysMy> queryList(SysMy m) throws Exception {
		
		return sysMyMapper.select(m);
		
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<SysMy> queryPage(Integer page, Integer pageSize, SysMy m) throws Exception {
			PageHelper.startPage(page,pageSize);
			Example example = new Example(SysMy.class);
			example.orderBy("age").desc();
			
		return sysMyMapper.selectByExample(example);
	}

	@Override
	public Integer count(SysMy m) throws Exception {
		// TODO Auto-generated method stub
		return sysMyMapper.selectCount(m);
	}

}
