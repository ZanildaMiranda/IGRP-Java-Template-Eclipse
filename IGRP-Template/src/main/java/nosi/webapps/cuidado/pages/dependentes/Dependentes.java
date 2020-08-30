package nosi.webapps.cuidado.pages.dependentes;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dependentes extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}



}
