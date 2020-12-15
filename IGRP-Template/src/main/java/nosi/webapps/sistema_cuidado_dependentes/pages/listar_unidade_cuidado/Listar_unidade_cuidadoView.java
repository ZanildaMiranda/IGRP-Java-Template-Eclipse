package nosi.webapps.sistema_cuidado_dependentes.pages.listar_unidade_cuidado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Listar_unidade_cuidadoView extends View {

	public Field sectionheader_1_text;
	public Field unidade_cuidado;
	public Field localizacao;
	public Field contacto;
	public Field id_unidade_cuidado_tbl;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_ver;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Listar_unidade_cuidadoView(){

		this.setPageTitle("Listar Unidade_Cuidado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		table_1 = new IGRPTable("table_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Lista de Unidade de Cuidado</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		unidade_cuidado = new TextField(model,"unidade_cuidado");
		unidade_cuidado.setLabel(gt("Unidade Cuidado"));
		unidade_cuidado.propertie().add("name","p_unidade_cuidado").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		localizacao = new TextField(model,"localizacao");
		localizacao.setLabel(gt("Localização"));
		localizacao.propertie().add("name","p_localizacao").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		contacto = new TextField(model,"contacto");
		contacto.setLabel(gt("Contacto"));
		contacto.propertie().add("name","p_contacto").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		id_unidade_cuidado_tbl = new HiddenField(model,"id_unidade_cuidado_tbl");
		id_unidade_cuidado_tbl.setLabel(gt(""));
		id_unidade_cuidado_tbl.propertie().add("name","p_id_unidade_cuidado_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id_unidade_cuidado_tbl");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","sistema_cuidado_dependentes","Listar_unidade_cuidado","novo","modal|refresh","primary|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_ver = new IGRPButton("Ver","sistema_cuidado_dependentes","Listar_unidade_cuidado","ver","modal","primary|fa-eye","","");
		btn_ver.propertie.add("id","button_e928_cdfd").add("type","specific").add("class","primary").add("rel","ver").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_cuidado_dependentes","Listar_unidade_cuidado","editar","modal|refresh","primary|fa-pencil","","");
		btn_editar.propertie.add("id","button_455d_ffb7").add("type","specific").add("class","primary").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sistema_cuidado_dependentes","Listar_unidade_cuidado","eliminar","confirm","primary|fa-trash","","");
		btn_eliminar.propertie.add("id","button_9e91_a526").add("type","specific").add("class","primary").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		table_1.addField(unidade_cuidado);
		table_1.addField(localizacao);
		table_1.addField(contacto);
		table_1.addField(id_unidade_cuidado_tbl);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_ver);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		unidade_cuidado.setValue(model);
		localizacao.setValue(model);
		contacto.setValue(model);
		id_unidade_cuidado_tbl.setValue(model);	

		table_1.loadModel(((Listar_unidade_cuidado) model).getTable_1());
		}
}
