package nosi.webapps.cuidado_dos_dependentes.pages.dependenteslista;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class DependentesLista extends Model{		

	@RParam(rParamName = "p_flt_nome")
	private String flt_nome;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setFlt_nome(String flt_nome){
		this.flt_nome = flt_nome;
	}
	public String getFlt_nome(){
		return this.flt_nome;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String nome;
		private String data_de_nascimento;
		private String sexo;
		private String estado_civil;
		private String _n_de_agregado_familiar;
		private Integer id;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setData_de_nascimento(String data_de_nascimento){
			this.data_de_nascimento = data_de_nascimento;
		}
		public String getData_de_nascimento(){
			return this.data_de_nascimento;
		}

		public void setSexo(String sexo){
			this.sexo = sexo;
		}
		public String getSexo(){
			return this.sexo;
		}

		public void setEstado_civil(String estado_civil){
			this.estado_civil = estado_civil;
		}
		public String getEstado_civil(){
			return this.estado_civil;
		}

		public void set_n_de_agregado_familiar(String _n_de_agregado_familiar){
			this._n_de_agregado_familiar = _n_de_agregado_familiar;
		}
		public String get_n_de_agregado_familiar(){
			return this._n_de_agregado_familiar;
		}

		public void setId(Integer id){
			this.id = id;
		}
		public Integer getId(){
			return this.id;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
