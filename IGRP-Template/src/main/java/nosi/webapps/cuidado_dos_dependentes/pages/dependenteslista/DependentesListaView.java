package nosi.webapps.cuidado_dos_dependentes.pages.dependenteslista;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class DependentesListaView extends View {

	public Field flt_nome;
	public Field sectionheader_1_text;
	public Field nome;
	public Field data_de_nascimento;
	public Field sexo;
	public Field estado_civil;
	public Field _n_de_agregado_familiar;
	public Field id;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo_;
	public IGRPButton btn_filtrar;
	public IGRPButton btn_vizualizar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public DependentesListaView(){

		this.setPageTitle("Cadastro de Dependentes");
			
		form_1 = new IGRPForm("form_1","");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		table_1 = new IGRPTable("table_1","");

		flt_nome = new TextField(model,"flt_nome");
		flt_nome.setLabel(gt("Nome"));
		flt_nome.propertie().add("name","p_flt_nome").add("type","text").add("maxlength","500").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Lista de Dependentes</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","500").add("showLabel","true").add("group_in","");
		
		data_de_nascimento = new DateField(model,"data_de_nascimento");
		data_de_nascimento.setLabel(gt("Data de Nascimento"));
		data_de_nascimento.propertie().add("name","p_data_de_nascimento").add("type","date").add("range","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		sexo = new TextField(model,"sexo");
		sexo.setLabel(gt("Sexo"));
		sexo.propertie().add("name","p_sexo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_civil = new TextField(model,"estado_civil");
		estado_civil.setLabel(gt("Estado Cívil"));
		estado_civil.propertie().add("name","p_estado_civil").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		_n_de_agregado_familiar = new TextField(model,"_n_de_agregado_familiar");
		_n_de_agregado_familiar.setLabel(gt(" Nº de Agregado Familiar"));
		_n_de_agregado_familiar.propertie().add("name","p__n_de_agregado_familiar").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo_ = new IGRPButton("Novo ","cuidado_dos_dependentes","DependentesLista","novo_","modal|refresh","primary|fa-address-book-o","","");
		btn_novo_.propertie.add("type","specific").add("rel","novo_").add("refresh_components","");

		btn_filtrar = new IGRPButton("Filtrar","cuidado_dos_dependentes","DependentesLista","filtrar","submit_ajax","primary|fa-search","","");
		btn_filtrar.propertie.add("type","specific").add("rel","filtrar").add("refresh_components","table_1");

		btn_vizualizar = new IGRPButton("Vizualizar","cuidado_dos_dependentes","DependentesLista","vizualizar","modal|refresh","primary|fa-eye","","");
		btn_vizualizar.propertie.add("id","button_3b29_b6ea").add("type","specific").add("class","primary").add("rel","vizualizar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","cuidado_dos_dependentes","DependentesLista","editar","modal|refresh","primary|fa-edit","","");
		btn_editar.propertie.add("id","button_4249_f2c0").add("type","specific").add("class","primary").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","cuidado_dos_dependentes","DependentesLista","eliminar","confirm","danger|fa-trash","","");
		btn_eliminar.propertie.add("id","button_ccb4_9e7f").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(flt_nome);


		sectionheader_1.addField(sectionheader_1_text);

		table_1.addField(nome);
		table_1.addField(data_de_nascimento);
		table_1.addField(sexo);
		table_1.addField(estado_civil);
		table_1.addField(_n_de_agregado_familiar);
		table_1.addField(id);

		toolsbar_1.addButton(btn_novo_);
		toolsbar_1.addButton(btn_filtrar);
		table_1.addButton(btn_vizualizar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		flt_nome.setValue(model);
		nome.setValue(model);
		data_de_nascimento.setValue(model);
		sexo.setValue(model);
		estado_civil.setValue(model);
		_n_de_agregado_familiar.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((DependentesLista) model).getTable_1());
		}
}
