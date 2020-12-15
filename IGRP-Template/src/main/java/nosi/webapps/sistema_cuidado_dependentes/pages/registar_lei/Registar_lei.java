package nosi.webapps.sistema_cuidado_dependentes.pages.registar_lei;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_lei extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_numero")
	private Integer numero;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_descriccao")
	private String descriccao;

	@RParam(rParamName = "p_id_lei")
	private Integer id_lei;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setNumero(Integer numero){
		this.numero = numero;
	}
	public Integer getNumero(){
		return this.numero;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setUnidade_cuidado(String unidade_cuidado){
		this.unidade_cuidado = unidade_cuidado;
	}
	public String getUnidade_cuidado(){
		return this.unidade_cuidado;
	}
	
	public void setDescriccao(String descriccao){
		this.descriccao = descriccao;
	}
	public String getDescriccao(){
		return this.descriccao;
	}
	
	public void setId_lei(Integer id_lei){
		this.id_lei = id_lei;
	}
	public Integer getId_lei(){
		return this.id_lei;
	}



}
