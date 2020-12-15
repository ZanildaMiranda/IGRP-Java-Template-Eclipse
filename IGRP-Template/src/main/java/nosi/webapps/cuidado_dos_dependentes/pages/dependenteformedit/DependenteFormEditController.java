package nosi.webapps.cuidado_dos_dependentes.pages.dependenteformedit;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import nosi.webapps.cuidado_dos_dependentes.dao.TPessoa;
import nosi.webapps.cuidado_dos_dependentes.dao.TAgregado;
import nosi.webapps.cuidado_dos_dependentes.dao.TDependente;
import nosi.webapps.cuidado_dos_dependentes.dao.TContato;
import nosi.webapps.cuidado_dos_dependentes.dao.TIdentificacao;
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.cuidado_dos_dependentes.business.DependenteBusiness;
import nosi.webapps.cuidado_dos_dependentes.dao.TPessoa;
/*----#end-code----*/
		
public class DependenteFormEditController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependenteFormEdit model = new DependenteFormEdit();
		model.load();
		DependenteFormEditView view = new DependenteFormEditView();
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
		model.loadSl_detalhes_dependentes(Core.query(null,"SELECT '12' as tipo_de_dependencia,'2' as grau_de_dependencia,'12' as autocuidado,'12' as origem_de_dependencia,'12' as instalacao_de_dependencia,'08-03-2016' as data_de_dependencia,'Amet sit mollit aperiam mollit' as tempo_de_dependencia "));
		model.loadSl_agregado_familiar(Core.query(null,"SELECT 'Sit accusantium mollit anim dolor' as nome_completo,'2' as grau_de_parentesco,'07-02-2011' as data_de_nascimento "));
		model.loadSl_contactos(Core.query(null,"SELECT '2' as tipo_de_contacto,'Amet aliqua rem sit consectetur' as contacto "));
		model.loadSl_documentos_identificacao(Core.query(null,"SELECT '12' as tipo_identificacao,'239' as numero,'07-03-2011' as data_emissao,'06-05-2010' as data_de_validade,'' as vitalicio,'Totam sed accusantium unde sed' as entidade_emissora,'' as ficheiro "));
		  ----#gen-example */
	/*
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TPessoa tpessoa = new TPessoa().findOne();
		if (tpessoa!=null && !tpessoa.hasError()) {
			model.setDados_dependente();
			model.setNome();
			model.setNome_da_mae();
			model.setNome_do_pai();
			model.setData_nascimento();
			model.setSexo();
			model.setNacionalidade();
			model.setProfissao();
			model.setHabilitacao_literaria();
			model.setEstado_civil();
			model.setId();
	
	view.btn_--.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TAgregado tagregadofilter = new TAgregado().find();
	List<TAgregado> tagregadoList = tagregadofilter.all();
	if ( Core.isNotNull(tagregadoList) ) {
			List <DependenteFormEdit.Sl_agregado_familiar>  separatorlistDocs =new ArrayList<>();
			tagregadoList.forEach(tagregado-> {
				DependenteFormEdit.Sl_agregado_familiar row = new DependenteFormEdit.Sl_agregado_familiar();
				
				row.setNome_completo( new Pair(,) );
	row.setGrau_de_parentesco( new Pair(,) );
	row.setData_de_nascimento( new Pair(,) );
	row.setSl_agregado_familiar_id( new Pair(,) );
				separatorlistDocs.add(row);
			});
			model.setSl_agregado_familiar( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TDependente tdependentefilter = new TDependente().find();
	List<TDependente> tdependenteList = tdependentefilter.all();
	if ( Core.isNotNull(tdependenteList) ) {
			List <DependenteFormEdit.Sl_detalhes_dependentes>  separatorlistDocs =new ArrayList<>();
			tdependenteList.forEach(tdependente-> {
				DependenteFormEdit.Sl_detalhes_dependentes row = new DependenteFormEdit.Sl_detalhes_dependentes();
				
				row.setTipo_de_dependencia( new Pair(,) );
	row.setGrau_de_dependencia( new Pair(,) );
	row.setAutocuidado( new Pair(,) );
	row.setOrigem_de_dependencia( new Pair(,) );
	row.setInstalacao_de_dependencia( new Pair(,) );
	row.setData_de_dependencia( new Pair(,) );
	row.setTempo_de_dependencia( new Pair(,) );
	row.setSl_detalhes_dependentes_id( new Pair(,) );
				separatorlistDocs.add(row);
			});
			model.setSl_detalhes_dependentes( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TContato tcontatofilter = new TContato().find();
	List<TContato> tcontatoList = tcontatofilter.all();
	if ( Core.isNotNull(tcontatoList) ) {
			List <DependenteFormEdit.Sl_contactos>  separatorlistDocs =new ArrayList<>();
			tcontatoList.forEach(tcontato-> {
				DependenteFormEdit.Sl_contactos row = new DependenteFormEdit.Sl_contactos();
				
				row.setTipo_de_contacto( new Pair(,) );
	row.setContacto( new Pair(,) );
	row.setSl_contactos_id( new Pair(,) );
				separatorlistDocs.add(row);
			});
			model.setSl_contactos( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TIdentificacao tidentificacaofilter = new TIdentificacao().find();
	List<TIdentificacao> tidentificacaoList = tidentificacaofilter.all();
	if ( Core.isNotNull(tidentificacaoList) ) {
			List <DependenteFormEdit.Sl_documentos_identificacao>  separatorlistDocs =new ArrayList<>();
			tidentificacaoList.forEach(tidentificacao-> {
				DependenteFormEdit.Sl_documentos_identificacao row = new DependenteFormEdit.Sl_documentos_identificacao();
				
				row.setTipo_identificacao( new Pair(,) );
	row.setNumero( new Pair(,) );
	row.setData_emissao( new Pair(,) );
	row.setData_de_validade( new Pair(,) );
	row.setVitalicio( new Pair(,) );
	row.setEntidade_emissora( new Pair(,) );
	row.setFicheiro( new Pair(Core.getLinkFileByUuid(),!=null? Core.getFileNameByUuid():""));
	row.setSl_documentos_identificacao_id( new Pair(,) );
				separatorlistDocs.add(row);
			});
			model.setSl_documentos_identificacao( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	*/
		/*----#start-code(index)----*/
		
		
		DependenteBusiness business = new DependenteBusiness();
		business.loadDependenteEdit(model);
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		DependenteFormEdit model = new DependenteFormEdit();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("cuidado_dos_dependentes","DependenteFormEdit","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(guardar)----*/

		this.addQueryString("p_id",model.getId());
		
		DependenteBusiness business = new DependenteBusiness();
		business.saveDependenteEdit(model);
		/*----#end-code----*/
		return this.redirect("cuidado_dos_dependentes","DependenteFormEdit","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
