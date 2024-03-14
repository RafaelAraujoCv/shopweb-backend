package br.com.work.shopweb.domain;

import java.util.ArrayList;
import java.util.List;

import br.com.work.shopweb.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa {
	//extends = erda todos os atributos de outra classe
	//iniciar com ArrayList para evitar null pointer
	
	//@Entity(name = "TB_NOMETABELA") = informa que a classe e uma entidade para criar tabela no banco
	
	@OneToMany(mappedBy = "cliente") //relacionamento de tabelas, Um para muitos (Um cliente para muitos chamados), passando no mappe nome do atributo
	private List<Chamado> chamados = new ArrayList<>();

	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	
	

}
