package nosi.webapps.sistema_cuidado_dependentes.dao;

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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste
 * 2020-10-21
*/

@Entity
@Table(name="tbl_dependente",schema="public")
@NamedQuery(name="TblDependente.findAll", query="SELECT b FROM TblDependente b")
public class TblDependente extends BaseActiveRecord<TblDependente> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_dependente", nullable=false)
	private Integer idDependente;
	@Column(name="nome",nullable=false,length=250)
	private String nome;
	@Column(name="morada",nullable=false)
	private String morada;
	@Column(name="telefone",nullable=false,length=11)
	private Integer telefone;
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento",nullable=false,length=13)
	private Date dataNascimento;
	@Column(name="sexo",nullable=false,length=1)
	private String sexo;
	@ManyToOne
	@JoinColumn(name="id_cuidador_fk", foreignKey=@ForeignKey(name="cuidador_fk"), nullable=true)
	private TblCuidador idCuidadorFk;
	@ManyToOne
	@JoinColumn(name="id_detalhe_dependente_fk", foreignKey=@ForeignKey(name="detalhe_dependente_fk"), nullable=true)
	private TblDetalheDependente idDetalheDependenteFk;
	@Column(name="palavra_passe",nullable=true)
	private String palavraPasse;
	@Column(name="nacionalidade",nullable=false)
	private String nacionalidade;
	@Column(name="estado_civil",nullable=false)
	private String estadoCivil;
	@Column(name="autocuidado",nullable=false)
	private String autocuidado;
	@Column(name="grau_dependencia",nullable=false)
	private String grauDependencia;
	@Column(name="profissao",nullable=false)
	private String profissao;
	@Column(name="email",nullable=true)
	private String email;

	public Integer getIdDependente() {
		return idDependente;
	}
	public void setIdDependente(Integer idDependente) {
		this.idDependente = idDependente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public TblCuidador getIdCuidadorFk() {
		return idCuidadorFk;
	}
	public void setIdCuidadorFk(TblCuidador idCuidadorFk) {
		this.idCuidadorFk = idCuidadorFk;
	}
	public TblDetalheDependente getIdDetalheDependenteFk() {
		return idDetalheDependenteFk;
	}
	public void setIdDetalheDependenteFk(TblDetalheDependente idDetalheDependenteFk) {
		this.idDetalheDependenteFk = idDetalheDependenteFk;
	}
	public String getPalavraPasse() {
		return palavraPasse;
	}
	public void setPalavraPasse(String palavraPasse) {
		this.palavraPasse = palavraPasse;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getAutocuidado() {
		return autocuidado;
	}
	public void setAutocuidado(String autocuidado) {
		this.autocuidado = autocuidado;
	}
	public String getGrauDependencia() {
		return grauDependencia;
	}
	public void setGrauDependencia(String grauDependencia) {
		this.grauDependencia = grauDependencia;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}