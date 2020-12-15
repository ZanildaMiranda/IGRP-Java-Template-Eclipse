package nosi.webapps.sistema_cuidado_dependentes.pages.listar_unidade_cuidado;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;

/*----#end-code----*/
		
public class Listar_unidade_cuidadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listar_unidade_cuidado model = new Listar_unidade_cuidado();
		model.load();
		Listar_unidade_cuidadoView view = new Listar_unidade_cuidadoView();
		view.id_unidade_cuidado_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Anim natus omnis sed doloremque' as unidade_cuidado,'Accusantium aperiam natus elit amet' as localizacao,'Deserunt officia deserunt sit sed' as contacto,'hidden-b64f_6017' as id_unidade_cuidado_tbl "));
		  ----#gen-example */
	/*
	try{
	
	TblUnidadeCuidado tblunidadecuidadofilter = new TblUnidadeCuidado().find();
	List<TblUnidadeCuidado> tblunidadecuidadoList = tblunidadecuidadofilter.all();
	List<Listar_unidade_cuidado.Table_1> tblunidadecuidadoTable = new ArrayList<>();
	if(tblunidadecuidadoList != null){
		for(TblUnidadeCuidado tblunidadecuidado : tblunidadecuidadoList){
			Listar_unidade_cuidado.Table_1 row = new Listar_unidade_cuidado.Table_1();
			row.setUnidade_cuidado(tblunidadecuidado.getNome());
			row.setLocalizacao(tblunidadecuidado.getLocalidade());
			row.setContacto(""+tblunidadecuidado.getTelefone());
			row.setId_unidade_cuidado_tbl(tblunidadecuidado.getIdUnidadeCuidado());
			tblunidadecuidadoTable.add(row);
		}
	}
	model.setTable_1(tblunidadecuidadoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	*/
		/*----#start-code(index)----*/

		try {

			TblUnidadeCuidado tblunidadecuidadofilter = new TblUnidadeCuidado().find();
			List<TblUnidadeCuidado> tblunidadecuidadoList = tblunidadecuidadofilter.all();
			List<Listar_unidade_cuidado.Table_1> tblunidadecuidadoTable = new ArrayList<>();
			if (tblunidadecuidadoList != null) {
				for (TblUnidadeCuidado tblunidadecuidado : tblunidadecuidadoList) {
					Listar_unidade_cuidado.Table_1 row = new Listar_unidade_cuidado.Table_1();
					row.setUnidade_cuidado(tblunidadecuidado.getNome());
					row.setLocalizacao(tblunidadecuidado.getLocalidade());
					row.setContacto("" + tblunidadecuidado.getTelefone());
					row.setId_unidade_cuidado_tbl(tblunidadecuidado.getIdUnidadeCuidado());
					tblunidadecuidadoTable.add(row);
				}
			}
			model.setTable_1(tblunidadecuidadoTable);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listar_unidade_cuidado model = new Listar_unidade_cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_unidade_cuidado_tbl",Core.getParam("p_id_unidade_cuidado_tbl"));
		  return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/

		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index", this.queryString());	
	}
	
	public Response actionVer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listar_unidade_cuidado model = new Listar_unidade_cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_unidade_cuidado_tbl",Core.getParam("p_id_unidade_cuidado_tbl"));
		  return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(ver)----*/

		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listar_unidade_cuidado model = new Listar_unidade_cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_unidade_cuidado_tbl",Core.getParam("p_id_unidade_cuidado_tbl"));
		  return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	/*
	this.addQueryString("p_id_unidade_cuidado_tbl", Core.getParam("p_id_unidade_cuidado_tbl"));
	
	this.addQueryString("isEdit", "true");
	*/
		/*----#start-code(editar)----*/
		this.addQueryString("p_id_unidade_cuidado_tbl", Core.getParam("p_id_unidade_cuidado_tbl"));

		this.addQueryString("isEdit", "true");

		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listar_unidade_cuidado model = new Listar_unidade_cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_unidade_cuidado_tbl",Core.getParam("p_id_unidade_cuidado_tbl"));
		  return this.forward("sistema_cuidado_dependentes","Listar_unidade_cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	/*
	TblUnidadeCuidado tblunidadecuidado = new TblUnidadeCuidado().findOne(Core.getParamInt("p_id_unidade_cuidado_tbl"));
	if (tblunidadecuidado != null && !tblunidadecuidado.hasError()) {
		boolean del = tblunidadecuidado.delete(tblunidadecuidado.getIdUnidadeCuidado());
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(tblunidadecuidado.getError().toString());
	}
	
	*/
		/*----#start-code(eliminar)----*/
		TblUnidadeCuidado tblunidadecuidado = new TblUnidadeCuidado()
				.findOne(Core.getParamInt("p_id_unidade_cuidado_tbl"));
		if (tblunidadecuidado != null && !tblunidadecuidado.hasError()) {
			boolean del = tblunidadecuidado.delete(tblunidadecuidado.getIdUnidadeCuidado());
			if (del == true)
				Core.setMessageSuccess("Deleted from DB successfully!");
			else
				Core.setMessageError("Error deleting person from DB!");
		} else {
			Core.setMessageError(tblunidadecuidado.getError().toString());
		}

		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Listar_unidade_cuidado","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
