package nosi.webapps.sistema_cuidado_dependentes.pages.registar_unidade_de_cuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_unidade_de_cuidadoView extends View {

	public Field sectionheader_1_text;
	public Field codigo;
	public Field nome;
	public Field localidade;
	public Field telefone;
	public Field nif;
	public Field email;
	public Field id_unidade_cuidado;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public Registar_unidade_de_cuidadoView(){

		this.setPageTitle("Registar Unidade de Cuidado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de Unidade de Cuidado</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		localidade = new TextField(model,"localidade");
		localidade.setLabel(gt("Localidade"));
		localidade.propertie().add("name","p_localidade").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		telefone = new NumberField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		nif = new TextField(model,"nif");
		nif.setLabel(gt("NIF"));
		nif.propertie().add("name","p_nif").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_unidade_cuidado = new HiddenField(model,"id_unidade_cuidado");
		id_unidade_cuidado.setLabel(gt(""));
		id_unidade_cuidado.propertie().add("name","p_id_unidade_cuidado").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_unidade_cuidado");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","Registar_unidade_de_cuidado","registar","submit_form","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(codigo);
		form_1.addField(nome);
		form_1.addField(localidade);
		form_1.addField(telefone);
		form_1.addField(nif);
		form_1.addField(email);
		form_1.addField(id_unidade_cuidado);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		nome.setValue(model);
		localidade.setValue(model);
		telefone.setValue(model);
		nif.setValue(model);
		email.setValue(model);
		id_unidade_cuidado.setValue(model);	

		}
}
