package nosi.webapps.cuidado.pages.home;

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
		
public class HomeController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		model.setSmallbox_1_title("Funcionarios");
		model.setSmallbox_1_val("184");
		model.setSmallbox_1_url("http://www.example.com");
		model.setSmallbox_1_lbl("View Details");
		model.setSmallbox_1_bg("cp-cyan");
		model.setSmallbox_1_icn("fa-users");
		model.setSmallbox_2_title("Dependentes");
		model.setSmallbox_2_val("671");
		model.setSmallbox_2_url("http://www.example.com");
		model.setSmallbox_2_lbl("View Details");
		model.setSmallbox_2_bg("cp-cyan");
		model.setSmallbox_2_icn("fa-address-book");
		model.setSmallbox_3_title("Entidades");
		model.setSmallbox_3_val("975");
		model.setSmallbox_3_url("http://www.example.com");
		model.setSmallbox_3_lbl("View Details");
		model.setSmallbox_3_bg("cp-cyan");
		model.setSmallbox_3_icn("fa-server");
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		HomeView view = new HomeView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setSmallbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setSmallbox_2_url(Core.getIGRPLink("your app","your page","your action"));
		model.setSmallbox_3_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionInicio() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(inicio)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
	public Response actionFuncionarios() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(funcionarios)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
	public Response actionTerminar_sessao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Login","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(terminar_sessao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Login","index", this.queryString());	
	}
	
	public Response actionUnidade_de_cuidado() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(unidade_de_cuidado)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
	public Response actionDashboard() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(dashboard)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
	public Response actionDependentes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(dependentes)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
	public Response actionEntidades() throws IOException, IllegalArgumentException, IllegalAccessException{
		Home model = new Home();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Home","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(entidades)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Home","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
