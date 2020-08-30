package nosi.webapps.cuidado.pages.rfgyh;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class RfgyhView extends View {

	public Field carousel_1_label;
	public Field carousel_1_img;
	public Field sectionheader_1_text;
	public Field paragraph_1_text;
	public IGRPTable carousel_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPParagraph paragraph_1;
	public IGRPForm form_1;

	public IGRPButton btn_iniciar_sessao;
	public IGRPButton btn_caso_nao_tens_uma_conta_registe___se_ja;

	public RfgyhView(){

		this.setPageTitle("principal");
			
		carousel_1 = new IGRPTable("carousel_1","");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		form_1 = new IGRPForm("form_1","");

		carousel_1_label = new TextField(model,"carousel_1_label");
		carousel_1_label.setLabel(gt("Title"));
		carousel_1_label.propertie().add("name","p_carousel_1_label").add("type","text").add("maxlength","200");
		
		carousel_1_img = new TextField(model,"carousel_1_img");
		carousel_1_img.setLabel(gt("Image"));
		carousel_1_img.propertie().add("name","p_carousel_1_img").add("type","text").add("maxlength","200");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><span style='color:#16a085;'><span style='font-size:26px;'><strong>SCD</strong></span></span></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p><span style='font-size:14px;'><em><span new='' roman='' style='font-family:' times=''><strong>Sistema de Cuidado dos Dependentes</strong> &eacute; um sistema que permite chegar mais perto da maneira mais equitativa, respons&aacute;vel e eficiente na sociedade como todo para resolver os cuidados dos dependentes como crian&ccedil;as, idosos e pessoa com depend&ecirc;ncia em situa&ccedil;&atilde;o de dependentes</span></em></span></p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		


		btn_iniciar_sessao = new IGRPButton("Iniciar Sessao","cuidado","Rfgyh","iniciar_sessao","submit","success|fa-angle-right","","");
		btn_iniciar_sessao.propertie.add("type","form").add("class","success").add("rel","iniciar_sessao").add("refresh_components","");

		btn_caso_nao_tens_uma_conta_registe___se_ja = new IGRPButton("Caso nao tens uma conta, registe - se ja.","cuidado","Rfgyh","caso_nao_tens_uma_conta_registe___se_ja","_blank","link|fa-angle-right","","");
		btn_caso_nao_tens_uma_conta_registe___se_ja.propertie.add("type","form").add("class","link").add("rel","caso_nao_tens_uma_conta_registe___se_ja").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		carousel_1.addField(carousel_1_label);
		carousel_1.addField(carousel_1_img);

		sectionheader_1.addField(sectionheader_1_text);

		paragraph_1.addField(paragraph_1_text);


		form_1.addButton(btn_iniciar_sessao);
		form_1.addButton(btn_caso_nao_tens_uma_conta_registe___se_ja);
		this.addToPage(carousel_1);
		this.addToPage(sectionheader_1);
		this.addToPage(paragraph_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		carousel_1_label.setValue(model);
		carousel_1_img.setValue(model);	

		carousel_1.loadModel(((Rfgyh) model).getCarousel_1());
		}
}
