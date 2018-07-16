package com.zoya.code.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Code {
	@RequestMapping("/")
	public String findCode(){
		
			return "dashboard";
	
	}
	
	@RequestMapping("/code")
	public String display(@RequestParam Map<String,String> body,RedirectAttributes flash) {
		if(body.get("secretcode").equals("bushido")) {
			
		}
		else {
			flash.addFlashAttribute("error","You must train");
			return "redirect:/";
		}
		return "success";
	}
	
}
