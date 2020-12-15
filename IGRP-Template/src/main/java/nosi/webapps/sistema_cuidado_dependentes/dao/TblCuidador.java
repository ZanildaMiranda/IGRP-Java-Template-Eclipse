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

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author: Nositeste
 * 2020-10-16
*/

@Entity
@Table(name="tbl_cuidador",schema="public")
@NamedQuery(name="TblCuidador.findAll", query="SELECT b FROM TblCuidador b")
public class TblCuidador extends BaseActiveRecord<TblCuidador> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cuidador", nullable=false)
	private Integer idCuidador;
	@Column(name="nome",nullable=false,length=250)
	private String nome;
	@Column(name="morada",nullable=false)
	private String morada;
	@Column(name="telefone",nullable=false,length=11)
	private Integer telefone;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="sexo",nullable=false,length=1)
	private String sexo;
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento",nullable=false,length=13)
	private Date dataNascimento;
	@ManyToOne
	@JoinColumn(name="id_unidade_cuidado_fk", foreignKey=@ForeignKey(name="unidade_cuidado_fokey"), nullable=true)
	private TblUnidadeCuidado idUnidadeCuidadoFk;
	@Column(name="palavra_passe",nullable=false)
	private String palavraPasse;
	@Column(name="tipo",nullable=false)
	private String tipo;
	@Column(name="formacao",nullable=false)
	private String formacao;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeCuidadoFk")
	private List<TblCuidador> tblcuidadorList;

	public Integer getIdCuidador() {
		return idCuidador;
	}
	public void setIdCuidador(Integer idCuidador) {
		this.idCuidador = idCuidador;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public TblUnidadeCuidado getIdUnidadeCuidadoFk() {
		return idUnidadeCuidadoFk;
	}
	public void setIdUnidadeCuidadoFk(TblUnidadeCuidado idUnidadeCuidadoFk) {
		this.idUnidadeCuidadoFk = idUnidadeCuidadoFk;
	}
	public String getPalavraPasse() {
		return palavraPasse;
	}
	public void setPalavraPasse(String palavraPasse) {
		this.palavraPasse = palavraPasse;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	@XmlTransient
	public List<TblCuidador> gettblcuidadorList() {
		return tblcuidadorList;
	}
	public void settblcuidadorList(List<TblCuidador> tblcuidadorList) {
		this.tblcuidadorList = tblcuidadorList;
	}
}