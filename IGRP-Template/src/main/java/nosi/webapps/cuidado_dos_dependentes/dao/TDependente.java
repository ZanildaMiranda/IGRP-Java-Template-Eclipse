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

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author: Nositeste
 * 2020-11-02
*/

@Entity
@Table(name="t_dependente",schema="public")
@NamedQuery(name="TDependente.findAll", query="SELECT b FROM TDependente b")
public class TDependente extends BaseActiveRecord<TDependente> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="pessoa_fk", foreignKey=@ForeignKey(name="Ref_t_dependente_to_t_pessoa"), nullable=false)
	private TPessoa pessoaFk;
	@Column(name="tipo_dependencia",nullable=false,length=25)
	private String tipoDependencia;
	@Column(name="grau_dependencia",nullable=true,length=25)
	private String grauDependencia;
	@Column(name="autocuidado",nullable=true,length=25)
	private String autocuidado;
	@Column(name="origem_dependencia",nullable=true,length=25)
	private String origemDependencia;
	@Temporal(TemporalType.DATE)
	@Column(name="data_dependencia",nullable=true,length=13)
	private Date dataDependencia;
	@Column(name="tempo_dependencia",nullable=true,length=25)
	private String tempoDependencia;
	@Column(name="instalacao_dependencia",nullable=true,length=25)
	private String instalacaoDependencia;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TPessoa getPessoaFk() {
		return pessoaFk;
	}
	public void setPessoaFk(TPessoa pessoaFk) {
		this.pessoaFk = pessoaFk;
	}
	public String getTipoDependencia() {
		return tipoDependencia;
	}
	
	public void setTipoDependencia(String tipoDependencia) {
		this.tipoDependencia = tipoDependencia;
	}
	public String getGrauDependencia() {
		return grauDependencia;
	}
	public void setGrauDependencia(String grauDependencia) {
		this.grauDependencia = grauDependencia;
	}
	public String getAutocuidado() {
		return autocuidado;
	}
	public void setAutocuidado(String autocuidado) {
		this.autocuidado = autocuidado;
	}
	public String getOrigemDependencia() {
		return origemDependencia;
	}
	public void setOrigemDependencia(String origemDependencia) {
		this.origemDependencia = origemDependencia;
	}
	public Date getDataDependencia() {
		return dataDependencia;
	}
	public void setDataDependencia(Date dataDependencia) {
		this.dataDependencia = dataDependencia;
	}
	public String getTempoDependencia() {
		return tempoDependencia;
	}
	public void setTempoDependencia(String tempoDependencia) {
		this.tempoDependencia = tempoDependencia;
	}
	public String getInstalacaoDependencia() {
		return instalacaoDependencia;
	}
	public void setInstalacaoDependencia(String instalacaoDependencia) {
		this.instalacaoDependencia = instalacaoDependencia;
	}
	
}