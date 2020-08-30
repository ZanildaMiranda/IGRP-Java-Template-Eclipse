package nosi.webapps.cuidado.pages.funcionario;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class FuncionarioView extends View {

	public Field sectionheader_1_text;
	public Field table_1_plaintext_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_form_1_button_1;
	public IGRPButton btn_table_1_button_1;
	public IGRPButton btn_table_1_button_2;

	public FuncionarioView(){

		this.setPageTitle("Funcionario");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("Sectionheader"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		table_1_plaintext_1 = new PlainTextField(model,"table_1_plaintext_1");
		table_1_plaintext_1.setLabel(gt("Plaintext"));
		table_1_plaintext_1.propertie().add("name","p_table_1_plaintext_1").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		


		btn_form_1_button_1 = new IGRPButton("Button","cuidado","Funcionario","form_1_button_1","_blank","primary|fa-angle-right","","");
		btn_form_1_button_1.propertie.add("type","form").add("class","primary").add("rel","form_1_button_1").add("refresh_components","");

		btn_table_1_button_1 = new IGRPButton("Button","cuidado","Funcionario","table_1_button_1","_blank","primary|fa-angle-right","","");
		btn_table_1_button_1.propertie.add("type","specific").add("class","primary").add("rel","table_1_button_1").add("refresh_components","");

		btn_table_1_button_2 = new IGRPButton("Button","cuidado","Funcionario","table_1_button_2","_blank","primary|fa-angle-right","","");
		btn_table_1_button_2.propertie.add("type","specific").add("class","primary").add("rel","table_1_button_2").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		table_1.addField(table_1_plaintext_1);

		form_1.addButton(btn_form_1_button_1);
		table_1.addButton(btn_table_1_button_1);
		table_1.addButton(btn_table_1_button_2);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		table_1_plaintext_1.setValue(model);	

		table_1.loadModel(((Funcionario) model).getTable_1());
		}
}
