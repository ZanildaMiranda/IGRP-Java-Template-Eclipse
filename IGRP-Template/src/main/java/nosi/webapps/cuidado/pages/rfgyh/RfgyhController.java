package nosi.webapps.cuidado.pages.rfgyh;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class RfgyhController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Rfgyh model = new Rfgyh();
		model.load();
		model.loadCarousel_1(
				Core.query(null,"SELECT 'Img' as carousel_1_label,'../images/IGRP/IGRP2.3/assets/img/img1.jpg' as carousel_1_img")
		 );
		RfgyhView view = new RfgyhView();
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionIniciar_sessao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Rfgyh model = new Rfgyh();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Login","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(iniciar_sessao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Login","index", this.queryString());	
	}
	
	public Response actionCaso_nao_tens_uma_conta_registe___se_ja() throws IOException, IllegalArgumentException, IllegalAccessException{
		Rfgyh model = new Rfgyh();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Login","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(caso_nao_tens_uma_conta_registe___se_ja)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Login","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
