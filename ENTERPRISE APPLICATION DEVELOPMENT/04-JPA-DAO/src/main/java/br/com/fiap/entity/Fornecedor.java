package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

/**
 * T_FORNECEDOR
 * CD_FORNECEDOR
 * NM_FORNECEDOR
 * NR_CNPJ
 * DT_REGISTRO
 * DS_TIPO(ENUM ATACADO, VAREJO)
 * 
 */

@Entity
@Table(name="T_FORNECEDOR")
@SequenceGenerator(name="fornecedor", sequenceName="T_SQ_FORNECEDOR", allocationSize=1)

public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="fornecedor")
	@Column(name="CD_FORNECEDOR")
	private int codigo;
	
	@Column(name="NM_FORNECEDOR", nullable = false, length = 100)
	private String nome;
	
	@Column(name="NR_CNPJ", nullable = false)
	private int cnpj;
	
	@CreationTimestamp
	@Column(name="DT_REGISTRO")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Calendar registro;
	
	@Column(name="DS_TIPO")
	@Enumerated(EnumType.STRING)
	TipoFornecedor tipo;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(int codigo, String nome, int cnpj, TipoFornecedor tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}
	
	public Fornecedor(String nome, int cnpj, TipoFornecedor tipo) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getRegistro() {
		return registro;
	}

	public void setRegistro(Calendar registro) {
		this.registro = registro;
	}

	public TipoFornecedor getTipo() {
		return tipo;
	}

	public void setTipo(TipoFornecedor tipo) {
		this.tipo = tipo;
	}
	
	
	

}
