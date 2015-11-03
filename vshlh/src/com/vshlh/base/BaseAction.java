package com.vshlh.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vshlh.service.RoleService;

@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {

	protected T model;

	public BaseAction() {
		try {
			// 通过反射获得真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			@SuppressWarnings("unchecked")
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model实例
			model = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T getModel() {
		return model;
	}

	// ==========================Resource支持===================================
	// @Resource
	// protected RoleService roleService;
	@Resource
	protected RoleService roleService;
}
