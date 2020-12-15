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

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste
 * 2020-10-27
*/

@Entity
@Table(name="tbl_servico_cuidado",schema="public")
@NamedQuery(name="TblServicoCuidado.findAll", query="SELECT b FROM TblServicoCuidado b")
public class TblServicoCuidado extends BaseActiveRecord<TblServicoCuidado> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_servico_cuidado", nullable=false)
	private Integer idServicoCuidado;
	@Column(name="tipo",nullable=false)
	private String tipo;
	@ManyToOne
	@JoinColumn(name="id_unidade_cuidado_fk", foreignKey=@ForeignKey(name="unidade_cuidado_fk"), nullable=true)
	private TblUnidadeCuidado idUnidadeCuidadoFk;
	@ManyToOne
	@JoinColumn(name="id_dependente_fk", foreignKey=@ForeignKey(name="dependente_fk"), nullable=true)
	private TblDependente idDependenteFk;
	@Column(name="descricao",nullable=false)
	private String descricao;

	public Integer getIdServicoCuidado() {
		return idServicoCuidado;
	}
	public void setIdServicoCuidado(Integer idServicoCuidado) {
		this.idServicoCuidado = idServicoCuidado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TblUnidadeCuidado getIdUnidadeCuidadoFk() {
		return idUnidadeCuidadoFk;
	}
	public void setIdUnidadeCuidadoFk(TblUnidadeCuidado idUnidadeCuidadoFk) {
		this.idUnidadeCuidadoFk = idUnidadeCuidadoFk;
	}
	public TblDependente getIdDependenteFk() {
		return idDependenteFk;
	}
	public void setIdDependenteFk(TblDependente idDependenteFk) {
		this.idDependenteFk = idDependenteFk;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}