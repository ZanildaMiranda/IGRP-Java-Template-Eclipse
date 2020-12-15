package nosi.webapps.sistema_cuidado_dependentes.pages.registardependentes;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import nosi.webapps.sistema_cuidado_dependentes.dao.TblDependente;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblCuidador;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class RegistarDependentesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		RegistarDependentes model = new RegistarDependentes();
		model.load();
		RegistarDependentesView view = new RegistarDependentesView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.classe_dependencia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.origem.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.pensionista.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.instalacao_dependencia.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblDependente tbldependente = new TblDependente().findOne(Core.getParamInt("p_id_dependente_tbl"));
		if (tbldependente!=null && !tbldependente.hasError()) {
			model.setNome(tbldependente.getNome());
			model.setMorada(tbldependente.getMorada());
			model.setTelefone(tbldependente.getTelefone());
			model.setSexo(tbldependente.getSexo());
			model.setData_nascimento(tbldependente.getDataNascimento()!=null?Core.dateToString(tbldependente.getDataNascimento(),"dd-MM-yyyy"):null);
			model.setGrau_de_dependencia(tbldependente.getGrauDependencia());
			model.setNacionalidade(tbldependente.getNacionalidade());
			model.setProfissao(tbldependente.getProfissao());
			model.setEstado_civil(tbldependente.getEstadoCivil());
			model.setAutocuidado(tbldependente.getAutocuidado());
			model.setEmail(tbldependente.getEmail());
			model.setCuidador(tbldependente.getIdCuidadorFk().getNome());
			model.setId_dependente(tbldependente.getIdDependente());
	
	view.btn_registar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistar() throws IOException, IllegalArgumentException, IllegalAccessException{
		RegistarDependentes model = new RegistarDependentes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_cuidado_dependentes","RegistarDependentes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(registar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","RegistarDependentes","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
