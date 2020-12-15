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
@Table(name="t_contato",schema="public")
@NamedQuery(name="TContato.findAll", query="SELECT b FROM TContato b")
public class TContato extends BaseActiveRecord<TContato> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="pessoa_fk", foreignKey=@ForeignKey(name="Ref_t_contato_to_t_pessoa"), nullable=true)
	private TPessoa pessoaFk;
	@Column(name="tipo_contato",nullable=false,length=25)
	private String tipoContato;
	@Column(name="contato",nullable=false,length=500)
	private String contato;
	@Column(name="entidade_fk",nullable=true,length=11)
	private Integer entidadeFk;

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
	public String getTipoContato() {
		return tipoContato;
	}
	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Integer getEntidadeFk() {
		return entidadeFk;
	}
	public void setEntidadeFk(Integer entidadeFk) {
		this.entidadeFk = entidadeFk;
	}
}