package br.com.work.shopweb.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.work.shopweb.domain.enums.Prioridade;
import br.com.work.shopweb.domain.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Chamado implements Serializable {
	//private static final long serialVersionUID = 1L;
	
	//@Entity(name = "TB_NOMETABELA") = informa que a classe e uma entidade para criar tabela no banco
	//implements Serializable = permite q dados possam ser guardadas em memoria para serem recuperadas posteriormente
	
	@Id //informa que esse sera coluna de id do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) //informa que os numeros sera gerado id diferente sequencial
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy") //formata padrao da data
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy") //formata padrao da data
	private LocalDate dataFechamentoDate;
	
	private Prioridade prioridade;
	private Status status;
	private String observacoes;
	
	@ManyToAny //relacionamento de tabela, muitos para um (muitos chamados para um tecnico)
	@JoinColumn(name = "tecnico_id") //pega o id de tecnico
	private Tecnico tecnico;
	@ManyToAny //relacionamento de tabela, muitos para um (muitos chamados para um cliente)
	@JoinColumn(name = "tecnico_id") //pega o id de cliente
	private Cliente cliente;
	
	public Chamado() {
		super();
	}
	

	
	public Chamado(Integer id, Prioridade prioridade, Status status, String observacoes, Tecnico tecnico,
			Cliente cliente) {
		super();
		this.id = id;
		this.prioridade = prioridade;
		this.status = status;
		this.observacoes = observacoes;
		this.tecnico = tecnico;
		this.cliente = cliente;
	}
	
	

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamentoDate() {
		return dataFechamentoDate;
	}

	public void setDataFechamentoDate(LocalDate dataFechamentoDate) {
		this.dataFechamentoDate = dataFechamentoDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

	
	
	

}
