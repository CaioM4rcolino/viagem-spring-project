package br.senai.sp.jandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.model.Cidade;
import br.senai.sp.jandira.repository.CidadeRepository;

@RestController
@RequestMapping("/api")
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping("/cidades")
	private List<Cidade> getAll(){
		return cidadeRepository.findAll();
	}

}
