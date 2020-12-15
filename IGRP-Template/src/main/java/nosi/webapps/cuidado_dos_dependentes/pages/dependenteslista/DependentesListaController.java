package nosi.webapps.cuidado_dos_dependentes.pages.dependenteslista;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.cuidado_dos_dependentes.dao.TPessoa;
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.cuidado_dos_dependentes.business.DependenteBusiness;
/*----#end-code----*/
		
public class DependentesListaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		DependentesListaView view = new DependentesListaView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Doloremque voluptatem labore deserunt natus' as nome,'07-04-2016' as data_de_nascimento,'Sed unde sit aperiam consectet' as sexo,'Accusantium stract anim ipsum' as estado_civil,'Amet sit unde consectetur aper' as _n_de_agregado_familiar,'hidden-ff5a_25f2' as id "));
		  ----#gen-example */
	/*
	try{
	
	TPessoa tpessoafilter = new TPessoa().find();
	List<TPessoa> tpessoaList = tpessoafilter.all();
	List<DependentesLista.Table_1> tpessoaTable = new ArrayList<>();
	if(tpessoaList != null){
		for(TPessoa tpessoa : tpessoaList){
			DependentesLista.Table_1 row = new DependentesLista.Table_1();
			row.setNome(tpessoa.getNome());
			row.setData_de_nascimento(tpessoa.getDataNascimento()!=null?Core.dateToString(tpessoa.getDataNascimento(),"dd-MM-yyyy"):null);
			row.setSexo(tpessoa.getSexo());
			row.setEstado_civil(tpessoa.getEstadoCivi());
			row.setId(tpessoa.getId());
			tpessoaTable.add(row);
		}
	}
	model.setTable_1(tpessoaTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	*/
		/*----#start-code(index)----*/
		DependenteBusiness  dependenteBusiness = new DependenteBusiness();
		dependenteBusiness.loadListaDependentes(model);
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo_() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("cuidado_dos_dependentes","DependenteForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteForm","index", this.queryString());	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("cuidado_dos_dependentes","DependentesLista","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependentesLista","index", this.queryString());	
	}
	
	public Response actionVizualizar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("cuidado_dos_dependentes","DependenteFormEdit","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(vizualizar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteFormEdit","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("cuidado_dos_dependentes","DependenteFormEdit","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	/*
	this.addQueryString("isEdit", "true");
	
	this.addQueryString("p_id", Core.getParam("p_id"));
	*/
		/*----#start-code(editar)----*/
		
		this.addQueryString("isEdit", "true");
		
		this.addQueryString("p_id", Core.getParam("p_id"));
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteFormEdit","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependentesLista model = new DependentesLista();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("cuidado_dos_dependentes","DependenteFormEdit","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	/*
	TPessoa tpessoa = new TPessoa().findOne(Core.getParamInt("p_id"));
	if (tpessoa != null && !tpessoa.hasError()) {
		boolean del = tpessoa.delete(tpessoa.getId());
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(tpessoa.getError().toString());
	}
	
	*/
		/*----#start-code(eliminar)----*/
		
              TPessoa tpessoa = new TPessoa().findOne(Core.getParamInt("p_id"));
          if (tpessoa != null && !tpessoa.hasError()) {
              boolean del = tpessoa.delete(tpessoa.getId());
              if (del == true)
                  Core.setMessageSuccess("Deleted from DB successfully!");
              else
                  Core.setMessageError("Error deleting person from DB!");
          } else {
              Core.setMessageError(tpessoa.getError().toString());
          }
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteFormEdit","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
