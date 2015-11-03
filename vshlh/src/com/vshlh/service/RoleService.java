package com.vshlh.service;

import java.util.List;

import com.vshlh.entity.Role;

public interface RoleService {
	List<Role> findAll();
	
	void delete (Long id);
	
	void save (Role role);
	
	void update(Role role);
	
	Role getById(Long id);
	
	List<Role> getByIds(Long [] roleIds);
}
