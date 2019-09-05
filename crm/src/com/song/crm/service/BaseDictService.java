package com.song.crm.service;

import java.util.List;

import com.song.crm.pojo.BaseDict;

/**
 * 字典数据表业务逻辑接口
 *
 */
public interface BaseDictService {
	/**
	 * 跟据字典编码查询字典列表
	 * 
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
