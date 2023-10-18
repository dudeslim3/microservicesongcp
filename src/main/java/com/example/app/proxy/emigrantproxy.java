package com.example.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="DEMO-SERVICE")
public interface emigrantproxy {
	
	@GetMapping("/policy/checkapi")
	String testapi();

}
