package nosi.webapps.sistema_cuidado_dependentes.pages.registar_unidade_de_cuidado;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_cuidado_dependentes.dao.TblUnidadeCuidado;

/*----#end-code----*/
		
public class Registar_unidade_de_cuidadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_unidade_de_cuidado model = new Registar_unidade_de_cuidado();
		model.load();
		Registar_unidade_de_cuidadoView view = new Registar_unidade_de_cuidadoView();
	/*
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TblUnidadeCuidado tblunidadecuidado = new TblUnidadeCuidado().findOne(Core.getParamInt("p_id_unidade_cuidado_tbl"));
		if (tblunidadecuidado!=null && !tblunidadecuidado.hasError()) {
			model.setCodigo(""+tblunidadecuidado.getCodigo());
			model.setNome(tblunidadecuidado.getNome());
			model.setLocalidade(tblunidadecuidado.getLocalidade());
			model.setTelefone(tblunidadecuidado.getTelefone());
			model.setNif(tblunidadecuidado.getNif());
			model.setEmail(tblunidadecuidado.getEmail());
			model.setId_unidade_cuidado(tblunidadecuidado.getIdUnidadeCuidado());
	
	view.btn_registar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	*/
		/*----#start-code(index)----*/
		
		try{
			String isEdit = Core.getParam("isEdit");
			if (Core.isNotNull(isEdit)) {
				TblUnidadeCuidado tblunidadecuidado = new TblUnidadeCuidado().findOne(Core.getParamInt("p_id_unidade_cuidado_tbl"));
				if (tblunidadecuidado!=null && !tblunidadecuidado.hasError()) {
					model.setCodigo(""+tblunidadecuidado.getCodigo());
					model.setNome(tblunidadecuidado.getNome());
					model.setLocalidade(tblunidadecuidado.getLocalidade());
					model.setTelefone(tblunidadecuidado.getTelefone());
					model.setNif(tblunidadecuidado.getNif());
					model.setEmail(tblunidadecuidado.getEmail());
					model.setId_unidade_cuidado(tblunidadecuidado.getIdUnidadeCuidado());
			
			view.btn_registar.addParameter("isEdit", "true");
				}
			}
			}catch ( Exception e ) {
				e.printStackTrace();
			}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_unidade_de_cuidado model = new Registar_unidade_de_cuidado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	/*
	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		TblUnidadeCuidado tblunidadecuidado  = new TblUnidadeCuidado();
		if(Core.isNotNull(isEdit)) {
			 tblunidadecuidado = session.find(TblUnidadeCuidado.class, model.getId_unidade_cuidado());
		}
		if (tblunidadecuidado != null){
			tblunidadecuidado.setCodigo(Core.toInt(model.getCodigo()));
			tblunidadecuidado.setNome(model.getNome());
			tblunidadecuidado.setLocalidade(model.getLocalidade());
			tblunidadecuidado.setTelefone(model.getTelefone());
			tblunidadecuidado.setNif(model.getNif());
			tblunidadecuidado.setEmail(model.getEmail());
		}
		session.persist(tblunidadecuidado);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString());
	}
	*/
		/*----#start-code(registar)----*/
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try{
		if (model.validate()) {
			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
			transaction.begin();
			TblUnidadeCuidado tblunidadecuidado  = new TblUnidadeCuidado();
			if(Core.isNotNull(isEdit)) {
				 tblunidadecuidado = session.find(TblUnidadeCuidado.class, model.getId_unidade_cuidado());
			}
			if (tblunidadecuidado != null){
				tblunidadecuidado.setCodigo(Core.toInt(model.getCodigo()));
				tblunidadecuidado.setNome(model.getNome());
				tblunidadecuidado.setLocalidade(model.getLocalidade());
				tblunidadecuidado.setTelefone(model.getTelefone());
				tblunidadecuidado.setNif(model.getNif());
				tblunidadecuidado.setEmail(model.getEmail());
			}
			session.persist(tblunidadecuidado);
			transaction.commit();
			Core.setMessageSuccess();
		}
		else
			Core.setMessageError();
		}catch ( Exception e ) {
			e.printStackTrace();
			Core.setMessageError("Error: "+ e.getMessage());
			if (transaction != null)
				transaction.rollback();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		if(Core.isNotNull(isEdit)) {
			this.addQueryString("isEdit", "true");
			return this.forward("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index",this.queryString());
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_cuidado_dependentes","Registar_unidade_de_cuidado","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
