package nosi.webapps.sistema_cuidado_dependentes.pages.registar_lei;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_leiView extends View {

	public Field sectionheader_1_text;
	public Field numero;
	public Field nome;
	public Field unidade_cuidado;
	public Field descriccao;
	public Field id_lei;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public Registar_leiView(){

		this.setPageTitle("Registar Lei");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de Lei</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		numero = new NumberField(model,"numero");
		numero.setLabel(gt("NÃºmero"));
		numero.propertie().add("name","p_numero").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		unidade_cuidado = new TextField(model,"unidade_cuidado");
		unidade_cuidado.setLabel(gt("Unidade Cuidado"));
		unidade_cuidado.propertie().add("name","p_unidade_cuidado").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descriccao = new TextAreaField(model,"descriccao");
		descriccao.setLabel(gt("DescricÃ§Ã£o"));
		descriccao.propertie().add("name","p_descriccao").add("type","textarea").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_lei = new HiddenField(model,"id_lei");
		id_lei.setLabel(gt(""));
		id_lei.propertie().add("name","p_id_lei").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_lei");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","Registar_lei","registar","submit_form","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(numero);
		form_1.addField(nome);
		form_1.addField(unidade_cuidado);
		form_1.addField(descriccao);
		form_1.addField(id_lei);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		numero.setValue(model);
		nome.setValue(model);
		unidade_cuidado.setValue(model);
		descriccao.setValue(model);
		id_lei.setValue(model);	

		}
}
