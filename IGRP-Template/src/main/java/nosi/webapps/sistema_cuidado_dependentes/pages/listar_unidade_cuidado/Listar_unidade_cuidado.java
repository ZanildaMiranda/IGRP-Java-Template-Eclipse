package nosi.webapps.sistema_cuidado_dependentes.pages.listar_unidade_cuidado;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Listar_unidade_cuidado extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String unidade_cuidado;
		private String localizacao;
		private String contacto;
		private Integer id_unidade_cuidado_tbl;
		public void setUnidade_cuidado(String unidade_cuidado){
			this.unidade_cuidado = unidade_cuidado;
		}
		public String getUnidade_cuidado(){
			return this.unidade_cuidado;
		}

		public void setLocalizacao(String localizacao){
			this.localizacao = localizacao;
		}
		public String getLocalizacao(){
			return this.localizacao;
		}

		public void setContacto(String contacto){
			this.contacto = contacto;
		}
		public String getContacto(){
			return this.contacto;
		}

		public void setId_unidade_cuidado_tbl(Integer id_unidade_cuidado_tbl){
			this.id_unidade_cuidado_tbl = id_unidade_cuidado_tbl;
		}
		public Integer getId_unidade_cuidado_tbl(){
			return this.id_unidade_cuidado_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
