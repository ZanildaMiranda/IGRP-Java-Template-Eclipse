package nosi.webapps.cuidado_dos_dependentes.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author: Nositeste
 * 2020-11-02
*/

@Entity
@Table(name="t_pessoa",schema="public")
@NamedQuery(name="TPessoa.findAll", query="SELECT b FROM TPessoa b")
public class TPessoa extends BaseActiveRecord<TPessoa> implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="nome",nullable=false,length=500)
	private String nome;
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento",nullable=false,length=13)
	private Date dataNascimento;
	@Column(name="nome_mae",nullable=true,length=500)
	private String nomeMae;
	@Column(name="nome_pai",nullable=true,length=500)
	private String nomePai;
	@Column(name="sexo",nullable=true)
	private String sexo;
	@Column(name="habilitacoes",nullable=true,length=50)
	private String habilitacoes;
	@Column(name="estado_civi",nullable=true)
	private String estadoCivi;
	@Column(name="nacionalidade",nullable=true,length=100)
	private String nacionalidade;
	@Column(name="profissao",nullable=true,length=250)
	private String profissao;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getHabilitacoes() {
		return habilitacoes;
	}
	public void setHabilitacoes(String habilitacoes) {
		this.habilitacoes = habilitacoes;
	}
	public String getEstadoCivi() {
		return estadoCivi;
	}
	public void setEstadoCivi(String estadoCivi) {
		this.estadoCivi = estadoCivi;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}