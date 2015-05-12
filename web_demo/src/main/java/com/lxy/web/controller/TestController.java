package com.lxy.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/test.do")
public class TestController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping
	public String test(){
		logger.info("test");
		return "test";
	}

}
