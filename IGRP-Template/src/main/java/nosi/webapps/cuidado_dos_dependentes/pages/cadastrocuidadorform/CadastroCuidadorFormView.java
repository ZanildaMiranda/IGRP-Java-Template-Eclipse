package nosi.webapps.cuidado_dos_dependentes.pages.cadastrocuidadorform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class CadastroCuidadorFormView extends View {

	public Field tab_dados_de_cuidador;
	public Field contactos;
	public Field documentos;
	public Field dados_cuidador;
	public Field nome;
	public Field tipo_de_cuidador;
	public Field data_nascimento;
	public Field nacionalidade;
	public Field sexo;
	public Field habilitacao_literaria;
	public Field estado_civil;
	public Field profissao;
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
	public IGRPSeparatorList separatorlist_3;
	public IGRPSeparatorList separatorlist_4;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_guardar;

	public CadastroCuidadorFormView(){

		this.setPageTitle("Cadastro Cuidador");
			
		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		form_1 = new IGRPForm("form_1","");

		separatorlist_3 = new IGRPSeparatorList("separatorlist_3","");

		separatorlist_4 = new IGRPSeparatorList("separatorlist_4","");

		tab_dados_de_cuidador = new TextField(model,"tab_dados_de_cuidador");
		tab_dados_de_cuidador.setLabel(gt("Dados de Cuidador"));
		tab_dados_de_cuidador.propertie().add("name","p_tab_dados_de_cuidador").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-user").add("maxlength","50");
		
		contactos = new TextField(model,"contactos");
		contactos.setLabel(gt("Contactos"));
		contactos.propertie().add("name","p_contactos").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-volume-control-phone").add("maxlength","50");
		
		documentos = new TextField(model,"documentos");
		documentos.setLabel(gt("Documentos"));
		documentos.propertie().add("name","p_documentos").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-archive").add("maxlength","50");
		
		dados_cuidador = new SeparatorField(model,"dados_cuidador");
		dados_cuidador.setLabel(gt("Dados Cuidador"));
		dados_cuidador.propertie().add("name","p_dados_cuidador").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome Completo"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","500").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tipo_de_cuidador = new ListField(model,"tipo_de_cuidador");
		tipo_de_cuidador.setLabel(gt("Tipo de Cuidador"));
		tipo_de_cuidador.propertie().add("name","p_tipo_de_cuidador").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_TipoCuidador « cuidado_dos_dependentes").add("maxlength","500").add("required","true").add("disabled","false").add("java-type","String");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		nacionalidade = new TextField(model,"nacionalidade");
		nacionalidade.setLabel(gt("Nacionalidade"));
		nacionalidade.propertie().add("name","p_nacionalidade").add("type","text").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		sexo = new RadioListField(model,"sexo");
		sexo.setLabel(gt("Sexo"));
		sexo.propertie().add("name","p_sexo").add("type","radiolist").add("domain","DM_SEXO « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("child_size","6").add("java-type","String");
		
		habilitacao_literaria = new ListField(model,"habilitacao_literaria");
		habilitacao_literaria.setLabel(gt("Habilitação Literária"));
		habilitacao_literaria.propertie().add("name","p_habilitacao_literaria").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_Habilitacao « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","String");
		
		estado_civil = new ListField(model,"estado_civil");
		estado_civil.setLabel(gt("Estado Civíl"));
		estado_civil.propertie().add("name","p_estado_civil").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_EstadoCivil « cuidado_dos_dependentes").add("maxlength","300").add("required","true").add("disabled","false").add("java-type","");
		
		profissao = new TextField(model,"profissao");
		profissao.setLabel(gt("Profissão"));
		profissao.propertie().add("name","p_profissao").add("type","text").add("maxlength","300").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
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

		btn_guardar = new IGRPButton("Guardar","cuidado_dos_dependentes","CadastroCuidadorForm","guardar","submit","primary|fa-floppy-o","","");
		btn_guardar.propertie.add("type","specific").add("rel","guardar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		tabcontent_1.addField(tab_dados_de_cuidador);
		tabcontent_1.addField(contactos);
		tabcontent_1.addField(documentos);


		form_1.addField(dados_cuidador);
		form_1.addField(nome);
		form_1.addField(tipo_de_cuidador);
		form_1.addField(data_nascimento);
		form_1.addField(nacionalidade);
		form_1.addField(sexo);
		form_1.addField(habilitacao_literaria);
		form_1.addField(estado_civil);
		form_1.addField(profissao);

		separatorlist_3.addField(tipo_de_contacto);
		separatorlist_3.addField(contacto);

		separatorlist_4.addField(tipo_identificacao);
		separatorlist_4.addField(numero);
		separatorlist_4.addField(data_emissao);
		separatorlist_4.addField(data_de_validade);
		separatorlist_4.addField(vitalicio);
		separatorlist_4.addField(entidade_emissora);
		separatorlist_4.addField(ficheiro);

		toolsbar_1.addButton(btn_guardar);
		this.addToPage(tabcontent_1);
		this.addToPage(form_1);
		this.addToPage(separatorlist_3);
		this.addToPage(separatorlist_4);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		tab_dados_de_cuidador.setValue(model);
		contactos.setValue(model);
		documentos.setValue(model);
		dados_cuidador.setValue(model);
		nome.setValue(model);
		tipo_de_cuidador.setValue(model);
		data_nascimento.setValue(model);
		nacionalidade.setValue(model);
		sexo.setValue(model);
		habilitacao_literaria.setValue(model);
		estado_civil.setValue(model);
		profissao.setValue(model);
		tipo_de_contacto.setValue(model);
		contacto.setValue(model);
		tipo_identificacao.setValue(model);
		numero.setValue(model);
		data_emissao.setValue(model);
		data_de_validade.setValue(model);
		vitalicio.setValue(model);
		entidade_emissora.setValue(model);
		ficheiro.setValue(model);	

		separatorlist_3.loadModel(((CadastroCuidadorForm) model).getSeparatorlist_3());
		separatorlist_4.loadModel(((CadastroCuidadorForm) model).getSeparatorlist_4());
		}
}
