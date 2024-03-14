package br.com.work.shopweb.domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {
	//extends = erda todos os atributos de outra classe
	//iniciar com ArrayList para evitar null pointer
	private List<Chamado> chamado = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}

	public List<Chamado> getChamado() {
		return chamado;
	}

	public void setChamado(List<Chamado> chamado) {
		this.chamado = chamado;
	}
	
	
	

}
