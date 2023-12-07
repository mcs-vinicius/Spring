package com.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String Hello() {
		return "<b>Hello turma 68 !!</b>";
	}
	
	@GetMapping("/top")
	public String top() {
		return "<b>A turma 68 é top!!</b>";
	}
	
	@GetMapping("/darling")
	public String darling() {
		return "<b>A querida mulher!</b>";
	}
}
