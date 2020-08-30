package nosi.webapps.cuidado.pages.funcionario;

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
		
public class FuncionarioController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		FuncionarioView view = new FuncionarioView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Accusantium magna mollit sed l' as table_1_plaintext_1 "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionForm_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(form_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Funcionario","index", this.queryString());	
	}
	
	public Response actionTable_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(table_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Funcionario","index", this.queryString());	
	}
	
	public Response actionTable_1_button_2() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(table_1_button_2)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado","Funcionario","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
