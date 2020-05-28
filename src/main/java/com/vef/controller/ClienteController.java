package com.vef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.vef.model.Cliente;

@Controller
public class ClienteController {
	
	@GetMapping("/cliente/novo")
	public String novo(Cliente cliente) {
		return "cliente/cadastro";
	}
}
