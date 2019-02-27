package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_LIVRO")
@SequenceGenerator(name="livro", sequenceName="T_SQ_LIVRO", allocationSize=1)
public class Livro {
	
	public Livro(String nome, Calendar publicacao, Genero genero, int paginas) {
		super();
		this.nome = nome;
		this.publicacao = publicacao;
		this.genero = genero;
		this.paginas = paginas;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="livro")
	@Column(name="CD_LIVRO")
	int codigo;
	
	@Column(name="NM_LIVRO")
	String nome;
	
	@Column(name="DT_PUBLICACAO")
	Calendar publicacao;
	
	@Column(name="DS_GENERO")
	Genero genero;
	
	@Column(name="NR_PAGINAS")
	int paginas;

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

	public Calendar getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Calendar publicacao) {
		this.publicacao = publicacao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
	
	
}
