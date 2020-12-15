package nosi.webapps.cuidado_dos_dependentes.business;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.Core;
import nosi.webapps.cuidado_dos_dependentes.dao.TAgregado;
import nosi.webapps.cuidado_dos_dependentes.dao.TContato;
import nosi.webapps.cuidado_dos_dependentes.dao.TDependente;
import nosi.webapps.cuidado_dos_dependentes.dao.TIdentificacao;
import nosi.webapps.cuidado_dos_dependentes.dao.TPessoa;
import nosi.webapps.cuidado_dos_dependentes.pages.dependenteform.DependenteForm;
import nosi.webapps.cuidado_dos_dependentes.pages.dependenteform.DependenteForm.Sl_detalhes_dependentes;
import nosi.webapps.cuidado_dos_dependentes.pages.dependenteformedit.DependenteFormEdit;
import nosi.webapps.cuidado_dos_dependentes.pages.dependenteslista.DependentesLista;

/**
 * Zanilda 04/11/2020
 */
public class DependenteBusiness {

	public static final String DM_SEXO = "DM_sexo";
	public static final String DM_ESTADO_CIVIL = "DM_EstadoCivil";
	public static final String DM_HABILITACAO_LITER = "DM_Habilitacao";
	public static final String DM_PARENTESCO = "DM_Parentesco";
	public static final String DM_CONTATO = "DM_TipoContacto";
	public static final String DM_GRAU = "DM_GrauDependencia";
	public static final String DM_AUTOCUIDADO = "DM_Autocuidado";
	public static final String DM_TIPO_IDENTIFICACO = "D_TipoIdentificacao";
	public static final String DM_VITALICIO = "DM_Vitalicio";
	public static final String DM_TIPO_DEPENDENCIA = "DM_TDependencia";
	public static final String DM_ORIGEM = "DM_OrigemDependencia";
	public static final String DM_INSTALACAO = "DM_InstalacaoDependencia";

