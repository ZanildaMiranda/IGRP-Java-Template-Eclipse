package nosi.webapps.sistema_cuidado_dependentes.pages.registar_servico__cuidado;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import nosi.webapps.sistema_cuidado_dependentes.dao.TblServicoCuidado;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblDependente;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_cuidado_dependentes.dao.TblServicoCuidado;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblDependente;

/*----#end-code----*/
		
public class Registar_servico__cuidadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_servico__cuidado model = new Registar_servico__cuidado();
		model.load();
		Registar_servico__cuidadoView view = new Registar_servico__cuidadoView();
	/*
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblServicoCuidado tblservicocuidado = new TblServicoCuidado().findOne(Core.getParamInt("p_id_servico_cuidado_tbl"));
		if (tblservicocuidado!=null && !tblservicocuidado.hasError()) {
			model.setTipo(tblservicocuidado.getTipo());
			model.setDescriccao(tblservicocuidado.getDescricao());
			model.setUnidade_cuidado(""+tblservicocuidado.getIdUnidadeCuidadoFk().getCodigo());
			model.setDependente(tblservicocuidado.getIdDependenteFk().getNome());
			model.setId_servico_cuidado(tblservicocuidado.getIdServicoCuidado());
			model.setId_unidade_cuidado(Core.toInt(tblservicocuidado.getIdUnidadeCuidadoFk().getNome()));
	
	view.btn_registar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	*/
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_servico__cuidado model = new Registar_servico__cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_cuidado_dependentes","Registar_servico__cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(registar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_servico__cuidado","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
