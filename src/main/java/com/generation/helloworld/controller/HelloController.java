package com.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String Hello() {
		return "<b>Hello World!!</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<ul>"
				+ "<li>Persistência</li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Proatividade</li>"
				+ "<li>Comunicação</li>"
				+ "<li>Orientação ao Detalhe</li>"
				+ "</ul>";
	}
	
	@GetMapping("/listaObj")
	public String ListaObjetivos() {
		return "<ul>"
				+ "<li>Reforçar o conhecimento sobre SQL</li>"
				+ "<li>Aprender sobre o SpingBoot</li>"
				+ "<li>Melhorar a habilidade de Orientação ao detalhe</li>"
				+ "</ul>";
	}
}
