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

/**
 * @author: Nositeste
 * 2020-11-02
*/

@Entity
@Table(name="t_agregado",schema="public")
@NamedQuery(name="TAgregado.findAll", query="SELECT b FROM TAgregado b")
public class TAgregado extends BaseActiveRecord<TAgregado> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="pessoa_fk", foreignKey=@ForeignKey(name="Ref_t_agregado_to_t_pessoa"), nullable=true)
	private TPessoa pessoaFk;
	@Column(name="pessoa_agregado_fk",nullable=true,length=11)
	private Integer pessoaAgregadoFk;
	@Column(name="parentesco",nullable=true)
	private String parentesco;

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
	public Integer getPessoaAgregadoFk() {
		return pessoaAgregadoFk;
	}
	public void setPessoaAgregadoFk(Integer pessoaAgregadoFk) {
		this.pessoaAgregadoFk = pessoaAgregadoFk;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
}