package com.jgabriel.imc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgabriel.imc.model.ImcModel;

@RestController
@RequestMapping("/CalcularImc")
public class ImcController {

	@GetMapping
	public String calcularImc(@RequestBody ImcModel imc) {

		new ImcModel(imc.Peso(), imc.Altura());
		return imc.Retorno();

	}

}
