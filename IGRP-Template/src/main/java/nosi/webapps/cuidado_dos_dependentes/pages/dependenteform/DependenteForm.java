package nosi.webapps.cuidado_dos_dependentes.pages.dependenteform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class DependenteForm extends Model{		

	@RParam(rParamName = "p_tab_dados_dependente")
	private String tab_dados_dependente;

	@RParam(rParamName = "p_detalhes_de_dependencias")
	private String detalhes_de_dependencias;

	@RParam(rParamName = "p_tab_agregado_familiar")
	private String tab_agregado_familiar;

	@RParam(rParamName = "p_tab_contactos")
	private String tab_contactos;

	@RParam(rParamName = "p_tab_documentos")
	private String tab_documentos;

	@RParam(rParamName = "p_dados_dependente")
	private String dados_dependente;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_nome_da_mae")
	private String nome_da_mae;

	@NotNull()
	@RParam(rParamName = "p_nome_do_pai")
	private String nome_do_pai;

	@NotNull()
	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@RParam(rParamName = "p_sexo")
	private String sexo;

	@NotNull()
	@RParam(rParamName = "p_nacionalidade")
	private String nacionalidade;

	@NotNull()
	@RParam(rParamName = "p_profissao")
	private String profissao;

	@NotNull()
	@RParam(rParamName = "p_habilitacao_literaria")
	private String habilitacao_literaria;

	@NotNull()
	@RParam(rParamName = "p_estado_civil")
	private String estado_civil;
	
	@SeparatorList(name = Sl_detalhes_dependentes.class)
	@Valid
	private List<Sl_detalhes_dependentes> sl_detalhes_dependentes = new ArrayList<>();	
	public void setSl_detalhes_dependentes(List<Sl_detalhes_dependentes> sl_detalhes_dependentes){
		this.sl_detalhes_dependentes = sl_detalhes_dependentes;
	}
	public List<Sl_detalhes_dependentes> getSl_detalhes_dependentes(){
		return this.sl_detalhes_dependentes;
	}
	@RParam(rParamName = "p_sl_detalhes_dependentes_id")
	private String[] p_sl_detalhes_dependentes_id;
	@RParam(rParamName = "p_sl_detalhes_dependentes_del")
	private String[] p_sl_detalhes_dependentes_del;
	@RParam(rParamName = "p_sl_detalhes_dependentes_edit")
	private String[] p_sl_detalhes_dependentes_edit;
	
	public void setP_sl_detalhes_dependentes_id(String[] p_sl_detalhes_dependentes_id){
		this.p_sl_detalhes_dependentes_id = p_sl_detalhes_dependentes_id;
	}
	public String[] getP_sl_detalhes_dependentes_id(){
		return this.p_sl_detalhes_dependentes_id;
	}
	
	public void setP_sl_detalhes_dependentes_del(String[] p_sl_detalhes_dependentes_del){
		this.p_sl_detalhes_dependentes_del = p_sl_detalhes_dependentes_del;
	}
	public String[] getP_sl_detalhes_dependentes_del(){
		return this.p_sl_detalhes_dependentes_del;
	}
	
	public void setP_sl_detalhes_dependentes_edit(String[] p_sl_detalhes_dependentes_edit){
		this.p_sl_detalhes_dependentes_edit = p_sl_detalhes_dependentes_edit;
	}
	public String[] getP_sl_detalhes_dependentes_edit(){
		return this.p_sl_detalhes_dependentes_edit;
	}
	
	@SeparatorList(name = Sl_agregado_familiar.class)
	@Valid
	private List<Sl_agregado_familiar> sl_agregado_familiar = new ArrayList<>();	
	public void setSl_agregado_familiar(List<Sl_agregado_familiar> sl_agregado_familiar){
		this.sl_agregado_familiar = sl_agregado_familiar;
	}
	public List<Sl_agregado_familiar> getSl_agregado_familiar(){
		return this.sl_agregado_familiar;
	}
	@RParam(rParamName = "p_sl_agregado_familiar_id")
	private String[] p_sl_agregado_familiar_id;
	@RParam(rParamName = "p_sl_agregado_familiar_del")
	private String[] p_sl_agregado_familiar_del;
	@RParam(rParamName = "p_sl_agregado_familiar_edit")
	private String[] p_sl_agregado_familiar_edit;
	
	public void setP_sl_agregado_familiar_id(String[] p_sl_agregado_familiar_id){
		this.p_sl_agregado_familiar_id = p_sl_agregado_familiar_id;
	}
	public String[] getP_sl_agregado_familiar_id(){
		return this.p_sl_agregado_familiar_id;
	}
	
	public void setP_sl_agregado_familiar_del(String[] p_sl_agregado_familiar_del){
		this.p_sl_agregado_familiar_del = p_sl_agregado_familiar_del;
	}
	public String[] getP_sl_agregado_familiar_del(){
		return this.p_sl_agregado_familiar_del;
	}
	
	public void setP_sl_agregado_familiar_edit(String[] p_sl_agregado_familiar_edit){
		this.p_sl_agregado_familiar_edit = p_sl_agregado_familiar_edit;
	}
	public String[] getP_sl_agregado_familiar_edit(){
		return this.p_sl_agregado_familiar_edit;
	}
	
	@SeparatorList(name = Sl_contactos.class)
	@Valid
	private List<Sl_contactos> sl_contactos = new ArrayList<>();	
	public void setSl_contactos(List<Sl_contactos> sl_contactos){
		this.sl_contactos = sl_contactos;
	}
	public List<Sl_contactos> getSl_contactos(){
		return this.sl_contactos;
	}
	@RParam(rParamName = "p_sl_contactos_id")
	private String[] p_sl_contactos_id;
	@RParam(rParamName = "p_sl_contactos_del")
	private String[] p_sl_contactos_del;
	@RParam(rParamName = "p_sl_contactos_edit")
	private String[] p_sl_contactos_edit;
	
	public void setP_sl_contactos_id(String[] p_sl_contactos_id){
		this.p_sl_contactos_id = p_sl_contactos_id;
	}
	public String[] getP_sl_contactos_id(){
		return this.p_sl_contactos_id;
	}
	
	public void setP_sl_contactos_del(String[] p_sl_contactos_del){
		this.p_sl_contactos_del = p_sl_contactos_del;
	}
	public String[] getP_sl_contactos_del(){
		return this.p_sl_contactos_del;
	}
	
	public void setP_sl_contactos_edit(String[] p_sl_contactos_edit){
		this.p_sl_contactos_edit = p_sl_contactos_edit;
	}
	public String[] getP_sl_contactos_edit(){
		return this.p_sl_contactos_edit;
	}
	
	@SeparatorList(name = Sl_documentos_identificacao.class)
	@Valid
	private List<Sl_documentos_identificacao> sl_documentos_identificacao = new ArrayList<>();	
	public void setSl_documentos_identificacao(List<Sl_documentos_identificacao> sl_documentos_identificacao){
		this.sl_documentos_identificacao = sl_documentos_identificacao;
	}
	public List<Sl_documentos_identificacao> getSl_documentos_identificacao(){
		return this.sl_documentos_identificacao;
	}
	@RParam(rParamName = "p_sl_documentos_identificacao_id")
	private String[] p_sl_documentos_identificacao_id;
	@RParam(rParamName = "p_sl_documentos_identificacao_del")
	private String[] p_sl_documentos_identificacao_del;
	@RParam(rParamName = "p_sl_documentos_identificacao_edit")
	private String[] p_sl_documentos_identificacao_edit;
	
	public void setP_sl_documentos_identificacao_id(String[] p_sl_documentos_identificacao_id){
		this.p_sl_documentos_identificacao_id = p_sl_documentos_identificacao_id;
	}
	public String[] getP_sl_documentos_identificacao_id(){
		return this.p_sl_documentos_identificacao_id;
	}
	
	public void setP_sl_documentos_identificacao_del(String[] p_sl_documentos_identificacao_del){
		this.p_sl_documentos_identificacao_del = p_sl_documentos_identificacao_del;
	}
	public String[] getP_sl_documentos_identificacao_del(){
		return this.p_sl_documentos_identificacao_del;
	}
	
	public void setP_sl_documentos_identificacao_edit(String[] p_sl_documentos_identificacao_edit){
		this.p_sl_documentos_identificacao_edit = p_sl_documentos_identificacao_edit;
	}
	public String[] getP_sl_documentos_identificacao_edit(){
		return this.p_sl_documentos_identificacao_edit;
	}
	
	public void setTab_dados_dependente(String tab_dados_dependente){
		this.tab_dados_dependente = tab_dados_dependente;
	}
	public String getTab_dados_dependente(){
		return this.tab_dados_dependente;
	}
	
	public void setDetalhes_de_dependencias(String detalhes_de_dependencias){
		this.detalhes_de_dependencias = detalhes_de_dependencias;
	}
	public String getDetalhes_de_dependencias(){
		return this.detalhes_de_dependencias;
	}
	
	public void setTab_agregado_familiar(String tab_agregado_familiar){
		this.tab_agregado_familiar = tab_agregado_familiar;
	}
	public String getTab_agregado_familiar(){
		return this.tab_agregado_familiar;
	}
	
	public void setTab_contactos(String tab_contactos){
		this.tab_contactos = tab_contactos;
	}
	public String getTab_contactos(){
		return this.tab_contactos;
	}
	
	public void setTab_documentos(String tab_documentos){
		this.tab_documentos = tab_documentos;
	}
	public String getTab_documentos(){
		return this.tab_documentos;
	}
	
	public void setDados_dependente(String dados_dependente){
		this.dados_dependente = dados_dependente;
	}
	public String getDados_dependente(){
		return this.dados_dependente;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setNome_da_mae(String nome_da_mae){
		this.nome_da_mae = nome_da_mae;
	}
	public String getNome_da_mae(){
		return this.nome_da_mae;
	}
	
	public void setNome_do_pai(String nome_do_pai){
		this.nome_do_pai = nome_do_pai;
	}
	public String getNome_do_pai(){
		return this.nome_do_pai;
	}
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public String getSexo(){
		return this.sexo;
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
	
	public void setHabilitacao_literaria(String habilitacao_literaria){
		this.habilitacao_literaria = habilitacao_literaria;
	}
	public String getHabilitacao_literaria(){
		return this.habilitacao_literaria;
	}
	
	public void setEstado_civil(String estado_civil){
		this.estado_civil = estado_civil;
	}
	public String getEstado_civil(){
		return this.estado_civil;
	}


	public static class Sl_detalhes_dependentes{
		private Pair sl_detalhes_dependentes_id;
		@PairNotNull()
private Pair tipo_de_dependencia;
		@PairNotNull()
private Pair grau_de_dependencia;
		@PairNotNull()
private Pair autocuidado;
		@PairNotNull()
private Pair origem_de_dependencia;
		@PairNotNull()
private Pair instalacao_de_dependencia;
		@PairNotNull()
private Pair data_de_dependencia;
		@PairNotNull()
private Pair tempo_de_dependencia;
		public void setSl_detalhes_dependentes_id(Pair sl_detalhes_dependentes_id){
			this.sl_detalhes_dependentes_id = sl_detalhes_dependentes_id;
		}
		public Pair getSl_detalhes_dependentes_id(){
			return this.sl_detalhes_dependentes_id;
		}
		public void setTipo_de_dependencia(Pair tipo_de_dependencia){
			this.tipo_de_dependencia = tipo_de_dependencia;
		}
		public Pair getTipo_de_dependencia(){
			return this.tipo_de_dependencia;
		}

		public void setGrau_de_dependencia(Pair grau_de_dependencia){
			this.grau_de_dependencia = grau_de_dependencia;
		}
		public Pair getGrau_de_dependencia(){
			return this.grau_de_dependencia;
		}

		public void setAutocuidado(Pair autocuidado){
			this.autocuidado = autocuidado;
		}
		public Pair getAutocuidado(){
			return this.autocuidado;
		}

		public void setOrigem_de_dependencia(Pair origem_de_dependencia){
			this.origem_de_dependencia = origem_de_dependencia;
		}
		public Pair getOrigem_de_dependencia(){
			return this.origem_de_dependencia;
		}

		public void setInstalacao_de_dependencia(Pair instalacao_de_dependencia){
			this.instalacao_de_dependencia = instalacao_de_dependencia;
		}
		public Pair getInstalacao_de_dependencia(){
			return this.instalacao_de_dependencia;
		}

		public void setData_de_dependencia(Pair data_de_dependencia){
			this.data_de_dependencia = data_de_dependencia;
		}
		public Pair getData_de_dependencia(){
			return this.data_de_dependencia;
		}

		public void setTempo_de_dependencia(Pair tempo_de_dependencia){
			this.tempo_de_dependencia = tempo_de_dependencia;
		}
		public Pair getTempo_de_dependencia(){
			return this.tempo_de_dependencia;
		}

	}
	public static class Sl_agregado_familiar{
		private Pair sl_agregado_familiar_id;
		@PairNotNull()
private Pair nome_completo;
		@PairNotNull()
private Pair grau_de_parentesco;
		@PairNotNull()
private Pair data_de_nascimento;
		public void setSl_agregado_familiar_id(Pair sl_agregado_familiar_id){
			this.sl_agregado_familiar_id = sl_agregado_familiar_id;
		}
		public Pair getSl_agregado_familiar_id(){
			return this.sl_agregado_familiar_id;
		}
		public void setNome_completo(Pair nome_completo){
			this.nome_completo = nome_completo;
		}
		public Pair getNome_completo(){
			return this.nome_completo;
		}

		public void setGrau_de_parentesco(Pair grau_de_parentesco){
			this.grau_de_parentesco = grau_de_parentesco;
		}
		public Pair getGrau_de_parentesco(){
			return this.grau_de_parentesco;
		}

		public void setData_de_nascimento(Pair data_de_nascimento){
			this.data_de_nascimento = data_de_nascimento;
		}
		public Pair getData_de_nascimento(){
			return this.data_de_nascimento;
		}

	}
	public static class Sl_contactos{
		private Pair sl_contactos_id;
		@PairNotNull()
private Pair tipo_de_contacto;
		@PairNotNull()
private Pair contacto;
		public void setSl_contactos_id(Pair sl_contactos_id){
			this.sl_contactos_id = sl_contactos_id;
		}
		public Pair getSl_contactos_id(){
			return this.sl_contactos_id;
		}
		public void setTipo_de_contacto(Pair tipo_de_contacto){
			this.tipo_de_contacto = tipo_de_contacto;
		}
		public Pair getTipo_de_contacto(){
			return this.tipo_de_contacto;
		}

		public void setContacto(Pair contacto){
			this.contacto = contacto;
		}
		public Pair getContacto(){
			return this.contacto;
		}

	}
	public static class Sl_documentos_identificacao{
		private Pair sl_documentos_identificacao_id;
		@PairNotNull()
private Pair tipo_identificacao;
private Pair numero;
		@PairNotNull()
private Pair data_emissao;
private Pair data_de_validade;
		@PairNotNull()
private Pair vitalicio;
		@PairNotNull()
private Pair entidade_emissora;
private Pair ficheiro;
		public void setSl_documentos_identificacao_id(Pair sl_documentos_identificacao_id){
			this.sl_documentos_identificacao_id = sl_documentos_identificacao_id;
		}
		public Pair getSl_documentos_identificacao_id(){
			return this.sl_documentos_identificacao_id;
		}
		public void setTipo_identificacao(Pair tipo_identificacao){
			this.tipo_identificacao = tipo_identificacao;
		}
		public Pair getTipo_identificacao(){
			return this.tipo_identificacao;
		}

		public void setNumero(Pair numero){
			this.numero = numero;
		}
		public Pair getNumero(){
			return this.numero;
		}

		public void setData_emissao(Pair data_emissao){
			this.data_emissao = data_emissao;
		}
		public Pair getData_emissao(){
			return this.data_emissao;
		}

		public void setData_de_validade(Pair data_de_validade){
			this.data_de_validade = data_de_validade;
		}
		public Pair getData_de_validade(){
			return this.data_de_validade;
		}

		public void setVitalicio(Pair vitalicio){
			this.vitalicio = vitalicio;
		}
		public Pair getVitalicio(){
			return this.vitalicio;
		}

		public void setEntidade_emissora(Pair entidade_emissora){
			this.entidade_emissora = entidade_emissora;
		}
		public Pair getEntidade_emissora(){
			return this.entidade_emissora;
		}

		public void setFicheiro(Pair ficheiro){
			this.ficheiro = ficheiro;
		}
		public Pair getFicheiro(){
			return this.ficheiro;
		}

	}

	public void loadSl_detalhes_dependentes(BaseQueryInterface query) {
		this.setSl_detalhes_dependentes(this.loadFormList(query,Sl_detalhes_dependentes.class));
	}

	public void loadSl_agregado_familiar(BaseQueryInterface query) {
		this.setSl_agregado_familiar(this.loadFormList(query,Sl_agregado_familiar.class));
	}

	public void loadSl_contactos(BaseQueryInterface query) {
		this.setSl_contactos(this.loadFormList(query,Sl_contactos.class));
	}

	public void loadSl_documentos_identificacao(BaseQueryInterface query) {
		this.setSl_documentos_identificacao(this.loadFormList(query,Sl_documentos_identificacao.class));
	}

}
