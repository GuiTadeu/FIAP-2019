package br.com.fiap.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="T_FUNCIONARIO")
@SequenceGenerator(name="func", sequenceName="SQ_T_FUNCIONARIO", allocationSize=1)
public class Funcionario {
	
	public Funcionario() {}
	
	public Funcionario(String nome, float salario, Calendar dataAdmissao, byte[] foto,
			Nivel nivel) {

		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.foto = foto;
		this.nivel = nivel;
	}

	@Id
	@GeneratedValue(generator="func", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO", nullable=false, length=50)
	private String nome;
	
	@Column(name="VL_SALARIO")
	private float salario;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ADMISSAO")
	private Calendar dataAdmissao;
	
	@CreationTimestamp
	@Column(name="DT_CADASTRO", updatable=false)
	private Calendar dataCadastro;
	
	@Transient // Não será mapeado como coluna
	private int tempoDeCasa;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Column(name="DS_NIVEL")
	@Enumerated(EnumType.STRING)
	private Nivel nivel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		return "Nome: " + nome + "\n" +
		"Salario: " + salario + "\n" +
		"Nivel: " + nivel + "\n" +
		"Data admissao: " + sdf.format(dataAdmissao.getTime()) + "\n" +
		"Data Cadastro: " + sdf.format(dataCadastro.getTime());
	}
	
	
}
