package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DEPARTAMENTO")
@SequenceGenerator(name="depto", sequenceName="SQ_T_DEPARTAMENTO", allocationSize=1)
public class Departamento {
	
	public Departamento(String nome, Date criacao, Tipo tipo, double orcamento, byte[] contrato) {
		super();
		this.nome = nome;
		this.criacao = criacao;
		this.tipo = tipo;
		this.orcamento = orcamento;
		this.contrato = contrato;
	}

	@Id
	@Column(name="CD_DEPARTAMENTO")
	@GeneratedValue(generator="depto", strategy= GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_DEPARTAMENTO", nullable=false, length=100)
	private String nome;
	
	@Column(name="DT_CRIACAO")
	private Date criacao;
	
	@Column(name="DS_TIPO")
	private Tipo tipo;
	
	@Column(name="VL_ORCAMENTO")
	private double orcamento;
	
	@Column(name="FL_CONTRATO")
	private byte[] contrato;
}
