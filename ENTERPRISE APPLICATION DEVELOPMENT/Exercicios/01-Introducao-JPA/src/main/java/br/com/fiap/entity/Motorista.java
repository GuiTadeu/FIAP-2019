package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Column(name="NR_CARTEIRA")
	private int nr_carteira;
	
	@Column(name="NM_MOTORISTA")
	private String nome;
	
	@Column(name="DT_NASCIMENTO")
	private Calendar nascimento;
	
	@Lob
	@Column(name="FL_CARTEIRA")
	private byte[] fl_carteira;
	
	private Genero genero;
	
	public int getNr_carteira() {
		return nr_carteira;
	}
	public void setNr_carteira(int nr_carteira) {
		this.nr_carteira = nr_carteira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public byte[] getFl_carteira() {
		return fl_carteira;
	}
	public void setFl_carteira(byte[] fl_carteira) {
		this.fl_carteira = fl_carteira;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