	public void loadListaDependentes(DependentesLista model) {

		try {

			TPessoa tpessoafilter = new TPessoa().find();
			List<TPessoa> tpessoaList = tpessoafilter.all();
			List<DependentesLista.Table_1> tpessoaTable = new ArrayList<>();

			if (tpessoaList != null) {
				for (TPessoa tpessoa : tpessoaList) {
					DependentesLista.Table_1 row = new DependentesLista.Table_1();
					row.setNome(tpessoa.getNome());
					row.setData_de_nascimento(tpessoa.getDataNascimento() != null
							? Core.dateToString(tpessoa.getDataNascimento(), "dd-MM-yyyy")
							: null);
					row.setSexo(Core.findDomainDescByKey(DM_SEXO, tpessoa.getSexo()));
					row.setEstado_civil(Core.findDomainDescByKey(DM_ESTADO_CIVIL, tpessoa.getEstadoCivi()));
					row.setId(tpessoa.getId());
					tpessoaTable.add(row);
				}

			}
			model.setTable_1(tpessoaTable);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveDependenteForm(DependenteForm model) {
		Session session = null;
		Transaction transaction = null;
		try {
			if (model.validate()) {
				System.out.println("NSTA LI");
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				transaction.begin();
				TPessoa tpessoa = new TPessoa();
				tpessoa.setNome(model.getNome());
				tpessoa.setDataNascimento(Core.formatDate(model.getData_nascimento(), "dd-mm-yyyy", "yyyy-mm-dd"));
				tpessoa.setNomeMae(model.getNome_da_mae());
				tpessoa.setNomePai(model.getNome_do_pai());
				tpessoa.setSexo(model.getSexo());
				tpessoa.setHabilitacoes(model.getHabilitacao_literaria());
				tpessoa.setEstadoCivi(model.getEstado_civil());
				tpessoa.setNacionalidade(model.getNacionalidade());
				tpessoa.setProfissao(model.getProfissao());
				session.persist(tpessoa);
				System.out.println("PESSOA.id=" + tpessoa);
				List<String> tdependenteeditList = new ArrayList<>();
				if (model.getP_sl_detalhes_dependentes_edit() != null) {
					tdependenteeditList = new ArrayList<>(Arrays.asList(model.getP_sl_detalhes_dependentes_edit()));
				}
				for (DependenteForm.Sl_detalhes_dependentes row : model.getSl_detalhes_dependentes()) {
					TDependente tdependente = new TDependente();

					tdependente.setPessoaFk(tpessoa);
					tdependente.setTipoDependencia(row.getTipo_de_dependencia().getKey());
					tdependente.setGrauDependencia(row.getGrau_de_dependencia().getKey());
					tdependente.setAutocuidado(row.getAutocuidado().getKey());
					tdependente.setOrigemDependencia(row.getOrigem_de_dependencia().getKey());
					tdependente.setInstalacaoDependencia(row.getInstalacao_de_dependencia().getKey());
					tdependente.setDataDependencia(
							Core.formatDate(row.getData_de_dependencia().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tdependente.setTempoDependencia(row.getTempo_de_dependencia().getKey());
					session.persist(tdependente);
				}

				List<String> tagregadoeditList = new ArrayList<>();
				if (model.getP_sl_agregado_familiar_edit() != null) {
					tagregadoeditList = new ArrayList<>(Arrays.asList(model.getP_sl_agregado_familiar_edit()));
				}
				for (DependenteForm.Sl_agregado_familiar row : model.getSl_agregado_familiar()) {
					TAgregado tagregado = new TAgregado();

					TPessoa tpessoaAgregado = new TPessoa();
					tpessoaAgregado.setNome(row.getNome_completo().getKey());
					tpessoaAgregado.setDataNascimento(
							Core.formatDate(row.getData_de_nascimento().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));

					session.persist(tpessoaAgregado);

					tagregado.setPessoaFk(tpessoa);
					tagregado.setPessoaAgregadoFk(tpessoaAgregado.getId());
					tagregado.setParentesco(row.getGrau_de_parentesco().getKey());

					session.persist(tagregado);
				}

				List<String> tcontatoeditList = new ArrayList<>();
				if (model.getP_sl_contactos_edit() != null) {
					tcontatoeditList = new ArrayList<>(Arrays.asList(model.getP_sl_agregado_familiar_edit()));
				}
				for (DependenteForm.Sl_contactos row : model.getSl_contactos()) {
					TContato tcontato = new TContato();

					tcontato.setPessoaFk(tpessoa);

					tcontato.setTipoContato(row.getTipo_de_contacto().getKey());
					tcontato.setContato(row.getContacto().getKey());
					session.persist(tcontato);
				}

				List<String> tidentificacaoeditList = new ArrayList<>();
				if (model.getP_sl_documentos_identificacao_edit() != null) {
					tidentificacaoeditList = new ArrayList<>(
							Arrays.asList(model.getP_sl_documentos_identificacao_edit()));
				}
				for (DependenteForm.Sl_documentos_identificacao row : model.getSl_documentos_identificacao()) {

					TIdentificacao tidentificacao = new TIdentificacao();

					tidentificacao.setPessoaFk(tpessoa);
					tidentificacao.setTipoIdentificacao(row.getTipo_identificacao().getKey());
					tidentificacao.setNumero(row.getNumero().getKey());
					tidentificacao.setDataEmissao(
							Core.formatDate(row.getData_emissao().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tidentificacao.setDataValidade(
							Core.formatDate(row.getData_de_validade().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tidentificacao.setVitalicio(row.getVitalicio().getKey());
					tidentificacao.setEntidadeEmissora(row.getEntidade_emissora().getKey());
					if (Core.isNotNull(row.getFicheiro().getKey()))
						tidentificacao.setFicheiro(Core.saveFileNGetUuid(row.getFicheiro().getKey()));

					session.persist(tidentificacao);
				}

				transaction.commit();
				Core.setMessageSuccess();
			} else
				Core.setMessageError();
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void loadDependenteEdit(DependenteFormEdit model) {

		try {
			if (Core.isNotNull(model.getId())) {
				TPessoa tpessoa = new TPessoa().findOne(model.getId());
				if (tpessoa != null && !tpessoa.hasError()) {
					model.setNome(tpessoa.getNome());
					model.setNome_da_mae(tpessoa.getNomeMae());
					model.setNome_do_pai(tpessoa.getNomePai());
					model.setData_nascimento(tpessoa.getDataNascimento() != null
							? Core.dateToString(tpessoa.getDataNascimento(), "dd-MM-yyyy")
							: null);

					model.setSexo(tpessoa.getSexo());
					model.setNacionalidade(tpessoa.getNacionalidade());
					model.setProfissao(tpessoa.getProfissao());
					model.setHabilitacao_literaria(tpessoa.getHabilitacoes());
					model.setEstado_civil(tpessoa.getEstadoCivi());
				}

				TAgregado tagregadofilter = new TAgregado().find().andWhere("pessoaFk", "=", model.getId());
				List<TAgregado> tagregadoList = tagregadofilter.all();
				if (Core.isNotNull(tagregadoList)) {
					List<DependenteFormEdit.Sl_agregado_familiar> separatorlistDocs = new ArrayList<>();
					tagregadoList.forEach(tagregado -> {
						TPessoa tpessoaAgregado = new TPessoa().findOne(tagregado.getPessoaAgregadoFk());
						if (Core.isNotNull(tpessoaAgregado)) {
							DependenteFormEdit.Sl_agregado_familiar row = new DependenteFormEdit.Sl_agregado_familiar();

							row.setNome_completo(new Pair(tpessoaAgregado.getNome(), tpessoaAgregado.getNome()));
							row.setGrau_de_parentesco(new Pair(tagregado.getParentesco(),
									Core.findDomainDescByKey(DM_PARENTESCO, tagregado.getParentesco())));
							row.setData_de_nascimento(
									new Pair(
											tpessoaAgregado.getDataNascimento() != null
													? Core.dateToString(tpessoaAgregado.getDataNascimento(),
															"dd-MM-yyyy")
													: null,
											tpessoaAgregado.getDataNascimento() != null
													? Core.dateToString(tpessoaAgregado.getDataNascimento(),
															"dd-MM-yyyy")
													: null));
							row.setSl_agregado_familiar_id(
									new Pair(tagregado.getId().toString(), tagregado.getId().toString()));
							separatorlistDocs.add(row);

						}
					});
					model.setSl_agregado_familiar(separatorlistDocs);
				}

				TDependente tdependentefilter = new TDependente().find().andWhere("pessoaFk", "=", model.getId());
				List<TDependente> tdependenteList = tdependentefilter.all();
				if (Core.isNotNull(tdependenteList)) {
					List<DependenteFormEdit.Sl_detalhes_dependentes> separatorlistDocs = new ArrayList<>();
					tdependenteList.forEach(tdependente -> {
						DependenteFormEdit.Sl_detalhes_dependentes row = new DependenteFormEdit.Sl_detalhes_dependentes();

						row.setTipo_de_dependencia(new Pair(tdependente.getTipoDependencia(),
								Core.findDomainDescByKey(DM_TIPO_DEPENDENCIA, tdependente.getTipoDependencia())));
						row.setGrau_de_dependencia(new Pair(tdependente.getGrauDependencia(), 
										Core.findDomainDescByKey(DM_GRAU, tdependente.getGrauDependencia())));
						
						row.setAutocuidado(new Pair(tdependente.getAutocuidado(),
								Core.findDomainDescByKey(DM_AUTOCUIDADO, tdependente.getAutocuidado())));
						
						row.setOrigem_de_dependencia(
								new Pair(tdependente.getOrigemDependencia(), 
										Core.findDomainDescByKey(DM_ORIGEM, tdependente.getOrigemDependencia())));
						
						row.setInstalacao_de_dependencia(new Pair(tdependente.getInstalacaoDependencia(),
								Core.findDomainDescByKey(DM_INSTALACAO, tdependente.getInstalacaoDependencia())));
								
						row.setData_de_dependencia(new Pair(
								Core.isNotNull(tdependente.getDataDependencia())
										? Core.dateToString(tdependente.getDataDependencia(), "dd-MM-yyyy")
										: null,
								Core.isNotNull(tdependente.getDataDependencia())
										? Core.dateToString(tdependente.getDataDependencia(), "dd-MM-yyyy")
										: null));
						row.setTempo_de_dependencia(
								new Pair(tdependente.getTempoDependencia(), tdependente.getTempoDependencia()));
						row.setSl_detalhes_dependentes_id(
								new Pair(tdependente.getId().toString(), tdependente.getId().toString()));
						separatorlistDocs.add(row);
					});
					model.setSl_detalhes_dependentes(separatorlistDocs);
				}

				TContato tcontatofilter = new TContato().find().andWhere("pessoaFk", "=", model.getId());
				List<TContato> tcontatoList = tcontatofilter.all();
				if (Core.isNotNull(tcontatoList)) {

					List<DependenteFormEdit.Sl_contactos> separatorlistDocs = new ArrayList<>();
					tcontatoList.forEach(tcontato -> {
						DependenteFormEdit.Sl_contactos row = new DependenteFormEdit.Sl_contactos();

						row.setTipo_de_contacto(new Pair(tcontato.getTipoContato(), 
								Core.findDomainDescByKey(DM_CONTATO, tcontato.getTipoContato())));
								
						row.setContacto(new Pair(tcontato.getContato(), tcontato.getContato()));
						row.setSl_contactos_id(new Pair(tcontato.getId().toString(), tcontato.getId().toString()));
						separatorlistDocs.add(row);
					});
					model.setSl_contactos(separatorlistDocs);
				}

				TIdentificacao tidentificacaofilter = new TIdentificacao().find().andWhere("pessoaFk", "=",
						model.getId());
				;
				List<TIdentificacao> tidentificacaoList = tidentificacaofilter.all();
				if (Core.isNotNull(tidentificacaoList)) {
					List<DependenteFormEdit.Sl_documentos_identificacao> separatorlistDocs = new ArrayList<>();

					tidentificacaoList.forEach(tidentificacao -> {
						DependenteFormEdit.Sl_documentos_identificacao row = new DependenteFormEdit.Sl_documentos_identificacao();

						row.setTipo_identificacao(new Pair(tidentificacao.getTipoIdentificacao(),
								Core.findDomainDescByKey(DM_TIPO_IDENTIFICACO, tidentificacao.getTipoIdentificacao())));
						row.setNumero(new Pair(tidentificacao.getNumero(), tidentificacao.getNumero()));
						row.setData_emissao(new Pair(
								Core.isNotNull(tidentificacao.getDataEmissao())
										? Core.dateToString(tidentificacao.getDataEmissao(), "dd-MM-yyyy")
										: null,
								Core.isNotNull(tidentificacao.getDataEmissao())
										? Core.dateToString(tidentificacao.getDataEmissao(), "dd-MM-yyyy")
										: null));
						row.setData_de_validade(new Pair(
								Core.isNotNull(tidentificacao.getDataValidade())
										? Core.dateToString(tidentificacao.getDataValidade(), "dd-MM-yyyy")
										: null,
								Core.isNotNull(tidentificacao.getDataValidade())
										? Core.dateToString(tidentificacao.getDataValidade(), "dd-MM-yyyy")
										: null));
						row.setVitalicio(new Pair(tidentificacao.getVitalicio(),
								Core.findDomainDescByKey(DM_VITALICIO,tidentificacao.getVitalicio())));
							
						row.setEntidade_emissora(
								new Pair(tidentificacao.getEntidadeEmissora(), tidentificacao.getEntidadeEmissora()));

						row.setFicheiro(new Pair(Core.getLinkFileByUuid(tidentificacao.getFicheiro()),
								tidentificacao.getFicheiro() != null
										? Core.getFileNameByUuid(tidentificacao.getFicheiro())
										: ""));

						row.setSl_documentos_identificacao_id(
								new Pair(tidentificacao.getId().toString(), tidentificacao.getId().toString()));
						separatorlistDocs.add(row);
					});

					model.setSl_documentos_identificacao(separatorlistDocs);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveDependenteEdit(DependenteFormEdit model) {
		Session session = null;
		Transaction transaction = null;
		try {
			if (model.validate()) {
				System.out.println("NSTA LI NA EDIT");
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				transaction.begin();
				TPessoa tpessoa = new TPessoa();
				tpessoa = session.find(TPessoa.class, model.getId());

				tpessoa.setNome(model.getNome());
				tpessoa.setDataNascimento(Core.formatDate(model.getData_nascimento(), "dd-mm-yyyy", "yyyy-mm-dd"));
				tpessoa.setNomeMae(model.getNome_da_mae());
				tpessoa.setNomePai(model.getNome_do_pai());
				tpessoa.setSexo(model.getSexo());
				tpessoa.setHabilitacoes(model.getHabilitacao_literaria());
				tpessoa.setEstadoCivi(model.getEstado_civil());
				tpessoa.setNacionalidade(model.getNacionalidade());
				tpessoa.setProfissao(model.getProfissao());
				session.persist(tpessoa);
				System.out.println("PESSOA.id=" + tpessoa.getId());
				List<String> tdependenteeditList = new ArrayList<>();
				if (model.getP_sl_detalhes_dependentes_edit() != null) {
					tdependenteeditList = new ArrayList<>(Arrays.asList(model.getP_sl_detalhes_dependentes_edit()));
				}
				for (DependenteFormEdit.Sl_detalhes_dependentes row : model.getSl_detalhes_dependentes()) {
					TDependente tdependente = new TDependente();
					if(Core.isNotNull(row.getSl_detalhes_dependentes_id().getKey()))
						tdependente = session.find(TDependente.class,  Integer.valueOf(row.getSl_detalhes_dependentes_id().getKey()));
					
					if (Core.isNull(tdependente))
						tdependente.setPessoaFk(tpessoa);
					
					tdependente.setTipoDependencia(row.getTipo_de_dependencia().getKey());
					tdependente.setGrauDependencia(row.getGrau_de_dependencia().getKey());
					tdependente.setAutocuidado(row.getAutocuidado().getKey());
					tdependente.setOrigemDependencia(row.getOrigem_de_dependencia().getKey());
					tdependente.setInstalacaoDependencia(row.getInstalacao_de_dependencia().getKey());
					tdependente.setDataDependencia(
							Core.formatDate(row.getData_de_dependencia().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tdependente.setTempoDependencia(row.getTempo_de_dependencia().getKey());
					session.persist(tdependente);
				}

				List<String> tagregadoeditList = new ArrayList<>();
				if (model.getP_sl_agregado_familiar_edit() != null) {
					tagregadoeditList = new ArrayList<>(Arrays.asList(model.getP_sl_agregado_familiar_edit()));
				}
				for (DependenteFormEdit.Sl_agregado_familiar row : model.getSl_agregado_familiar()) {
					TAgregado tagregado = new TAgregado();
					if(Core.isNotNull(row.getSl_agregado_familiar_id().getKey()))
						tagregado = session.find(TAgregado.class,  Integer.valueOf(row.getSl_agregado_familiar_id().getKey()));
					
					
					TPessoa tpessoaAgregado = new TPessoa();
					
					if (Core.isNotNull(tagregado.getPessoaAgregadoFk())) 
						tpessoaAgregado = session.find(TPessoa.class, tagregado.getPessoaAgregadoFk());
					
					tpessoaAgregado.setNome(row.getNome_completo().getKey());
					tpessoaAgregado.setDataNascimento(
							Core.formatDate(row.getData_de_nascimento().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));

					session.persist(tpessoaAgregado);

					tagregado.setPessoaFk(tpessoa);
					
					tagregado.setPessoaAgregadoFk(tpessoaAgregado.getId());
					
					tagregado.setParentesco(row.getGrau_de_parentesco().getKey());

					session.persist(tagregado);
				}

				List<String> tcontatoeditList = new ArrayList<>();
				if (model.getP_sl_contactos_edit() != null) {
					tcontatoeditList = new ArrayList<>(Arrays.asList(model.getP_sl_agregado_familiar_edit()));
				}
				for (DependenteFormEdit.Sl_contactos row : model.getSl_contactos()) {
					TContato tcontato = new TContato();
					if(Core.isNotNull(row.getSl_contactos_id().getKey()))
						tcontato = session.find(TContato.class,  Integer.valueOf(row.getSl_contactos_id().getKey()));
					
					tcontato.setPessoaFk(tpessoa);

					tcontato.setTipoContato(row.getTipo_de_contacto().getKey());
					tcontato.setContato(row.getContacto().getKey());
					session.persist(tcontato);
				}

				List<String> tidentificacaoeditList = new ArrayList<>();
				if (model.getP_sl_documentos_identificacao_edit() != null) {
					tidentificacaoeditList = new ArrayList<>(
							Arrays.asList(model.getP_sl_documentos_identificacao_edit()));
				}
				for (DependenteFormEdit.Sl_documentos_identificacao row : model.getSl_documentos_identificacao()) {

					TIdentificacao tidentificacao = new TIdentificacao();
					if(Core.isNotNull(row.getSl_documentos_identificacao_id().getKey()))
						tidentificacao = session.find(TIdentificacao.class,  Integer.valueOf(row.getSl_documentos_identificacao_id().getKey()));

					tidentificacao.setPessoaFk(tpessoa);
					tidentificacao.setTipoIdentificacao(row.getTipo_identificacao().getKey());
					tidentificacao.setNumero(row.getNumero().getKey());
					tidentificacao.setDataEmissao(
							Core.formatDate(row.getData_emissao().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tidentificacao.setDataValidade(
							Core.formatDate(row.getData_de_validade().getKey(), "dd-mm-yyyy", "yyyy-mm-dd"));
					tidentificacao.setVitalicio(row.getVitalicio().getKey());
					tidentificacao.setEntidadeEmissora(row.getEntidade_emissora().getKey());
					/*if (Core.isNotNullOrZero(row.getFicheiro().getKey()))
						tidentificacao.setFicheiro(Core.saveFileNGetUuid(row.getFicheiro().getKey()));*/

					session.persist(tidentificacao);
				}

				transaction.commit();
				Core.setMessageSuccess();
			} else
				Core.setMessageError();
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

}
