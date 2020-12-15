package nosi.webapps.cuidado_dos_dependentes.pages.dependenteform;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.cuidado_dos_dependentes.business.DependenteBusiness;
import nosi.webapps.cuidado_dos_dependentes.dao.TDependente;
import nosi.webapps.cuidado_dos_dependentes.dao.TPessoa;
import nosi.webapps.cuidado_dos_dependentes.pages.dependenteform.DependenteForm.Sl_detalhes_dependentes;


/*----#end-code----*/
		
public class DependenteFormController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependenteForm model = new DependenteForm();
		model.load();
		DependenteFormView view = new DependenteFormView();
		view.sexo.loadDomainByApp("DM_SEXO","cuidado_dos_dependentes");
		view.habilitacao_literaria.loadDomain("DM_Habilitacao","cuidado_dos_dependentes","-- Selecionar --");
		view.estado_civil.loadDomain("DM_EstadoCivil","cuidado_dos_dependentes","-- Selecionar --");
		view.tipo_de_dependencia.loadDomain("DM_TDependencia","cuidado_dos_dependentes","-- Selecionar --");
		view.grau_de_dependencia.loadDomain("DM_GrauDependencia","cuidado_dos_dependentes","-- Selecionar --");
		view.autocuidado.loadDomain("DM_Autocuidado","cuidado_dos_dependentes","-- Selecionar --");
		view.origem_de_dependencia.loadDomain("DM_OrigemDependencia","cuidado_dos_dependentes","-- Selecionar --");
		view.instalacao_de_dependencia.loadDomain("DM_InstalacaoDependencia","cuidado_dos_dependentes","-- Selecionar --");
		view.grau_de_parentesco.loadDomain("DM_Parentesco","cuidado_dos_dependentes","-- Selecionar --");
		view.tipo_de_contacto.loadDomain("DM_TipoContacto","cuidado_dos_dependentes","-- Selecionar --");
		view.tipo_identificacao.loadDomain("D_TipoIdentificacao","cuidado_dos_dependentes","-- Selecionar --");
		view.vitalicio.loadDomainByApp("DM_Vitalicio","cuidado_dos_dependentes");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSl_detalhes_dependentes(Core.query(null,"SELECT '12' as tipo_de_dependencia,'2' as grau_de_dependencia,'12' as autocuidado,'12' as origem_de_dependencia,'12' as instalacao_de_dependencia,'07-02-2017' as data_de_dependencia,'Deserunt anim consectetur lorem ut' as tempo_de_dependencia "));
		model.loadSl_agregado_familiar(Core.query(null,"SELECT 'Ipsum magna mollit officia anim' as nome_completo,'2' as grau_de_parentesco,'07-06-2010' as data_de_nascimento "));
		model.loadSl_contactos(Core.query(null,"SELECT '2' as tipo_de_contacto,'Lorem mollit doloremque iste totam' as contacto "));
		model.loadSl_documentos_identificacao(Core.query(null,"SELECT '12' as tipo_identificacao,'140' as numero,'01-03-2014' as data_emissao,'03-08-2013' as data_de_validade,'' as vitalicio,'Aperiam anim natus magna dolor' as entidade_emissora,'' as ficheiro "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependenteForm model = new DependenteForm();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado_dos_dependentes","DependenteForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(guardar)----*/
		DependenteBusiness business = new DependenteBusiness();		
		business.saveDependenteForm(model);
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteForm","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
