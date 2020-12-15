package nosi.webapps.cuidado_dos_dependentes.pages.dependenteform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class DependenteFormView extends View {

	public Field tab_dados_dependente;
	public Field detalhes_de_dependencias;
	public Field tab_agregado_familiar;
	public Field tab_contactos;
	public Field tab_documentos;
	public Field dados_dependente;
	public Field nome;
	public Field nome_da_mae;
	public Field nome_do_pai;
	public Field data_nascimento;
	public Field sexo;
	public Field nacionalidade;
	public Field profissao;
	public Field habilitacao_literaria;
	public Field estado_civil;
	public Field tipo_de_dependencia;
	public Field grau_de_dependencia;
	public Field autocuidado;
	public Field origem_de_dependencia;
	public Field instalacao_de_dependencia;
	public Field data_de_dependencia;
	public Field tempo_de_dependencia;
	public Field nome_completo;
	public Field grau_de_parentesco;
	public Field data_de_nascimento;
	public Field tipo_de_contacto;
	public Field contacto;
	public Field tipo_identificacao;
	public Field numero;
	public Field data_emissao;
	public Field data_de_validade;
	public Field vitalicio;
	public Field entidade_emissora;
	public Field ficheiro;
	public IGRPTabContent tabcontent_1;
	public IGRPForm form_1;
	public IGRPSeparatorList sl_detalhes_dependentes;
	public IGRPSeparatorList sl_agregado_familiar;
	public IGRPSeparatorList sl_contactos;
	public IGRPSeparatorList sl_documentos_identificacao;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_guardar;

	public DependenteFormView(){

		this.setPageTitle("Cadastro Dependente");
			
		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		form_1 = new IGRPForm("form_1","");

		sl_detalhes_dependentes = new IGRPSeparatorList("sl_detalhes_dependentes","");

		sl_agregado_familiar = new IGRPSeparatorList("sl_agregado_familiar","");

		sl_contactos = new IGRPSeparatorList("sl_contactos","");

		sl_documentos_identificacao = new IGRPSeparatorList("sl_documentos_identificacao","");

		tab_dados_dependente = new TextField(model,"tab_dados_dependente");
		tab_dados_dependente.setLabel(gt("Dados Dependente"));
		tab_dados_dependente.propertie().add("name","p_tab_dados_dependente").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-user-o").add("maxlength","50");
		
		detalhes_de_dependencias = new TextField(model,"detalhes_de_dependencias");
		detalhes_de_dependencias.setLabel(gt("Detalhes de Dependências"));
		detalhes_de_dependencias.propertie().add("name","p_detalhes_de_dependencias").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-wheelchair").add("maxlength","50");
		
		tab_agregado_familiar = new TextField(model,"tab_agregado_familiar");
		tab_agregado_familiar.setLabel(gt("Agregado Familiar"));
		tab_agregado_familiar.propertie().add("name","p_tab_agregado_familiar").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-users").add("maxlength","50");
		
		tab_contactos = new TextField(model,"tab_contactos");
		tab_contactos.setLabel(gt("Contactos"));
		tab_contactos.propertie().add("name","p_tab_contactos").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-volume-control-phone").add("maxlength","50");
		
		tab_documentos = new TextField(model,"tab_documentos");
		tab_documentos.setLabel(gt("Documentos"));
		tab_documentos.propertie().add("name","p_tab_documentos").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-archive").add("maxlength","50");
		
		dados_dependente = new SeparatorField(model,"dados_dependente");
		dados_dependente.setLabel(gt("Dados Dependente"));
		dados_dependente.propertie().add("name","p_dados_dependente").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome Completo"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","500").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome_da_mae = new TextField(model,"nome_da_mae");
		nome_da_mae.setLabel(gt("Nome da Mãe"));
		nome_da_mae.propertie().add("name","p_nome_da_mae").add("type","text").add("maxlength","500").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome_do_pai = new TextField(model,"nome_do_pai");
		nome_do_pai.setLabel(gt("Nome do Pai"));
		nome_do_pai.propertie().add("name","p_nome_do_pai").add("type","text").add("maxlength","500").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		sexo = new RadioListField(model,"sexo");
		sexo.setLabel(gt("Sexo"));
		sexo.propertie().add("name","p_sexo").add("type","radiolist").add("domain","DM_SEXO « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("child_size","6").add("java-type","String");
		
		nacionalidade = new TextField(model,"nacionalidade");
		nacionalidade.setLabel(gt("Nacionalidade"));
		nacionalidade.propertie().add("name","p_nacionalidade").add("type","text").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		profissao = new TextField(model,"profissao");
		profissao.setLabel(gt("Profissão"));
		profissao.propertie().add("name","p_profissao").add("type","text").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		habilitacao_literaria = new ListField(model,"habilitacao_literaria");
		habilitacao_literaria.setLabel(gt("Habilitação Literária"));
		habilitacao_literaria.propertie().add("name","p_habilitacao_literaria").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_Habilitacao « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String");
		
		estado_civil = new ListField(model,"estado_civil");
		estado_civil.setLabel(gt("Estado Civíl"));
		estado_civil.propertie().add("name","p_estado_civil").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_EstadoCivil « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","");
		
		tipo_de_dependencia = new ListField(model,"tipo_de_dependencia");
		tipo_de_dependencia.setLabel(gt("Tipo de Dependência"));
		tipo_de_dependencia.propertie().add("name","p_tipo_de_dependencia").add("type","select").add("multiple","true").add("tags","false").add("domain","DM_TDependencia « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		grau_de_dependencia = new ListField(model,"grau_de_dependencia");
		grau_de_dependencia.setLabel(gt("Grau de Dependência"));
		grau_de_dependencia.propertie().add("name","p_grau_de_dependencia").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_GrauDependencia « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		autocuidado = new ListField(model,"autocuidado");
		autocuidado.setLabel(gt("Autocuidado"));
		autocuidado.propertie().add("name","p_autocuidado").add("type","select").add("multiple","true").add("tags","false").add("domain","DM_Autocuidado « cuidado_dos_dependentes").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		origem_de_dependencia = new ListField(model,"origem_de_dependencia");
		origem_de_dependencia.setLabel(gt("Origem de Dependência"));
		origem_de_dependencia.propertie().add("name","p_origem_de_dependencia").add("type","select").add("multiple","true").add("tags","false").add("domain","DM_OrigemDependencia « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		instalacao_de_dependencia = new ListField(model,"instalacao_de_dependencia");
		instalacao_de_dependencia.setLabel(gt("Instalação de Dependência"));
		instalacao_de_dependencia.propertie().add("name","p_instalacao_de_dependencia").add("type","select").add("multiple","true").add("tags","false").add("domain","DM_InstalacaoDependencia « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		data_de_dependencia = new DateField(model,"data_de_dependencia");
		data_de_dependencia.setLabel(gt("Data de Dependência"));
		data_de_dependencia.propertie().add("name","p_data_de_dependencia").add("type","date").add("range","false").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("desc","true");
		
		tempo_de_dependencia = new TextField(model,"tempo_de_dependencia");
		tempo_de_dependencia.setLabel(gt("Tempo de Dependência"));
		tempo_de_dependencia.propertie().add("name","p_tempo_de_dependencia").add("type","text").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		nome_completo = new TextField(model,"nome_completo");
		nome_completo.setLabel(gt("Nome Completo"));
		nome_completo.propertie().add("name","p_nome_completo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		grau_de_parentesco = new ListField(model,"grau_de_parentesco");
		grau_de_parentesco.setLabel(gt("Grau de Parentesco"));
		grau_de_parentesco.propertie().add("name","p_grau_de_parentesco").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_Parentesco « cuidado_dos_dependentes").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		data_de_nascimento = new DateField(model,"data_de_nascimento");
		data_de_nascimento.setLabel(gt("Data de Nascimento"));
		data_de_nascimento.propertie().add("name","p_data_de_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("desc","true");
		
		tipo_de_contacto = new ListField(model,"tipo_de_contacto");
		tipo_de_contacto.setLabel(gt("Tipo de Contacto"));
		tipo_de_contacto.propertie().add("name","p_tipo_de_contacto").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_TipoContacto « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		contacto = new TextField(model,"contacto");
		contacto.setLabel(gt("Contacto"));
		contacto.propertie().add("name","p_contacto").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		tipo_identificacao = new ListField(model,"tipo_identificacao");
		tipo_identificacao.setLabel(gt("Tipo Identificação"));
		tipo_identificacao.propertie().add("name","p_tipo_identificacao").add("type","select").add("multiple","true").add("tags","false").add("domain","D_TipoIdentificacao « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String").add("desc","true");
		
		numero = new NumberField(model,"numero");
		numero.setLabel(gt("Número"));
		numero.propertie().add("name","p_numero").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("desc","true");
		
		data_emissao = new DateField(model,"data_emissao");
		data_emissao.setLabel(gt("Data Emissão"));
		data_emissao.propertie().add("name","p_data_emissao").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("desc","true");
		
		data_de_validade = new DateField(model,"data_de_validade");
		data_de_validade.setLabel(gt("Data de Validade"));
		data_de_validade.propertie().add("name","p_data_de_validade").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("desc","true");
		
		vitalicio = new RadioListField(model,"vitalicio");
		vitalicio.setLabel(gt("Vitalício"));
		vitalicio.propertie().add("name","p_vitalicio").add("type","radiolist").add("domain","DM_Vitalicio « cuidado_dos_dependentes").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","6").add("java-type","String").add("desc","true");
		
		entidade_emissora = new TextField(model,"entidade_emissora");
		entidade_emissora.setLabel(gt("Entidade Emissora"));
		entidade_emissora.propertie().add("name","p_entidade_emissora").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		ficheiro = new FileField(model,"ficheiro");
		ficheiro.setLabel(gt("Ficheiro"));
		ficheiro.propertie().add("name","p_ficheiro").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","2000").add("required","true").add("disabled","false").add("visible","false").add("class","primary").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_guardar = new IGRPButton("Guardar","cuidado_dos_dependentes","DependenteForm","guardar","submit","primary|fa-floppy-o","","");
		btn_guardar.propertie.add("type","specific").add("rel","guardar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		tabcontent_1.addField(tab_dados_dependente);
		tabcontent_1.addField(detalhes_de_dependencias);
		tabcontent_1.addField(tab_agregado_familiar);
		tabcontent_1.addField(tab_contactos);
		tabcontent_1.addField(tab_documentos);

		form_1.addField(dados_dependente);
		form_1.addField(nome);
		form_1.addField(nome_da_mae);
		form_1.addField(nome_do_pai);
		form_1.addField(data_nascimento);
		form_1.addField(sexo);
		form_1.addField(nacionalidade);
		form_1.addField(profissao);
		form_1.addField(habilitacao_literaria);
		form_1.addField(estado_civil);

		sl_detalhes_dependentes.addField(tipo_de_dependencia);
		sl_detalhes_dependentes.addField(grau_de_dependencia);
		sl_detalhes_dependentes.addField(autocuidado);
		sl_detalhes_dependentes.addField(origem_de_dependencia);
		sl_detalhes_dependentes.addField(instalacao_de_dependencia);
		sl_detalhes_dependentes.addField(data_de_dependencia);
		sl_detalhes_dependentes.addField(tempo_de_dependencia);

		sl_agregado_familiar.addField(nome_completo);
		sl_agregado_familiar.addField(grau_de_parentesco);
		sl_agregado_familiar.addField(data_de_nascimento);

		sl_contactos.addField(tipo_de_contacto);
		sl_contactos.addField(contacto);

		sl_documentos_identificacao.addField(tipo_identificacao);
		sl_documentos_identificacao.addField(numero);
		sl_documentos_identificacao.addField(data_emissao);
		sl_documentos_identificacao.addField(data_de_validade);
		sl_documentos_identificacao.addField(vitalicio);
		sl_documentos_identificacao.addField(entidade_emissora);
		sl_documentos_identificacao.addField(ficheiro);

		toolsbar_1.addButton(btn_guardar);
		this.addToPage(tabcontent_1);
		this.addToPage(form_1);
		this.addToPage(sl_detalhes_dependentes);
		this.addToPage(sl_agregado_familiar);
		this.addToPage(sl_contactos);
		this.addToPage(sl_documentos_identificacao);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		tab_dados_dependente.setValue(model);
		detalhes_de_dependencias.setValue(model);
		tab_agregado_familiar.setValue(model);
		tab_contactos.setValue(model);
		tab_documentos.setValue(model);
		dados_dependente.setValue(model);
		nome.setValue(model);
		nome_da_mae.setValue(model);
		nome_do_pai.setValue(model);
		data_nascimento.setValue(model);
		sexo.setValue(model);
		nacionalidade.setValue(model);
		profissao.setValue(model);
		habilitacao_literaria.setValue(model);
		estado_civil.setValue(model);
		tipo_de_dependencia.setValue(model);
		grau_de_dependencia.setValue(model);
		autocuidado.setValue(model);
		origem_de_dependencia.setValue(model);
		instalacao_de_dependencia.setValue(model);
		data_de_dependencia.setValue(model);
		tempo_de_dependencia.setValue(model);
		nome_completo.setValue(model);
		grau_de_parentesco.setValue(model);
		data_de_nascimento.setValue(model);
		tipo_de_contacto.setValue(model);
		contacto.setValue(model);
		tipo_identificacao.setValue(model);
		numero.setValue(model);
		data_emissao.setValue(model);
		data_de_validade.setValue(model);
		vitalicio.setValue(model);
		entidade_emissora.setValue(model);
		ficheiro.setValue(model);	

		sl_detalhes_dependentes.loadModel(((DependenteForm) model).getSl_detalhes_dependentes());
		sl_agregado_familiar.loadModel(((DependenteForm) model).getSl_agregado_familiar());
		sl_contactos.loadModel(((DependenteForm) model).getSl_contactos());
		sl_documentos_identificacao.loadModel(((DependenteForm) model).getSl_documentos_identificacao());
		}
}
