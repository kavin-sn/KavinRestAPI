package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo1 {
	@Value("${carname}")
	public String car;
	@GetMapping("/j")
	@ResponseBody
	public String disp()
	{
		return car;
	}
	
	

}
