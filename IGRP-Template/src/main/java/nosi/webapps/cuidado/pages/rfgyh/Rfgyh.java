package nosi.webapps.cuidado.pages.rfgyh;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Rfgyh extends Model{		

	@RParam(rParamName = "p_carousel_1_label")
	private String carousel_1_label;

	@RParam(rParamName = "p_carousel_1_img")
	private String carousel_1_img;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;
	
	private List<Carousel_1> carousel_1 = new ArrayList<>();	
	public void setCarousel_1(List<Carousel_1> carousel_1){
		this.carousel_1 = carousel_1;
	}
	public List<Carousel_1> getCarousel_1(){
		return this.carousel_1;
	}

	
	public void setCarousel_1_label(String carousel_1_label){
		this.carousel_1_label = carousel_1_label;
	}
	public String getCarousel_1_label(){
		return this.carousel_1_label;
	}
	
	public void setCarousel_1_img(String carousel_1_img){
		this.carousel_1_img = carousel_1_img;
	}
	public String getCarousel_1_img(){
		return this.carousel_1_img;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}


	public static class Carousel_1 extends IGRPTable.Table{
		private String carousel_1_label;
		private String carousel_1_img;
		public void setCarousel_1_label(String carousel_1_label){
			this.carousel_1_label = carousel_1_label;
		}
		public String getCarousel_1_label(){
			return this.carousel_1_label;
		}

		public void setCarousel_1_img(String carousel_1_img){
			this.carousel_1_img = carousel_1_img;
		}
		public String getCarousel_1_img(){
			return this.carousel_1_img;
		}

	}

	public void loadCarousel_1(BaseQueryInterface query) {
		this.setCarousel_1(this.loadTable(query,Carousel_1.class));
	}

}
