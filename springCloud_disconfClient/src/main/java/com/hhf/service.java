package com.hhf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class service {

	@Value("${webinfo}")
	private String str;
	//请求手动刷新   http://127.0.0.1:8882/actuator/refresh
	
	
	
	@RequestMapping("/getStr")
	public String getStr(){
		return str;
	}
	
}
