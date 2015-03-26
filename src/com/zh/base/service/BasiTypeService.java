package com.zh.base.service;

import java.util.List;

import com.zh.base.model.bean.BasiType;

/**
 * 
* @Title: BasiTypeService.java 
* @Package com.zh.base.service 
* @Description: 基础类型资料
* @date 2015年3月25日 下午3:23:21 
* @author taozhaoping 26078
* @author mail taozhaoping@gmail.com
* @version V1.0
 */
public interface BasiTypeService {
	
	/**
	 * 查询信息
	 * @param 
	 * @return
	 */
	public BasiType query(BasiType basiType);
	
	/**
	 * 查询列表
	 * @param 
	 * @return
	 */
	public List<BasiType> queryList(BasiType basiType);
	
	/**
	 * 查询用户列表，返回json格式
	 * @param user
	 * @return
	 */
	public String queryListJson(BasiType basiType);
	
	
}