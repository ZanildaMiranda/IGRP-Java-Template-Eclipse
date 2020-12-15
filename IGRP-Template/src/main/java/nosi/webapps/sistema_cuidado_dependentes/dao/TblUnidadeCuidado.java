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

/**
 * @author: Nositeste
 * 2020-10-16
*/

@Entity
@Table(name="tbl_unidade_cuidado",schema="public")
@NamedQuery(name="TblUnidadeCuidado.findAll", query="SELECT b FROM TblUnidadeCuidado b")
public class TblUnidadeCuidado extends BaseActiveRecord<TblUnidadeCuidado> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_unidade_cuidado", nullable=false)
	private Integer idUnidadeCuidado;
	@Column(name="nome",nullable=false,length=250)
	private String nome;
	@Column(name="localidade",nullable=false)
	private String localidade;
	@Column(name="telefone",nullable=false,length=11)
	private Integer telefone;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="codigo",nullable=false,length=11)
	private Integer codigo;
	@Column(name="nif",nullable=true,length=9)
	private String nif;

	public Integer getIdUnidadeCuidado() {
		return idUnidadeCuidado;
	}
	public void setIdUnidadeCuidado(Integer idUnidadeCuidado) {
		this.idUnidadeCuidado = idUnidadeCuidado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
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
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
}