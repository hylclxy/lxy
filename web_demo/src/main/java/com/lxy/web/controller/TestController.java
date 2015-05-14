package com.lxy.web.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxy.web.entity.User;
import com.lxy.web.service.TestService;

@Controller("/test.do")
public class TestController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TestService testService;

    @ResponseBody 
	@RequestMapping
	public User test(){
		logger.info("test");
		User user = testService.test();
		return user;
	}

}
