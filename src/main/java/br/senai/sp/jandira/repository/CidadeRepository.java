package br.senai.sp.jandira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
