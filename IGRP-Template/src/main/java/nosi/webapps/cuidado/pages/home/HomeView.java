package nosi.webapps.cuidado.pages.home;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class HomeView extends View {

	public Field view_1_img;
	public Field smallbox_1_title;
	public Field smallbox_1_val;
	public Field smallbox_1_url;
	public Field smallbox_1_lbl;
	public Field smallbox_1_bg;
	public Field smallbox_1_icn;
	public Field smallbox_2_title;
	public Field smallbox_2_val;
	public Field smallbox_2_url;
	public Field smallbox_2_lbl;
	public Field smallbox_2_bg;
	public Field smallbox_2_icn;
	public Field smallbox_3_title;
	public Field smallbox_3_val;
	public Field smallbox_3_url;
	public Field smallbox_3_lbl;
	public Field smallbox_3_bg;
	public Field smallbox_3_icn;
	public IGRPView view_1;
	public IGRPSmallBox smallbox_1;
	public IGRPSmallBox smallbox_2;
	public IGRPSmallBox smallbox_3;
	public IGRPBox box_1;
	public IGRPBox box_2;
	public IGRPBox box_3;
	public IGRPChart chart_1;

	public IGRPVerticalMenu verticalmenu_1;
	public IGRPVerticalMenu verticalmenu_2;
	public IGRPVerticalMenu verticalmenu_3;
	public IGRPVerticalMenu verticalmenu_4;
	public IGRPVerticalMenu verticalmenu_5;
	public IGRPVerticalMenu verticalmenu_6;
	public IGRPVerticalMenu verticalmenu_7;
	public IGRPButton btn_inicio;
	public IGRPButton btn_funcionarios;
	public IGRPButton btn_terminar_sessao;
	public IGRPButton btn_unidade_de_cuidado;
	public IGRPButton btn_dashboard;
	public IGRPButton btn_dependentes;
	public IGRPButton btn_entidades;

	public HomeView(){

		this.setPageTitle("home");
			
		view_1 = new IGRPView("view_1","");

		smallbox_1 = new IGRPSmallBox("smallbox_1","");

		smallbox_2 = new IGRPSmallBox("smallbox_2","");

		smallbox_3 = new IGRPSmallBox("smallbox_3","");

		box_1 = new IGRPBox("box_1","Box");

		box_2 = new IGRPBox("box_2","");

		box_3 = new IGRPBox("box_3","");

		chart_1 = new IGRPChart("chart_1","");

		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		smallbox_1_title = new TextField(model,"smallbox_1_title");
		smallbox_1_title.setLabel(gt("Small Box Title"));
		smallbox_1_title.propertie().add("name","p_smallbox_1_title").add("type","text").add("maxlength","4000");
		
		smallbox_1_val = new TextField(model,"smallbox_1_val");
		smallbox_1_val.setLabel(gt("Value"));
		smallbox_1_val.propertie().add("name","p_smallbox_1_val").add("type","text").add("maxlength","4000");
		
		smallbox_1_url = new TextField(model,"smallbox_1_url");
		smallbox_1_url.setLabel(gt("Url"));
		smallbox_1_url.propertie().add("name","p_smallbox_1_url").add("type","text").add("maxlength","4000");
		
		smallbox_1_lbl = new TextField(model,"smallbox_1_lbl");
		smallbox_1_lbl.setLabel(gt("Url label"));
		smallbox_1_lbl.propertie().add("name","p_smallbox_1_lbl").add("type","text").add("maxlength","4000");
		
		smallbox_1_bg = new TextField(model,"smallbox_1_bg");
		smallbox_1_bg.setLabel(gt("Background"));
		smallbox_1_bg.propertie().add("name","p_smallbox_1_bg").add("type","text").add("maxlength","4000");
		
		smallbox_1_icn = new TextField(model,"smallbox_1_icn");
		smallbox_1_icn.setLabel(gt("Icon"));
		smallbox_1_icn.propertie().add("name","p_smallbox_1_icn").add("type","text").add("maxlength","4000");
		
		smallbox_2_title = new TextField(model,"smallbox_2_title");
		smallbox_2_title.setLabel(gt("Small Box Title"));
		smallbox_2_title.propertie().add("name","p_smallbox_2_title").add("type","text").add("maxlength","4000");
		
		smallbox_2_val = new TextField(model,"smallbox_2_val");
		smallbox_2_val.setLabel(gt("Value"));
		smallbox_2_val.propertie().add("name","p_smallbox_2_val").add("type","text").add("maxlength","4000");
		
		smallbox_2_url = new TextField(model,"smallbox_2_url");
		smallbox_2_url.setLabel(gt("Url"));
		smallbox_2_url.propertie().add("name","p_smallbox_2_url").add("type","text").add("maxlength","4000");
		
		smallbox_2_lbl = new TextField(model,"smallbox_2_lbl");
		smallbox_2_lbl.setLabel(gt("Url label"));
		smallbox_2_lbl.propertie().add("name","p_smallbox_2_lbl").add("type","text").add("maxlength","4000");
		
		smallbox_2_bg = new TextField(model,"smallbox_2_bg");
		smallbox_2_bg.setLabel(gt("Background"));
		smallbox_2_bg.propertie().add("name","p_smallbox_2_bg").add("type","text").add("maxlength","4000");
		
		smallbox_2_icn = new TextField(model,"smallbox_2_icn");
		smallbox_2_icn.setLabel(gt("Icon"));
		smallbox_2_icn.propertie().add("name","p_smallbox_2_icn").add("type","text").add("maxlength","4000");
		
		smallbox_3_title = new TextField(model,"smallbox_3_title");
		smallbox_3_title.setLabel(gt("Small Box Title"));
		smallbox_3_title.propertie().add("name","p_smallbox_3_title").add("type","text").add("maxlength","4000");
		
		smallbox_3_val = new TextField(model,"smallbox_3_val");
		smallbox_3_val.setLabel(gt("Value"));
		smallbox_3_val.propertie().add("name","p_smallbox_3_val").add("type","text").add("maxlength","4000");
		
		smallbox_3_url = new TextField(model,"smallbox_3_url");
		smallbox_3_url.setLabel(gt("Url"));
		smallbox_3_url.propertie().add("name","p_smallbox_3_url").add("type","text").add("maxlength","4000");
		
		smallbox_3_lbl = new TextField(model,"smallbox_3_lbl");
		smallbox_3_lbl.setLabel(gt("Url label"));
		smallbox_3_lbl.propertie().add("name","p_smallbox_3_lbl").add("type","text").add("maxlength","4000");
		
		smallbox_3_bg = new TextField(model,"smallbox_3_bg");
		smallbox_3_bg.setLabel(gt("Background"));
		smallbox_3_bg.propertie().add("name","p_smallbox_3_bg").add("type","text").add("maxlength","4000");
		
		smallbox_3_icn = new TextField(model,"smallbox_3_icn");
		smallbox_3_icn.setLabel(gt("Icon"));
		smallbox_3_icn.propertie().add("name","p_smallbox_3_icn").add("type","text").add("maxlength","4000");
		

		verticalmenu_1 = new IGRPVerticalMenu("verticalmenu_1");
		verticalmenu_2 = new IGRPVerticalMenu("verticalmenu_2");
		verticalmenu_3 = new IGRPVerticalMenu("verticalmenu_3");
		verticalmenu_4 = new IGRPVerticalMenu("verticalmenu_4");
		verticalmenu_5 = new IGRPVerticalMenu("verticalmenu_5");
		verticalmenu_6 = new IGRPVerticalMenu("verticalmenu_6");
		verticalmenu_7 = new IGRPVerticalMenu("verticalmenu_7");

		btn_inicio = new IGRPButton("Inicio","cuidado","Home","inicio","void","primary|fa-home","","");
		btn_inicio.propertie.add("type","specific").add("rel","inicio").add("refresh_components","");

		btn_funcionarios = new IGRPButton("Funcionarios","cuidado","Home","funcionarios","void","primary|fa-users","","");
		btn_funcionarios.propertie.add("type","specific").add("rel","funcionarios").add("refresh_components","");

		btn_terminar_sessao = new IGRPButton("Terminar Sessao","cuidado","Home","terminar_sessao","_blank","danger|fa-sign-in","","");
		btn_terminar_sessao.propertie.add("type","specific").add("rel","terminar_sessao").add("refresh_components","");

		btn_unidade_de_cuidado = new IGRPButton("Unidade de Cuidado","cuidado","Home","unidade_de_cuidado","void","primary|fa-bank","","");
		btn_unidade_de_cuidado.propertie.add("type","specific").add("rel","unidade_de_cuidado").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","cuidado","Home","dashboard","void","primary|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		btn_dependentes = new IGRPButton("Dependentes","cuidado","Home","dependentes","void","primary|fa-address-book","","");
		btn_dependentes.propertie.add("type","specific").add("rel","dependentes").add("refresh_components","");

		btn_entidades = new IGRPButton("Entidades","cuidado","Home","entidades","void","primary|fa-server","","");
		btn_entidades.propertie.add("type","specific").add("rel","entidades").add("refresh_components","");

		
		chart_1.setCaption("");
		chart_1.setChart_type("stackedcolumn");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		chart_1.addColor("#90393d").addColor("#1b8370").addColor("#36cf0f").addColor("#0db53a");

	}
		
	@Override
	public void render(){
		
		view_1.addField(view_1_img);








		smallbox_1.addField(smallbox_1_title);
		smallbox_1.addField(smallbox_1_val);
		smallbox_1.addField(smallbox_1_url);
		smallbox_1.addField(smallbox_1_lbl);
		smallbox_1.addField(smallbox_1_bg);
		smallbox_1.addField(smallbox_1_icn);

		smallbox_2.addField(smallbox_2_title);
		smallbox_2.addField(smallbox_2_val);
		smallbox_2.addField(smallbox_2_url);
		smallbox_2.addField(smallbox_2_lbl);
		smallbox_2.addField(smallbox_2_bg);
		smallbox_2.addField(smallbox_2_icn);

		smallbox_3.addField(smallbox_3_title);
		smallbox_3.addField(smallbox_3_val);
		smallbox_3.addField(smallbox_3_url);
		smallbox_3.addField(smallbox_3_lbl);
		smallbox_3.addField(smallbox_3_bg);
		smallbox_3.addField(smallbox_3_icn);





		verticalmenu_1.addButton(btn_inicio);
		verticalmenu_2.addButton(btn_funcionarios);
		verticalmenu_3.addButton(btn_terminar_sessao);
		verticalmenu_4.addButton(btn_unidade_de_cuidado);
		verticalmenu_5.addButton(btn_dashboard);
		verticalmenu_6.addButton(btn_dependentes);
		verticalmenu_7.addButton(btn_entidades);
		this.addToPage(view_1);
		this.addToPage(smallbox_1);
		this.addToPage(smallbox_2);
		this.addToPage(smallbox_3);
		this.addToPage(box_1);
		this.addToPage(box_2);
		this.addToPage(box_3);
		this.addToPage(chart_1);
		this.addToPage(verticalmenu_1);
		this.addToPage(verticalmenu_2);
		this.addToPage(verticalmenu_3);
		this.addToPage(verticalmenu_4);
		this.addToPage(verticalmenu_5);
		this.addToPage(verticalmenu_6);
		this.addToPage(verticalmenu_7);
	}
		
	@Override
	public void setModel(Model model) {
		
		view_1_img.setValue(model);
		smallbox_1_title.setValue(model);
		smallbox_1_val.setValue(model);
		smallbox_1_url.setValue(model);
		smallbox_1_lbl.setValue(model);
		smallbox_1_bg.setValue(model);
		smallbox_1_icn.setValue(model);
		smallbox_2_title.setValue(model);
		smallbox_2_val.setValue(model);
		smallbox_2_url.setValue(model);
		smallbox_2_lbl.setValue(model);
		smallbox_2_bg.setValue(model);
		smallbox_2_icn.setValue(model);
		smallbox_3_title.setValue(model);
		smallbox_3_val.setValue(model);
		smallbox_3_url.setValue(model);
		smallbox_3_lbl.setValue(model);
		smallbox_3_bg.setValue(model);
		smallbox_3_icn.setValue(model);	

		chart_1.loadModel(((Home) model).getChart_1());
		}
}
