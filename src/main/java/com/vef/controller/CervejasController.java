package com.vef.controller;

import java.util.Iterator;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vef.model.Cerveja;

@Controller
public class CervejasController {

	@GetMapping("/cerveja/novo")
	public String novo(Cerveja cerveja) {
		//model.addAttribute(new Cerveja());
		return "cerveja/cadastro"; //forward: padrão do Spring, retorna a pagina para exibição
	}
	
	
	@PostMapping("/cerveja/novo")
	public String cadastrar(@Valid Cerveja cerveja, BindingResult bindingResult, Model model, RedirectAttributes attributes) {	
		
		model.addAttribute(cerveja);
		
		if(bindingResult.hasErrors()) {
			//model.addAttribute("menssage","Erro no Formulário");
			return this.novo(cerveja);
		}
		
		//model.addAttribute("menssage","Sucesso ao salvar Cerveja"); //Não funciona para redirect
		attributes.addFlashAttribute("menssage","Sucesso ao salvar Cerveja");
		System.out.println("sku: " + cerveja.getSku());
		System.out.println("nome: " + cerveja.getNome());
		System.out.print("Descricao: " + cerveja.getDescricao());
		return "redirect:/cerveja/novo"; //redireciona para uma url, faz uma requisição a mais
		
	}
}
