package nosi.webapps.sistema_cuidado_dependentes.pages.registardependentes;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class RegistarDependentesView extends View {

	public Field sectionheader_1_text;
	public Field dependentes;
	public Field detalhe_dependente;
	public Field nome;
	public Field morada;
	public Field telefone;
	public Field sexo;
	public Field data_nascimento;
	public Field grau_de_dependencia;
	public Field nacionalidade;
	public Field profissao;
	public Field estado_civil;
	public Field autocuidado;
	public Field email;
	public Field cuidador;
	public Field id_dependente;
	public Field parente;
	public Field classe_dependencia;
	public Field origem;
	public Field pensionista;
	public Field habiliatacao_literaria;
	public Field instalacao_dependencia;
	public Field tempo_de_dependencia;
	public Field id_detalhe_dependente;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTabContent tabcontent_2;
	public IGRPForm form_1;
	public IGRPForm form_2;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public RegistarDependentesView(){

		this.setPageTitle("Registar dependentes");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		tabcontent_2 = new IGRPTabContent("tabcontent_2","");

		form_1 = new IGRPForm("form_1","");

		form_2 = new IGRPForm("form_2","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de Dependente</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		dependentes = new TextField(model,"dependentes");
		dependentes.setLabel(gt("Dependentes"));
		dependentes.propertie().add("name","p_dependentes").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-angle-right").add("maxlength","50");
		
		detalhe_dependente = new TextField(model,"detalhe_dependente");
		detalhe_dependente.setLabel(gt("Detalhe_Dependente"));
		detalhe_dependente.propertie().add("name","p_detalhe_dependente").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("adbcli","").add("img","fa-angle-right").add("maxlength","50");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		morada = new TextField(model,"morada");
		morada.setLabel(gt("Morada"));
		morada.propertie().add("name","p_morada").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		telefone = new NumberField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		sexo = new TextField(model,"sexo");
		sexo.setLabel(gt("Sexo"));
		sexo.propertie().add("name","p_sexo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		grau_de_dependencia = new TextField(model,"grau_de_dependencia");
		grau_de_dependencia.setLabel(gt("Grau de Dependência"));
		grau_de_dependencia.propertie().add("name","p_grau_de_dependencia").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nacionalidade = new TextField(model,"nacionalidade");
		nacionalidade.setLabel(gt("Nacionalidade"));
		nacionalidade.propertie().add("name","p_nacionalidade").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		profissao = new TextField(model,"profissao");
		profissao.setLabel(gt("Profissão"));
		profissao.propertie().add("name","p_profissao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado_civil = new TextField(model,"estado_civil");
		estado_civil.setLabel(gt("Estado Civil"));
		estado_civil.propertie().add("name","p_estado_civil").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		autocuidado = new TextField(model,"autocuidado");
		autocuidado.setLabel(gt("Autocuidado"));
		autocuidado.propertie().add("name","p_autocuidado").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		cuidador = new TextField(model,"cuidador");
		cuidador.setLabel(gt("Cuidador"));
		cuidador.propertie().add("name","p_cuidador").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_dependente = new HiddenField(model,"id_dependente");
		id_dependente.setLabel(gt(""));
		id_dependente.propertie().add("name","p_id_dependente").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_dependente");
		
		parente = new TextField(model,"parente");
		parente.setLabel(gt("Parente"));
		parente.propertie().add("name","p_parente").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		classe_dependencia = new ListField(model,"classe_dependencia");
		classe_dependencia.setLabel(gt("Classe Dependencia"));
		classe_dependencia.propertie().add("name","p_classe_dependencia").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		origem = new ListField(model,"origem");
		origem.setLabel(gt("Origem"));
		origem.propertie().add("name","p_origem").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		pensionista = new ListField(model,"pensionista");
		pensionista.setLabel(gt("Pensionista"));
		pensionista.propertie().add("name","p_pensionista").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		habiliatacao_literaria = new TextField(model,"habiliatacao_literaria");
		habiliatacao_literaria.setLabel(gt("Habiliatacao Literaria"));
		habiliatacao_literaria.propertie().add("name","p_habiliatacao_literaria").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		instalacao_dependencia = new ListField(model,"instalacao_dependencia");
		instalacao_dependencia.setLabel(gt("Instalacao Dependencia"));
		instalacao_dependencia.propertie().add("name","p_instalacao_dependencia").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		tempo_de_dependencia = new TextField(model,"tempo_de_dependencia");
		tempo_de_dependencia.setLabel(gt("Tempo de Dependencia"));
		tempo_de_dependencia.propertie().add("name","p_tempo_de_dependencia").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_detalhe_dependente = new HiddenField(model,"id_detalhe_dependente");
		id_detalhe_dependente.setLabel(gt(""));
		id_detalhe_dependente.propertie().add("name","p_id_detalhe_dependente").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_detalhe_dependente");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","RegistarDependentes","registar","submit","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		tabcontent_2.addField(dependentes);
		tabcontent_2.addField(detalhe_dependente);

		form_1.addField(nome);
		form_1.addField(morada);
		form_1.addField(telefone);
		form_1.addField(sexo);
		form_1.addField(data_nascimento);
		form_1.addField(grau_de_dependencia);
		form_1.addField(nacionalidade);
		form_1.addField(profissao);
		form_1.addField(estado_civil);
		form_1.addField(autocuidado);
		form_1.addField(email);
		form_1.addField(cuidador);
		form_1.addField(id_dependente);

		form_2.addField(parente);
		form_2.addField(classe_dependencia);
		form_2.addField(origem);
		form_2.addField(pensionista);
		form_2.addField(habiliatacao_literaria);
		form_2.addField(instalacao_dependencia);
		form_2.addField(tempo_de_dependencia);
		form_2.addField(id_detalhe_dependente);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(tabcontent_2);
		this.addToPage(form_1);
		this.addToPage(form_2);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		dependentes.setValue(model);
		detalhe_dependente.setValue(model);
		nome.setValue(model);
		morada.setValue(model);
		telefone.setValue(model);
		sexo.setValue(model);
		data_nascimento.setValue(model);
		grau_de_dependencia.setValue(model);
		nacionalidade.setValue(model);
		profissao.setValue(model);
		estado_civil.setValue(model);
		autocuidado.setValue(model);
		email.setValue(model);
		cuidador.setValue(model);
		id_dependente.setValue(model);
		parente.setValue(model);
		classe_dependencia.setValue(model);
		origem.setValue(model);
		pensionista.setValue(model);
		habiliatacao_literaria.setValue(model);
		instalacao_dependencia.setValue(model);
		tempo_de_dependencia.setValue(model);
		id_detalhe_dependente.setValue(model);	

		}
}
