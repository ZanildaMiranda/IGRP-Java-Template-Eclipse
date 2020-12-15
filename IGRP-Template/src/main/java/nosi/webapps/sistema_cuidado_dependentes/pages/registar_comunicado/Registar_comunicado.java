package nosi.webapps.sistema_cuidado_dependentes.pages.registar_comunicado;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_comunicado extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_titulo")
	private String titulo;

	@RParam(rParamName = "p_descriccao")
	private String descriccao;

	@NotNull()
	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_id_comunicado")
	private Integer id_comunicado;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return this.titulo;
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
	
	public void setId_comunicado(Integer id_comunicado){
		this.id_comunicado = id_comunicado;
	}
	public Integer getId_comunicado(){
		return this.id_comunicado;
	}



}
