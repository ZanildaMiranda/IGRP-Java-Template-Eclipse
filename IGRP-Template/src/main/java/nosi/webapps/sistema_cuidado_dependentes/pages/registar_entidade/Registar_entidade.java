package nosi.webapps.sistema_cuidado_dependentes.pages.registar_entidade;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_entidade extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_localidade")
	private String localidade;

	@NotNull()
	@RParam(rParamName = "p_telefone")
	private Integer telefone;

	@RParam(rParamName = "p_nif")
	private Integer nif;

	@NotNull()
	@RParam(rParamName = "p_email")
	private String email;

	@NotNull()
	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_id_entidade")
	private Integer id_entidade;
	
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
	
	public void setLocalidade(String localidade){
		this.localidade = localidade;
	}
	public String getLocalidade(){
		return this.localidade;
	}
	
	public void setTelefone(Integer telefone){
		this.telefone = telefone;
	}
	public Integer getTelefone(){
		return this.telefone;
	}
	
	public void setNif(Integer nif){
		this.nif = nif;
	}
	public Integer getNif(){
		return this.nif;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setUnidade_cuidado(String unidade_cuidado){
		this.unidade_cuidado = unidade_cuidado;
	}
	public String getUnidade_cuidado(){
		return this.unidade_cuidado;
	}
	
	public void setId_entidade(Integer id_entidade){
		this.id_entidade = id_entidade;
	}
	public Integer getId_entidade(){
		return this.id_entidade;
	}



}
