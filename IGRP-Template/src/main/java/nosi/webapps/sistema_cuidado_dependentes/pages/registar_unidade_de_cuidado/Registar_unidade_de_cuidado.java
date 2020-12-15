package nosi.webapps.sistema_cuidado_dependentes.pages.registar_unidade_de_cuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_unidade_de_cuidado extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_codigo")
	private String codigo;

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
	private String nif;

	@NotNull()
	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_id_unidade_cuidado")
	private Integer id_unidade_cuidado;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
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
	
	public void setNif(String nif){
		this.nif = nif;
	}
	public String getNif(){
		return this.nif;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setId_unidade_cuidado(Integer id_unidade_cuidado){
		this.id_unidade_cuidado = id_unidade_cuidado;
	}
	public Integer getId_unidade_cuidado(){
		return this.id_unidade_cuidado;
	}



}
