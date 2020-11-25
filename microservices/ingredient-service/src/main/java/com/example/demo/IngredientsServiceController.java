package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ingredients")
public class IngredientsServiceController {

	@GetMapping("/{id}")
	@ResponseBody
	public String getIngredients(@PathVariable String id) {
		return "Taco ingredient";
	}
}
