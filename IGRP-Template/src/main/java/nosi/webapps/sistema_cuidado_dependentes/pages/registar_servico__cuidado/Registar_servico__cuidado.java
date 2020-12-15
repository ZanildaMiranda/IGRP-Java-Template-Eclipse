package nosi.webapps.sistema_cuidado_dependentes.pages.registar_servico__cuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_servico__cuidado extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_tipo")
	private String tipo;

	@RParam(rParamName = "p_descriccao")
	private String descriccao;

	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@NotNull()
	@RParam(rParamName = "p_dependente")
	private String dependente;

	@NotNull()
	@RParam(rParamName = "p_id_servico_cuidado")
	private Integer id_servico_cuidado;

	@RParam(rParamName = "p_id_unidade_cuidado")
	private int id_unidade_cuidado;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return this.tipo;
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
	
	public void setDependente(String dependente){
		this.dependente = dependente;
	}
	public String getDependente(){
		return this.dependente;
	}
	
	public void setId_servico_cuidado(Integer id_servico_cuidado){
		this.id_servico_cuidado = id_servico_cuidado;
	}
	public Integer getId_servico_cuidado(){
		return this.id_servico_cuidado;
	}
	
	public void setId_unidade_cuidado(int id_unidade_cuidado){
		this.id_unidade_cuidado = id_unidade_cuidado;
	}
	public int getId_unidade_cuidado(){
		return this.id_unidade_cuidado;
	}



}
