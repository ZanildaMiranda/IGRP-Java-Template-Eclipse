package nosi.webapps.sistema_cuidado_dependentes.pages.lookupservicocuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class LookupServicoCuidadoView extends View {

	public Field fwl_unidade_cuidado;
	public Field fwl_localizacao;
	public Field fwl_contacto;
	public Field fwl_id_unidade_cuidado;
	public Field fwl_codigo;
	public Field sectionheader_1_text;
	public IGRPTable table_1;
	public IGRPSectionHeader sectionheader_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_toolsbar_1_button_1;

	public LookupServicoCuidadoView(){

		this.setPageTitle("Pesquisa Dependentes");
			
		table_1 = new IGRPTable("table_1","");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		fwl_unidade_cuidado = new TextField(model,"fwl_unidade_cuidado");
		fwl_unidade_cuidado.setLabel(gt("Unidade Cuidado"));
		fwl_unidade_cuidado.propertie().add("name","p_fwl_unidade_cuidado").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		fwl_localizacao = new TextField(model,"fwl_localizacao");
		fwl_localizacao.setLabel(gt("Localização"));
		fwl_localizacao.propertie().add("name","p_fwl_localizacao").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		fwl_contacto = new TextField(model,"fwl_contacto");
		fwl_contacto.setLabel(gt("Contacto"));
		fwl_contacto.propertie().add("name","p_fwl_contacto").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		fwl_id_unidade_cuidado = new HiddenField(model,"fwl_id_unidade_cuidado");
		fwl_id_unidade_cuidado.setLabel(gt(""));
		fwl_id_unidade_cuidado.propertie().add("name","p_fwl_id_unidade_cuidado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","fwl_id_unidade_cuidado");
		
		fwl_codigo = new HiddenField(model,"fwl_codigo");
		fwl_codigo.setLabel(gt(""));
		fwl_codigo.propertie().add("name","p_fwl_codigo").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","fwl_codigo");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("Sectionheader"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_toolsbar_1_button_1 = new IGRPButton("Button","sistema_cuidado_dependentes","LookupServicoCuidado","toolsbar_1_button_1","_blank","primary|fa-angle-right","","");
		btn_toolsbar_1_button_1.propertie.add("type","specific").add("rel","toolsbar_1_button_1").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		table_1.addField(fwl_unidade_cuidado);
		table_1.addField(fwl_localizacao);
		table_1.addField(fwl_contacto);
		table_1.addField(fwl_id_unidade_cuidado);
		table_1.addField(fwl_codigo);

		sectionheader_1.addField(sectionheader_1_text);


		toolsbar_1.addButton(btn_toolsbar_1_button_1);
		this.addToPage(table_1);
		this.addToPage(sectionheader_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		fwl_unidade_cuidado.setValue(model);
		fwl_localizacao.setValue(model);
		fwl_contacto.setValue(model);
		fwl_id_unidade_cuidado.setValue(model);
		fwl_codigo.setValue(model);	

		table_1.loadModel(((LookupServicoCuidado) model).getTable_1());
		}
}
