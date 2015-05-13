package com.lxy.web.dao;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 通用的Dao, 使用此dao的查询方法需要传入实体类的class
 * @author liuxy11
 *
 */
@Component("generalDao")
@SuppressWarnings({"rawtypes"})
public class GeneralDao extends BaseDao<Object> {
	
	/**
	 * 根据id获取数据
	 */
	public Object get(Class entityClass, Serializable id){
		return sessionFactory.getCurrentSession().get(entityClass, id);
	}

}
