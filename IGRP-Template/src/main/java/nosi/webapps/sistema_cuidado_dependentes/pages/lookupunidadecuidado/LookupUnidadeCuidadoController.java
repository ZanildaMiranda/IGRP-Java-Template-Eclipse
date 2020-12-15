package nosi.webapps.sistema_cuidado_dependentes.pages.lookupunidadecuidado;

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


/*----#end-code----*/
		
public class LookupUnidadeCuidadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		LookupUnidadeCuidado model = new LookupUnidadeCuidado();
		model.load();
		LookupUnidadeCuidadoView view = new LookupUnidadeCuidadoView();
		view.fwl_unidade_cuidado.setParam(true);
		view.fwl_localizacao.setParam(true);
		view.fwl_contacto.setParam(true);
		view.fwl_id_unidade_cuidado.setParam(true);
		view.fwl_codigo.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Sit ipsum natus rem voluptatem' as fwl_unidade_cuidado,'Anim consectetur stract voluptatem dolor' as fwl_localizacao,'Doloremque dolor natus ut totam' as fwl_contacto,'hidden-6916_9fb8' as fwl_id_unidade_cuidado,'hidden-8573_4120' as fwl_codigo "));
		  ----#gen-example */
	/*
	try{
	
	TblUnidadeCuidado tblunidadecuidadofilter = new TblUnidadeCuidado().find();
	List<TblUnidadeCuidado> tblunidadecuidadoList = tblunidadecuidadofilter.all();
	List<LookupUnidadeCuidado.Table_1> tblunidadecuidadoTable = new ArrayList<>();
	if(tblunidadecuidadoList != null){
		for(TblUnidadeCuidado tblunidadecuidado : tblunidadecuidadoList){
			LookupUnidadeCuidado.Table_1 row = new LookupUnidadeCuidado.Table_1();
			row.setFwl_unidade_cuidado(tblunidadecuidado.getNome());
			row.setFwl_localizacao(tblunidadecuidado.getLocalidade());
			row.setFwl_contacto(""+tblunidadecuidado.getTelefone());
			row.setFwl_id_unidade_cuidado(tblunidadecuidado.getIdUnidadeCuidado());
			row.setFwl_codigo(""+tblunidadecuidado.getCodigo());
			tblunidadecuidadoTable.add(row);
		}
	}
	model.setTable_1(tblunidadecuidadoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	*/
		/*----#start-code(index)----*/
		try{
	
	TblUnidadeCuidado tblunidadecuidadofilter = new TblUnidadeCuidado().find();
	List<TblUnidadeCuidado> tblunidadecuidadoList = tblunidadecuidadofilter.all();
	List<LookupUnidadeCuidado.Table_1> tblunidadecuidadoTable = new ArrayList<>();
	if(tblunidadecuidadoList != null){
		for(TblUnidadeCuidado tblunidadecuidado : tblunidadecuidadoList){
			LookupUnidadeCuidado.Table_1 row = new LookupUnidadeCuidado.Table_1();
			row.setFwl_unidade_cuidado(tblunidadecuidado.getNome());
			row.setFwl_localizacao(tblunidadecuidado.getLocalidade());
			row.setFwl_contacto(""+tblunidadecuidado.getTelefone());
			row.setFwl_id_unidade_cuidado(tblunidadecuidado.getIdUnidadeCuidado());
			row.setFwl_codigo(""+tblunidadecuidado.getCodigo());
			tblunidadecuidadoTable.add(row);
		}
	}
	model.setTable_1(tblunidadecuidadoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
