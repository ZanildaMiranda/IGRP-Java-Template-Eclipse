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
 * 2020-11-12
*/

@Entity
@Table(name="t_cuidador",schema="public")
@NamedQuery(name="TCuidador.findAll", query="SELECT b FROM TCuidador b")
public class TCuidador extends BaseActiveRecord<TCuidador> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="pessoa_fk", foreignKey=@ForeignKey(name="Ref_t_cuidador_to_t_pessoa"), nullable=false)
	private TPessoa pessoaFk;
	@Column(name="tipo",nullable=true)
	private String tipo;

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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}