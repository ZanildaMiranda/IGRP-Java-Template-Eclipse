package nosi.webapps.cuidado_dos_dependentes.pages.cadastrocuidadorform;

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
		
public class CadastroCuidadorFormController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		CadastroCuidadorForm model = new CadastroCuidadorForm();
		model.load();
		CadastroCuidadorFormView view = new CadastroCuidadorFormView();
		view.tipo_de_cuidador.loadDomain("DM_TipoCuidador","cuidado_dos_dependentes","-- Selecionar --");
		view.sexo.loadDomainByApp("DM_SEXO","cuidado_dos_dependentes");
		view.habilitacao_literaria.loadDomain("DM_Habilitacao","cuidado_dos_dependentes","-- Selecionar --");
		view.estado_civil.loadDomain("DM_EstadoCivil","cuidado_dos_dependentes","-- Selecionar --");
		view.tipo_de_contacto.loadDomain("DM_TipoContacto","cuidado_dos_dependentes","-- Selecionar --");
		view.tipo_identificacao.loadDomain("D_TipoIdentificacao","cuidado_dos_dependentes","-- Selecionar --");
		view.vitalicio.loadDomainByApp("DM_Vitalicio","cuidado_dos_dependentes");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_3(Core.query(null,"SELECT '2' as tipo_de_contacto,'Sit natus elit totam consectetur' as contacto "));
		model.loadSeparatorlist_4(Core.query(null,"SELECT '12' as tipo_identificacao,'32' as numero,'07-04-2012' as data_emissao,'06-07-2014' as data_de_validade,'' as vitalicio,'Lorem labore accusantium mollit doloremque' as entidade_emissora,'' as ficheiro "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		CadastroCuidadorForm model = new CadastroCuidadorForm();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado_dos_dependentes","CadastroCuidadorForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(guardar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","CadastroCuidadorForm","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
