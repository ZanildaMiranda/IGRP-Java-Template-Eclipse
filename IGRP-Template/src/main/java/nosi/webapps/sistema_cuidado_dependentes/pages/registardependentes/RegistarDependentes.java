package nosi.webapps.sistema_cuidado_dependentes.pages.registardependentes;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class RegistarDependentes extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_dependentes")
	private String dependentes;

	@RParam(rParamName = "p_detalhe_dependente")
	private String detalhe_dependente;

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

	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@NotNull()
	@RParam(rParamName = "p_grau_de_dependencia")
	private String grau_de_dependencia;

	@NotNull()
	@RParam(rParamName = "p_nacionalidade")
	private String nacionalidade;

	@NotNull()
	@RParam(rParamName = "p_profissao")
	private String profissao;

	@NotNull()
	@RParam(rParamName = "p_estado_civil")
	private String estado_civil;

	@NotNull()
	@RParam(rParamName = "p_autocuidado")
	private String autocuidado;

	@NotNull()
	@RParam(rParamName = "p_email")
	private String email;

	@NotNull()
	@RParam(rParamName = "p_cuidador")
	private String cuidador;

	@RParam(rParamName = "p_id_dependente")
	private Integer id_dependente;

	@NotNull()
	@RParam(rParamName = "p_parente")
	private String parente;

	@NotNull()
	@RParam(rParamName = "p_classe_dependencia")
	private String classe_dependencia;

	@NotNull()
	@RParam(rParamName = "p_origem")
	private String origem;

	@RParam(rParamName = "p_pensionista")
	private String pensionista;

	@NotNull()
	@RParam(rParamName = "p_habiliatacao_literaria")
	private String habiliatacao_literaria;

	@NotNull()
	@RParam(rParamName = "p_instalacao_dependencia")
	private String instalacao_dependencia;

	@NotNull()
	@RParam(rParamName = "p_tempo_de_dependencia")
	private String tempo_de_dependencia;

	@NotNull()
	@RParam(rParamName = "p_id_detalhe_dependente")
	private Integer id_detalhe_dependente;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setDependentes(String dependentes){
		this.dependentes = dependentes;
	}
	public String getDependentes(){
		return this.dependentes;
	}
	
	public void setDetalhe_dependente(String detalhe_dependente){
		this.detalhe_dependente = detalhe_dependente;
	}
	public String getDetalhe_dependente(){
		return this.detalhe_dependente;
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
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setGrau_de_dependencia(String grau_de_dependencia){
		this.grau_de_dependencia = grau_de_dependencia;
	}
	public String getGrau_de_dependencia(){
		return this.grau_de_dependencia;
	}
	
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public String getNacionalidade(){
		return this.nacionalidade;
	}
	
	public void setProfissao(String profissao){
		this.profissao = profissao;
	}
	public String getProfissao(){
		return this.profissao;
	}
	
	public void setEstado_civil(String estado_civil){
		this.estado_civil = estado_civil;
	}
	public String getEstado_civil(){
		return this.estado_civil;
	}
	
	public void setAutocuidado(String autocuidado){
		this.autocuidado = autocuidado;
	}
	public String getAutocuidado(){
		return this.autocuidado;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setCuidador(String cuidador){
		this.cuidador = cuidador;
	}
	public String getCuidador(){
		return this.cuidador;
	}
	
	public void setId_dependente(Integer id_dependente){
		this.id_dependente = id_dependente;
	}
	public Integer getId_dependente(){
		return this.id_dependente;
	}
	
	public void setParente(String parente){
		this.parente = parente;
	}
	public String getParente(){
		return this.parente;
	}
	
	public void setClasse_dependencia(String classe_dependencia){
		this.classe_dependencia = classe_dependencia;
	}
	public String getClasse_dependencia(){
		return this.classe_dependencia;
	}
	
	public void setOrigem(String origem){
		this.origem = origem;
	}
	public String getOrigem(){
		return this.origem;
	}
	
	public void setPensionista(String pensionista){
		this.pensionista = pensionista;
	}
	public String getPensionista(){
		return this.pensionista;
	}
	
	public void setHabiliatacao_literaria(String habiliatacao_literaria){
		this.habiliatacao_literaria = habiliatacao_literaria;
	}
	public String getHabiliatacao_literaria(){
		return this.habiliatacao_literaria;
	}
	
	public void setInstalacao_dependencia(String instalacao_dependencia){
		this.instalacao_dependencia = instalacao_dependencia;
	}
	public String getInstalacao_dependencia(){
		return this.instalacao_dependencia;
	}
	
	public void setTempo_de_dependencia(String tempo_de_dependencia){
		this.tempo_de_dependencia = tempo_de_dependencia;
	}
	public String getTempo_de_dependencia(){
		return this.tempo_de_dependencia;
	}
	
	public void setId_detalhe_dependente(Integer id_detalhe_dependente){
		this.id_detalhe_dependente = id_detalhe_dependente;
	}
	public Integer getId_detalhe_dependente(){
		return this.id_detalhe_dependente;
	}



}
