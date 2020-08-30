package nosi.webapps.cuidado.pages.home;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Home extends Model{		

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@RParam(rParamName = "p_smallbox_1_title")
	private String smallbox_1_title;

	@RParam(rParamName = "p_smallbox_1_val")
	private String smallbox_1_val;

	@RParam(rParamName = "p_smallbox_1_url")
	private String smallbox_1_url;

	@RParam(rParamName = "p_smallbox_1_lbl")
	private String smallbox_1_lbl;

	@RParam(rParamName = "p_smallbox_1_bg")
	private String smallbox_1_bg;

	@RParam(rParamName = "p_smallbox_1_icn")
	private String smallbox_1_icn;

	@RParam(rParamName = "p_smallbox_2_title")
	private String smallbox_2_title;

	@RParam(rParamName = "p_smallbox_2_val")
	private String smallbox_2_val;

	@RParam(rParamName = "p_smallbox_2_url")
	private String smallbox_2_url;

	@RParam(rParamName = "p_smallbox_2_lbl")
	private String smallbox_2_lbl;

	@RParam(rParamName = "p_smallbox_2_bg")
	private String smallbox_2_bg;

	@RParam(rParamName = "p_smallbox_2_icn")
	private String smallbox_2_icn;

	@RParam(rParamName = "p_smallbox_3_title")
	private String smallbox_3_title;

	@RParam(rParamName = "p_smallbox_3_val")
	private String smallbox_3_val;

	@RParam(rParamName = "p_smallbox_3_url")
	private String smallbox_3_url;

	@RParam(rParamName = "p_smallbox_3_lbl")
	private String smallbox_3_lbl;

	@RParam(rParamName = "p_smallbox_3_bg")
	private String smallbox_3_bg;

	@RParam(rParamName = "p_smallbox_3_icn")
	private String smallbox_3_icn;
	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}
	
	public void setSmallbox_1_title(String smallbox_1_title){
		this.smallbox_1_title = smallbox_1_title;
	}
	public String getSmallbox_1_title(){
		return this.smallbox_1_title;
	}
	
	public void setSmallbox_1_val(String smallbox_1_val){
		this.smallbox_1_val = smallbox_1_val;
	}
	public String getSmallbox_1_val(){
		return this.smallbox_1_val;
	}
	
	public void setSmallbox_1_url(String smallbox_1_url){
		this.smallbox_1_url = smallbox_1_url;
	}
	public String getSmallbox_1_url(){
		return this.smallbox_1_url;
	}
	
	public void setSmallbox_1_lbl(String smallbox_1_lbl){
		this.smallbox_1_lbl = smallbox_1_lbl;
	}
	public String getSmallbox_1_lbl(){
		return this.smallbox_1_lbl;
	}
	
	public void setSmallbox_1_bg(String smallbox_1_bg){
		this.smallbox_1_bg = smallbox_1_bg;
	}
	public String getSmallbox_1_bg(){
		return this.smallbox_1_bg;
	}
	
	public void setSmallbox_1_icn(String smallbox_1_icn){
		this.smallbox_1_icn = smallbox_1_icn;
	}
	public String getSmallbox_1_icn(){
		return this.smallbox_1_icn;
	}
	
	public void setSmallbox_2_title(String smallbox_2_title){
		this.smallbox_2_title = smallbox_2_title;
	}
	public String getSmallbox_2_title(){
		return this.smallbox_2_title;
	}
	
	public void setSmallbox_2_val(String smallbox_2_val){
		this.smallbox_2_val = smallbox_2_val;
	}
	public String getSmallbox_2_val(){
		return this.smallbox_2_val;
	}
	
	public void setSmallbox_2_url(String smallbox_2_url){
		this.smallbox_2_url = smallbox_2_url;
	}
	public String getSmallbox_2_url(){
		return this.smallbox_2_url;
	}
	
	public void setSmallbox_2_lbl(String smallbox_2_lbl){
		this.smallbox_2_lbl = smallbox_2_lbl;
	}
	public String getSmallbox_2_lbl(){
		return this.smallbox_2_lbl;
	}
	
	public void setSmallbox_2_bg(String smallbox_2_bg){
		this.smallbox_2_bg = smallbox_2_bg;
	}
	public String getSmallbox_2_bg(){
		return this.smallbox_2_bg;
	}
	
	public void setSmallbox_2_icn(String smallbox_2_icn){
		this.smallbox_2_icn = smallbox_2_icn;
	}
	public String getSmallbox_2_icn(){
		return this.smallbox_2_icn;
	}
	
	public void setSmallbox_3_title(String smallbox_3_title){
		this.smallbox_3_title = smallbox_3_title;
	}
	public String getSmallbox_3_title(){
		return this.smallbox_3_title;
	}
	
	public void setSmallbox_3_val(String smallbox_3_val){
		this.smallbox_3_val = smallbox_3_val;
	}
	public String getSmallbox_3_val(){
		return this.smallbox_3_val;
	}
	
	public void setSmallbox_3_url(String smallbox_3_url){
		this.smallbox_3_url = smallbox_3_url;
	}
	public String getSmallbox_3_url(){
		return this.smallbox_3_url;
	}
	
	public void setSmallbox_3_lbl(String smallbox_3_lbl){
		this.smallbox_3_lbl = smallbox_3_lbl;
	}
	public String getSmallbox_3_lbl(){
		return this.smallbox_3_lbl;
	}
	
	public void setSmallbox_3_bg(String smallbox_3_bg){
		this.smallbox_3_bg = smallbox_3_bg;
	}
	public String getSmallbox_3_bg(){
		return this.smallbox_3_bg;
	}
	
	public void setSmallbox_3_icn(String smallbox_3_icn){
		this.smallbox_3_icn = smallbox_3_icn;
	}
	public String getSmallbox_3_icn(){
		return this.smallbox_3_icn;
	}


	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

}
