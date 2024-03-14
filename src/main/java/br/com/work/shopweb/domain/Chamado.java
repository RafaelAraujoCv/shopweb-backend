package br.com.work.shopweb.domain;

import java.time.LocalDate;

import br.com.work.shopweb.domain.enums.Prioridade;
import br.com.work.shopweb.domain.enums.Status;

public class Chamado {
	
	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamentoDate;
	private Prioridade prioridade;
	private Status status;
	private String observacoes;
	
	private Tecnico tecnico;
	private Cliente cliente;
	
	public Chamado() {
		super();
	}
	
	
	

}
