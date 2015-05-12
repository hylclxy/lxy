package com.lxy.web.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Dao类实现, 实现基本的增删查改
 * @author liuxy11
 */
@SuppressWarnings("unchecked")
public class BaseDao<T> {
	
	private Class<T> entityClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BaseDao(Class<T> clazz) {  
        this.entityClass = clazz;  
    }  
	
	/**
	 * 保存数据
	 */
	public void save(T t){
		sessionFactory.getCurrentSession().save(t);
	}

	/**
	 * 更新数据
	 */
	public void update(T t){
		sessionFactory.getCurrentSession().update(t);
	}
	
	/**
	 * 保存或更新数据
	 */
	public void saveOrUpdate(T t){
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}
	
	/**
	 * 根据id获取数据
	 */
	public T get(Serializable id){
		return (T)sessionFactory.getCurrentSession().get(entityClass, id);
	}

}
