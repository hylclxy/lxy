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
	
	@Override
	public Object get(Serializable id) {
		//此方法需要设定指定的T, 在公共dao里不适用, 屏蔽
		throw new RuntimeException("Please use method: GeneralDao.get(Class, id)");
	}

	/**
	 * 根据id获取数据
	 */
	public Object get(Class entityClass, Serializable id){
		return sessionFactory.getCurrentSession().get(entityClass, id);
	}

}
