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

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste
 * 2020-11-02
*/

@Entity
@Table(name="t_identificacao",schema="public")
@NamedQuery(name="TIdentificacao.findAll", query="SELECT b FROM TIdentificacao b")
public class TIdentificacao extends BaseActiveRecord<TIdentificacao> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="tipo_identificacao",nullable=true,length=25)
	private String tipoIdentificacao;
	@Column(name="numero",nullable=false,length=25)
	private String numero;
	@Temporal(TemporalType.DATE)
	@Column(name="data_emissao",nullable=true,length=13)
	private Date dataEmissao;
	@Temporal(TemporalType.DATE)
	@Column(name="data_validade",nullable=true,length=13)
	private Date dataValidade;
	@Column(name="entidade_emissora",nullable=true,length=250)
	private String entidadeEmissora;
	@Column(name="vitalicio",nullable=true,length=1)
	private String vitalicio;
	@Column(name="ficheiro",nullable=true,length=100)
	private String ficheiro;
	@ManyToOne
	@JoinColumn(name="pessoa_fk", foreignKey=@ForeignKey(name="Ref_t_identificacao_to_t_pessoa"), nullable=true)
	private TPessoa pessoaFk;
	@Column(name="entidade_fk",nullable=true,length=11)
	private Integer entidadeFk;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoIdentificacao() {
		return tipoIdentificacao;
	}
	public void setTipoIdentificacao(String tipoIdentificacao) {
		this.tipoIdentificacao = tipoIdentificacao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getEntidadeEmissora() {
		return entidadeEmissora;
	}
	public void setEntidadeEmissora(String entidadeEmissora) {
		this.entidadeEmissora = entidadeEmissora;
	}
	public String getVitalicio() {
		return vitalicio;
	}
	public void setVitalicio(String vitalicio) {
		this.vitalicio = vitalicio;
	}
	public String getFicheiro() {
		return ficheiro;
	}
	public void setFicheiro(String ficheiro) {
		this.ficheiro = ficheiro;
	}
	public TPessoa getPessoaFk() {
		return pessoaFk;
	}
	public void setPessoaFk(TPessoa pessoaFk) {
		this.pessoaFk = pessoaFk;
	}
	public Integer getEntidadeFk() {
		return entidadeFk;
	}
	public void setEntidadeFk(Integer entidadeFk) {
		this.entidadeFk = entidadeFk;
	}
}