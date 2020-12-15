package nosi.webapps.sistema_cuidado_dependentes.pages.registar_comunicado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_comunicadoView extends View {

	public Field sectionheader_1_text;
	public Field titulo;
	public Field descriccao;
	public Field unidade_cuidado;
	public Field id_comunicado;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public Registar_comunicadoView(){

		this.setPageTitle("Registar Comunicado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de Comunicado</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		titulo = new TextField(model,"titulo");
		titulo.setLabel(gt("TÃ­tulo"));
		titulo.propertie().add("name","p_titulo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descriccao = new TextAreaField(model,"descriccao");
		descriccao.setLabel(gt("DescricÃ§Ã£o"));
		descriccao.propertie().add("name","p_descriccao").add("type","textarea").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		unidade_cuidado = new TextField(model,"unidade_cuidado");
		unidade_cuidado.setLabel(gt("Unidade Cuidado"));
		unidade_cuidado.propertie().add("name","p_unidade_cuidado").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_comunicado = new HiddenField(model,"id_comunicado");
		id_comunicado.setLabel(gt(""));
		id_comunicado.propertie().add("name","p_id_comunicado").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_comunicado");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","Registar_comunicado","registar","submit_form","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(titulo);
		form_1.addField(descriccao);
		form_1.addField(unidade_cuidado);
		form_1.addField(id_comunicado);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		titulo.setValue(model);
		descriccao.setValue(model);
		unidade_cuidado.setValue(model);
		id_comunicado.setValue(model);	

		}
}
