package com.example.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo-service")
public interface emigrantproxy {
	
	@GetMapping("/policy/checkapi")
	String testapi();

}
