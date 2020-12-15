package nosi.webapps.cuidado_dos_dependentes.pages.cadastrocuidadorform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class CadastroCuidadorForm extends Model{		

	@RParam(rParamName = "p_tab_dados_de_cuidador")
	private String tab_dados_de_cuidador;

	@RParam(rParamName = "p_contactos")
	private String contactos;

	@RParam(rParamName = "p_documentos")
	private String documentos;

	@RParam(rParamName = "p_dados_cuidador")
	private String dados_cuidador;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_tipo_de_cuidador")
	private String tipo_de_cuidador;

	@NotNull()
	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@NotNull()
	@RParam(rParamName = "p_nacionalidade")
	private String nacionalidade;

	@RParam(rParamName = "p_sexo")
	private String sexo;

	@NotNull()
	@RParam(rParamName = "p_habilitacao_literaria")
	private String habilitacao_literaria;

	@NotNull()
	@RParam(rParamName = "p_estado_civil")
	private String estado_civil;

	@NotNull()
	@RParam(rParamName = "p_profissao")
	private String profissao;
	
	@SeparatorList(name = Separatorlist_3.class)
	@Valid
	private List<Separatorlist_3> separatorlist_3 = new ArrayList<>();	
	public void setSeparatorlist_3(List<Separatorlist_3> separatorlist_3){
		this.separatorlist_3 = separatorlist_3;
	}
	public List<Separatorlist_3> getSeparatorlist_3(){
		return this.separatorlist_3;
	}
	@RParam(rParamName = "p_separatorlist_3_id")
	private String[] p_separatorlist_3_id;
	@RParam(rParamName = "p_separatorlist_3_del")
	private String[] p_separatorlist_3_del;
	@RParam(rParamName = "p_separatorlist_3_edit")
	private String[] p_separatorlist_3_edit;
	
	public void setP_separatorlist_3_id(String[] p_separatorlist_3_id){
		this.p_separatorlist_3_id = p_separatorlist_3_id;
	}
	public String[] getP_separatorlist_3_id(){
		return this.p_separatorlist_3_id;
	}
	
	public void setP_separatorlist_3_del(String[] p_separatorlist_3_del){
		this.p_separatorlist_3_del = p_separatorlist_3_del;
	}
	public String[] getP_separatorlist_3_del(){
		return this.p_separatorlist_3_del;
	}
	
	public void setP_separatorlist_3_edit(String[] p_separatorlist_3_edit){
		this.p_separatorlist_3_edit = p_separatorlist_3_edit;
	}
	public String[] getP_separatorlist_3_edit(){
		return this.p_separatorlist_3_edit;
	}
	
	@SeparatorList(name = Separatorlist_4.class)
	@Valid
	private List<Separatorlist_4> separatorlist_4 = new ArrayList<>();	
	public void setSeparatorlist_4(List<Separatorlist_4> separatorlist_4){
		this.separatorlist_4 = separatorlist_4;
	}
	public List<Separatorlist_4> getSeparatorlist_4(){
		return this.separatorlist_4;
	}
	@RParam(rParamName = "p_separatorlist_4_id")
	private String[] p_separatorlist_4_id;
	@RParam(rParamName = "p_separatorlist_4_del")
	private String[] p_separatorlist_4_del;
	@RParam(rParamName = "p_separatorlist_4_edit")
	private String[] p_separatorlist_4_edit;
	
	public void setP_separatorlist_4_id(String[] p_separatorlist_4_id){
		this.p_separatorlist_4_id = p_separatorlist_4_id;
	}
	public String[] getP_separatorlist_4_id(){
		return this.p_separatorlist_4_id;
	}
	
	public void setP_separatorlist_4_del(String[] p_separatorlist_4_del){
		this.p_separatorlist_4_del = p_separatorlist_4_del;
	}
	public String[] getP_separatorlist_4_del(){
		return this.p_separatorlist_4_del;
	}
	
	public void setP_separatorlist_4_edit(String[] p_separatorlist_4_edit){
		this.p_separatorlist_4_edit = p_separatorlist_4_edit;
	}
	public String[] getP_separatorlist_4_edit(){
		return this.p_separatorlist_4_edit;
	}
	
	public void setTab_dados_de_cuidador(String tab_dados_de_cuidador){
		this.tab_dados_de_cuidador = tab_dados_de_cuidador;
	}
	public String getTab_dados_de_cuidador(){
		return this.tab_dados_de_cuidador;
	}
	
	public void setContactos(String contactos){
		this.contactos = contactos;
	}
	public String getContactos(){
		return this.contactos;
	}
	
	public void setDocumentos(String documentos){
		this.documentos = documentos;
	}
	public String getDocumentos(){
		return this.documentos;
	}
	
	public void setDados_cuidador(String dados_cuidador){
		this.dados_cuidador = dados_cuidador;
	}
	public String getDados_cuidador(){
		return this.dados_cuidador;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setTipo_de_cuidador(String tipo_de_cuidador){
		this.tipo_de_cuidador = tipo_de_cuidador;
	}
	public String getTipo_de_cuidador(){
		return this.tipo_de_cuidador;
	}
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public String getNacionalidade(){
		return this.nacionalidade;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public String getSexo(){
		return this.sexo;
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
	
	public void setProfissao(String profissao){
		this.profissao = profissao;
	}
	public String getProfissao(){
		return this.profissao;
	}


	public static class Separatorlist_3{
		private Pair separatorlist_3_id;
		@PairNotNull()
private Pair tipo_de_contacto;
		@PairNotNull()
private Pair contacto;
		public void setSeparatorlist_3_id(Pair separatorlist_3_id){
			this.separatorlist_3_id = separatorlist_3_id;
		}
		public Pair getSeparatorlist_3_id(){
			return this.separatorlist_3_id;
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
	public static class Separatorlist_4{
		private Pair separatorlist_4_id;
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
		public void setSeparatorlist_4_id(Pair separatorlist_4_id){
			this.separatorlist_4_id = separatorlist_4_id;
		}
		public Pair getSeparatorlist_4_id(){
			return this.separatorlist_4_id;
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

	public void loadSeparatorlist_3(BaseQueryInterface query) {
		this.setSeparatorlist_3(this.loadFormList(query,Separatorlist_3.class));
	}

	public void loadSeparatorlist_4(BaseQueryInterface query) {
		this.setSeparatorlist_4(this.loadFormList(query,Separatorlist_4.class));
	}

}
