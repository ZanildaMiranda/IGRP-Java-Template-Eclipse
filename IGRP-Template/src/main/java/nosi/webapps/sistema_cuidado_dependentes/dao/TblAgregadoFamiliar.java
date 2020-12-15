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
 * 2020-10-16
*/

@Entity
@Table(name="tbl_agregado_familiar",schema="public")
@NamedQuery(name="TblAgregadoFamiliar.findAll", query="SELECT b FROM TblAgregadoFamiliar b")
public class TblAgregadoFamiliar extends BaseActiveRecord<TblAgregadoFamiliar> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agregado_familiar", nullable=false)
	private Integer idAgregadoFamiliar;
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
	@Column(name="tipo",nullable=false)
	private String tipo;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="palavra_passe",nullable=false)
	private String palavraPasse;
	@ManyToOne
	@JoinColumn(name="id_dependente_fk", foreignKey=@ForeignKey(name="dependente_forey"), nullable=false)
	private TblDependente idDependenteFk;

	public Integer getIdAgregadoFamiliar() {
		return idAgregadoFamiliar;
	}
	public void setIdAgregadoFamiliar(Integer idAgregadoFamiliar) {
		this.idAgregadoFamiliar = idAgregadoFamiliar;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPalavraPasse() {
		return palavraPasse;
	}
	public void setPalavraPasse(String palavraPasse) {
		this.palavraPasse = palavraPasse;
	}
	public TblDependente getIdDependenteFk() {
		return idDependenteFk;
	}
	public void setIdDependenteFk(TblDependente idDependenteFk) {
		this.idDependenteFk = idDependenteFk;
	}
}
