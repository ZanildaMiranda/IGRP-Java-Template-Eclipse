package nosi.webapps.sistema_cuidado_dependentes.pages.registar_servico__cuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_servico__cuidadoView extends View {

	public Field sectionheader_1_text;
	public Field tipo;
	public Field descriccao;
	public Field unidade_cuidado;
	public Field dependente;
	public Field id_servico_cuidado;
	public Field id_unidade_cuidado;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar;

	public Registar_servico__cuidadoView(){

		this.setPageTitle("Registar Servico  Cuidado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registo de Servi&ccedil;o de Cuidado</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		tipo = new TextField(model,"tipo");
		tipo.setLabel(gt("Tipo"));
		tipo.propertie().add("name","p_tipo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descriccao = new TextField(model,"descriccao");
		descriccao.setLabel(gt("Descricção"));
		descriccao.propertie().add("name","p_descriccao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		unidade_cuidado = new LookupField(model,"unidade_cuidado");
		unidade_cuidado.setLabel(gt("Unidade Cuidado"));
		unidade_cuidado.setLookup("sistema_cuidado_dependentes","LookupUnidadeCuidado","index");
		unidade_cuidado.addParam("target","_blank");
		unidade_cuidado.addLookupParam("p_unidade_cuidado","fwl_unidade_cuidado");
		unidade_cuidado.addLookupParam("p_id_unidade_cuidado","fwl_id_unidade_cuidado");
		unidade_cuidado.propertie().add("name","p_unidade_cuidado").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","true").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		dependente = new TextField(model,"dependente");
		dependente.setLabel(gt("Dependente"));
		dependente.propertie().add("name","p_dependente").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_servico_cuidado = new HiddenField(model,"id_servico_cuidado");
		id_servico_cuidado.setLabel(gt(""));
		id_servico_cuidado.propertie().add("name","p_id_servico_cuidado").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_servico_cuidado");
		
		id_unidade_cuidado = new HiddenField(model,"id_unidade_cuidado");
		id_unidade_cuidado.setLabel(gt(""));
		id_unidade_cuidado.propertie().add("name","p_id_unidade_cuidado").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_unidade_cuidado");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar = new IGRPButton("Registar","sistema_cuidado_dependentes","Registar_servico__cuidado","registar","submit_form","success|fa-save","","");
		btn_registar.propertie.add("type","specific").add("rel","registar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(tipo);
		form_1.addField(descriccao);
		form_1.addField(unidade_cuidado);
		form_1.addField(dependente);
		form_1.addField(id_servico_cuidado);
		form_1.addField(id_unidade_cuidado);

		toolsbar_1.addButton(btn_registar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		tipo.setValue(model);
		descriccao.setValue(model);
		unidade_cuidado.setValue(model);
		dependente.setValue(model);
		id_servico_cuidado.setValue(model);
		id_unidade_cuidado.setValue(model);	

		}
}
