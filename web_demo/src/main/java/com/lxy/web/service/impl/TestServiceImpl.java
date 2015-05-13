package com.lxy.web.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lxy.web.dao.GeneralDao;
import com.lxy.web.entity.User;
import com.lxy.web.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private GeneralDao generalDao;
	
	public User test() {
		
		User user = (User) generalDao.get(User.class, 1l);
		
		logger.info(user.toString());
		
		logger.info("id: {}", user.getId());
		
		return null;
	}

}
