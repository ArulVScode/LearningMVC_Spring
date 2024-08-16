/**
 * 
 */
package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arul
 *
 */
@Controller
public class SpringController {
	
	@RequestMapping("/IndexSpring")
	public String model(ModelMap modelMap) {
		
		modelMap.put("message", "Hello Broo");
		return "IndexSpring";
	}
}
