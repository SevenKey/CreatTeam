package com.vshlh.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.vshlh.base.BaseAction;
import com.vshlh.entity.Role;

@SuppressWarnings("serial")
@Controller("role")
@Scope("prototype")
public class RoleAction extends BaseAction<Role> {
	public String list() {
		
		List<Role> roleList = roleService.findAll();
		System.out.println(roleList);
		return "list";
	}

	public String addUI() {
		return "saveUI";
	}

	public String add() {
		return "toList";
	}

	public String delete() {
		return "toList";
	}

	public String editUI() {
		return "saveUI";
	}

	public String deit() {
		return "toList";
	}
}
