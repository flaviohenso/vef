package com.vef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CervejasController {

	@RequestMapping("/cerveja/novo")
	public String novo() {
		return "cerveja/cadastro";
	}
	
}
