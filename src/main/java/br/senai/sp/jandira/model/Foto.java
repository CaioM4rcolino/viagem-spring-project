package br.senai.sp.jandira.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Foto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String url;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Destino destino;
	
	public boolean destaque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

//	public String getDestino() {
//		return destino;
//	}
//
//	public void setDestino(String destino) {
//		this.destino = destino;
//	}

}
