package br.senai.sp.jandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.model.Estado;
import br.senai.sp.jandira.repository.EstadoRepository;

@RestController
@RequestMapping("/api")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping("/estados")
	private List<Estado> getAll(){
		return estadoRepository.findAll();
	}
	
	@GetMapping("/estados/{id}")
	private Estado getById(@PathVariable Long id){
		return estadoRepository.findById(id).get();
	}
}
