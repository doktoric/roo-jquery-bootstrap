package com.acme.doktorics.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ThemeController {
	
	
	@RequestMapping("/themes")
	public String getThemes(@RequestParam String theme,HttpSession session)
	{
		
		session.setAttribute("theme", theme);
		
		return "redirect:/";
	}

}
