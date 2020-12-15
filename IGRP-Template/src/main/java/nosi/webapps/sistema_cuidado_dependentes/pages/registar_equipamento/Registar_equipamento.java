package nosi.webapps.sistema_cuidado_dependentes.pages.registar_equipamento;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_equipamento extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_quantidade")
	private Integer quantidade;

	@RParam(rParamName = "p_utilidade")
	private String utilidade;

	@NotNull()
	@RParam(rParamName = "p_caracteristica")
	private String caracteristica;

	@NotNull()
	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_id_equipamento")
	private Integer id_equipamento;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setQuantidade(Integer quantidade){
		this.quantidade = quantidade;
	}
	public Integer getQuantidade(){
		return this.quantidade;
	}
	
	public void setUtilidade(String utilidade){
		this.utilidade = utilidade;
	}
	public String getUtilidade(){
		return this.utilidade;
	}
	
	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	public String getCaracteristica(){
		return this.caracteristica;
	}
	
	public void setUnidade_cuidado(String unidade_cuidado){
		this.unidade_cuidado = unidade_cuidado;
	}
	public String getUnidade_cuidado(){
		return this.unidade_cuidado;
	}
	
	public void setId_equipamento(Integer id_equipamento){
		this.id_equipamento = id_equipamento;
	}
	public Integer getId_equipamento(){
		return this.id_equipamento;
	}



}
