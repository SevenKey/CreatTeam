package com.vshlh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vshlh.dao.RoleDao;
import com.vshlh.entity.Role;
import com.vshlh.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	@Resource
	private RoleDao roleDao;

	public List<Role> findAll() {
		
		return roleDao.findAll();
	}

	public void delete(Long id) {
		
	}

	public void save(Role role) {
		
	}

	public void update(Role role) {
		
	}

	public Role getById(Long id) {
		return null;
	}

	public List<Role> getByIds(Long[] roleIds) {
		return null;
	}
	
}
