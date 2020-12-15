package nosi.webapps.sistema_cuidado_dependentes.pages.registar_cuidadores;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_cuidadores extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_morada")
	private String morada;

	@NotNull()
	@RParam(rParamName = "p_telefone")
	private Integer telefone;

	@NotNull()
	@RParam(rParamName = "p_sexo")
	private String sexo;

	@NotNull()
	@RParam(rParamName = "p_tipo")
	private String tipo;

	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@NotNull()
	@RParam(rParamName = "p_email")
	private String email;

	@NotNull()
	@RParam(rParamName = "p_formacao")
	private String formacao;

	@NotNull()
	@RParam(rParamName = "p_unidade_cuidado")
	private String unidade_cuidado;

	@RParam(rParamName = "p_id_cuidador")
	private Integer id_cuidador;
	
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
	
	public void setMorada(String morada){
		this.morada = morada;
	}
	public String getMorada(){
		return this.morada;
	}
	
	public void setTelefone(Integer telefone){
		this.telefone = telefone;
	}
	public Integer getTelefone(){
		return this.telefone;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public String getSexo(){
		return this.sexo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return this.tipo;
	}
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setFormacao(String formacao){
		this.formacao = formacao;
	}
	public String getFormacao(){
		return this.formacao;
	}
	
	public void setUnidade_cuidado(String unidade_cuidado){
		this.unidade_cuidado = unidade_cuidado;
	}
	public String getUnidade_cuidado(){
		return this.unidade_cuidado;
	}
	
	public void setId_cuidador(Integer id_cuidador){
		this.id_cuidador = id_cuidador;
	}
	public Integer getId_cuidador(){
		return this.id_cuidador;
	}



}
