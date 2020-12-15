package nosi.webapps.sistema_cuidado_dependentes.pages.registar_norma;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_norma extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_descriccao")
	private String descriccao;

	@NotNull()
	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_id_norma")
	private Integer id_norma;
	
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
	
	public void setDescriccao(String descriccao){
		this.descriccao = descriccao;
	}
	public String getDescriccao(){
		return this.descriccao;
	}
	
	public void setUnidade_cuidado(String unidade_cuidado){
		this.unidade_cuidado = unidade_cuidado;
	}
	public String getUnidade_cuidado(){
		return this.unidade_cuidado;
	}
	
	public void setId_norma(Integer id_norma){
		this.id_norma = id_norma;
	}
	public Integer getId_norma(){
		return this.id_norma;
	}



}
