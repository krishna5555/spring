package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/client")
public class IngredientServiceClientController {

	@Autowired
	RestTemplate rest;

	@GetMapping("/getIngredient")
	@ResponseBody
	public String getIngredientById(String ingredientId) {
		return rest.getForObject("http://ingredient-service/ingredients/{id}",
								 String.class,
								 "1");
	}

}
