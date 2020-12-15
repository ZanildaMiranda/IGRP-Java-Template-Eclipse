package nosi.webapps.sistema_cuidado_dependentes.pages.lookupservicocuidado;

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
		
public class LookupServicoCuidadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		LookupServicoCuidado model = new LookupServicoCuidado();
		model.load();
		LookupServicoCuidadoView view = new LookupServicoCuidadoView();
		view.fwl_unidade_cuidado.setParam(true);
		view.fwl_localizacao.setParam(true);
		view.fwl_contacto.setParam(true);
		view.fwl_id_unidade_cuidado.setParam(true);
		view.fwl_codigo.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Voluptatem sed natus stract sit' as fwl_unidade_cuidado,'Voluptatem iste lorem laudantium rem' as fwl_localizacao,'Ipsum deserunt magna ut ipsum' as fwl_contacto,'hidden-2e43_e6d3' as fwl_id_unidade_cuidado,'hidden-3e64_5b13' as fwl_codigo "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionToolsbar_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		LookupServicoCuidado model = new LookupServicoCuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_fwl_unidade_cuidado",Core.getParam("p_fwl_unidade_cuidado"));
		  this.addQueryString("p_fwl_localizacao",Core.getParam("p_fwl_localizacao"));
		  this.addQueryString("p_fwl_contacto",Core.getParam("p_fwl_contacto"));
		  this.addQueryString("p_fwl_id_unidade_cuidado",Core.getParam("p_fwl_id_unidade_cuidado"));
		  this.addQueryString("p_fwl_codigo",Core.getParam("p_fwl_codigo"));
		  return this.forward("sistema_cuidado_dependentes","LookupServicoCuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(toolsbar_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","LookupServicoCuidado","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
