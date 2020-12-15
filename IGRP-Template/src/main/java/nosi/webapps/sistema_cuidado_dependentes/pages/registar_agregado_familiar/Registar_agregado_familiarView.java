package nosi.webapps.sistema_cuidado_dependentes.pages.registar_agregado_familiar;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_agregado_familiarView extends View {

	public Field sectionheader_1_text;
	public Field nome;
	public Field morada;
	public Field telefone;
	public Field sexo;
	public Field tipo;
	public Field data_nascimento;
	public Field email;
	public Field dependente;
	public Field id_agregado_familiar;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public Registar_agregado_familiarView(){

		this.setPageTitle("Registar Agregado Familiar");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de&nbsp; Agregado Familiar</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		morada = new TextField(model,"morada");
		morada.setLabel(gt("Morada"));
		morada.propertie().add("name","p_morada").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		telefone = new NumberField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		sexo = new ListField(model,"sexo");
		sexo.setLabel(gt("Sexo"));
		sexo.propertie().add("name","p_sexo").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_SEXO « sistema_cuidado_dependentes").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		tipo = new TextField(model,"tipo");
		tipo.setLabel(gt("Tipo"));
		tipo.propertie().add("name","p_tipo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		dependente = new TextField(model,"dependente");
		dependente.setLabel(gt("Dependente"));
		dependente.propertie().add("name","p_dependente").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_agregado_familiar = new HiddenField(model,"id_agregado_familiar");
		id_agregado_familiar.setLabel(gt(""));
		id_agregado_familiar.propertie().add("name","p_id_agregado_familiar").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_agregado_familiar");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","Registar_agregado_familiar","registar","submit_form","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(nome);
		form_1.addField(morada);
		form_1.addField(telefone);
		form_1.addField(sexo);
		form_1.addField(tipo);
		form_1.addField(data_nascimento);
		form_1.addField(email);
		form_1.addField(dependente);
		form_1.addField(id_agregado_familiar);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		morada.setValue(model);
		telefone.setValue(model);
		sexo.setValue(model);
		tipo.setValue(model);
		data_nascimento.setValue(model);
		email.setValue(model);
		dependente.setValue(model);
		id_agregado_familiar.setValue(model);	

		}
}
