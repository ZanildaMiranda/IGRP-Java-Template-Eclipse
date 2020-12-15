package nosi.webapps.sistema_cuidado_dependentes.pages.lookupservicocuidado;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class LookupServicoCuidado extends Model{		

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
		private String fwl_unidade_cuidado;
		private String fwl_localizacao;
		private String fwl_contacto;
		private Integer fwl_id_unidade_cuidado;
		private String fwl_codigo;
		public void setFwl_unidade_cuidado(String fwl_unidade_cuidado){
			this.fwl_unidade_cuidado = fwl_unidade_cuidado;
		}
		public String getFwl_unidade_cuidado(){
			return this.fwl_unidade_cuidado;
		}

		public void setFwl_localizacao(String fwl_localizacao){
			this.fwl_localizacao = fwl_localizacao;
		}
		public String getFwl_localizacao(){
			return this.fwl_localizacao;
		}

		public void setFwl_contacto(String fwl_contacto){
			this.fwl_contacto = fwl_contacto;
		}
		public String getFwl_contacto(){
			return this.fwl_contacto;
		}

		public void setFwl_id_unidade_cuidado(Integer fwl_id_unidade_cuidado){
			this.fwl_id_unidade_cuidado = fwl_id_unidade_cuidado;
		}
		public Integer getFwl_id_unidade_cuidado(){
			return this.fwl_id_unidade_cuidado;
		}

		public void setFwl_codigo(String fwl_codigo){
			this.fwl_codigo = fwl_codigo;
		}
		public String getFwl_codigo(){
			return this.fwl_codigo;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
