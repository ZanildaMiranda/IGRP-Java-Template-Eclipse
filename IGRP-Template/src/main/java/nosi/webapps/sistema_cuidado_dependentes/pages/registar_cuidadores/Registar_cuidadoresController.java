package nosi.webapps.sistema_cuidado_dependentes.pages.registar_cuidadores;

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
		
public class Registar_cuidadoresController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_cuidadores model = new Registar_cuidadores();
		model.load();
		Registar_cuidadoresView view = new Registar_cuidadoresView();
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_cuidadores model = new Registar_cuidadores();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_cuidado_dependentes","Registar_cuidadores","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(registar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_cuidadores","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
