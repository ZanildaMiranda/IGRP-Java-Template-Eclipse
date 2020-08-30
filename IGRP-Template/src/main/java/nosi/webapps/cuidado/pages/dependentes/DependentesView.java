package nosi.webapps.cuidado.pages.dependentes;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class DependentesView extends View {

	public Field sectionheader_1_text;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPForm form_2;

	public IGRPButton btn_guardar;

	public DependentesView(){

		this.setPageTitle("Dependentes");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		form_2 = new IGRPForm("form_2","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Registar Dependentes</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		


		btn_guardar = new IGRPButton("Guardar","cuidado","Dependentes","guardar","submit","success|fa-hand-o-right","","");
		btn_guardar.propertie.add("type","form").add("class","success").add("rel","guardar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);



		form_1.addButton(btn_guardar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(form_2);
	}
		
	@Override
	public void setModel(Model model) {
			

		}
}
