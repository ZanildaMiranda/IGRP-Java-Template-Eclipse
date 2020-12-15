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
/**
 * @author: Nositeste
 * 2020-10-21
*/

@Entity
@Table(name="tbl_detalhe_dependente",schema="public")
@NamedQuery(name="TblDetalheDependente.findAll", query="SELECT b FROM TblDetalheDependente b")
public class TblDetalheDependente extends BaseActiveRecord<TblDetalheDependente> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detalhe_dependente", nullable=false)
	private Integer idDetalheDependente;
	@Column(name="parente",nullable=false)
	private String parente;
	@Column(name="pensionista",nullable=false)
	private String pensionista;
	@Column(name="Origem",nullable=false)
	private String origem;
	@Column(name="tipo_dependencia",nullable=false)
	private String tipoDependencia;
	@Column(name="habilitacao_literaria",nullable=false)
	private String habilitacaoLiteraria;
	@Column(name="instalacao_dependencia",nullable=false)
	private String instalacaoDependencia;
	@Temporal(TemporalType.DATE)
	@Column(name="tempo_dependencia",nullable=false,length=13)
	private Date tempoDependencia;

	public Integer getIdDetalheDependente() {
		return idDetalheDependente;
	}
	public void setIdDetalheDependente(Integer idDetalheDependente) {
		this.idDetalheDependente = idDetalheDependente;
	}
	public String getParente() {
		return parente;
	}
	public void setParente(String parente) {
		this.parente = parente;
	}
	public String getPensionista() {
		return pensionista;
	}
	public void setPensionista(String pensionista) {
		this.pensionista = pensionista;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getTipoDependencia() {
		return tipoDependencia;
	}
	public void setTipoDependencia(String tipoDependencia) {
		this.tipoDependencia = tipoDependencia;
	}
	public String getHabilitacaoLiteraria() {
		return habilitacaoLiteraria;
	}
	public void setHabilitacaoLiteraria(String habilitacaoLiteraria) {
		this.habilitacaoLiteraria = habilitacaoLiteraria;
	}
	public String getInstalacaoDependencia() {
		return instalacaoDependencia;
	}
	public void setInstalacaoDependencia(String instalacaoDependencia) {
		this.instalacaoDependencia = instalacaoDependencia;
	}
	public Date getTempoDependencia() {
		return tempoDependencia;
	}
	public void setTempoDependencia(Date tempoDependencia) {
		this.tempoDependencia = tempoDependencia;
	}
}