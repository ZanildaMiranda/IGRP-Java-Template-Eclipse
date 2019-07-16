<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-4152dbd0"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/nif"><div class="form-group col-sm-3   gen-fields-holder" item-name="nif" item-type="number"><label for="{rows/content/form_1/fields/nif/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nif/label"/></span></label><input type="number" value="{rows/content/form_1/fields/nif/value}" min="" max="" class="form-control  " id="{rows/content/form_1/fields/nif/@name}" name="{rows/content/form_1/fields/nif/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nif"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/nome_da_firma"><div class="form-group col-sm-3   gen-fields-holder" item-name="nome_da_firma" item-type="text"><label for="{rows/content/form_1/fields/nome_da_firma/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome_da_firma/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome_da_firma/value}" class="form-control  " id="{rows/content/form_1/fields/nome_da_firma/@name}" name="{rows/content/form_1/fields/nome_da_firma/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome_da_firma"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/table_1"><div class="box box-table-contents gen-container-item " gen-class="" item-name="table_1"><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"></div></div><div class="table-box"><div class="table-box-inner"><table id="table_1" class="table table-striped  igrp-data-table  " exports=""><thead><tr><xsl:if test="rows/content/table_1/fields/nif_tab"><th align="left" show-label="true" class="number gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/nif_tab/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/nome_da_firma_tab"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/nome_da_firma_tab/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/matriculan_reg_comercial"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/matriculan_reg_comercial/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/data_registo_data_reg_comercial"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/data_registo_data_reg_comercial/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/data_inicio_atividade"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/data_inicio_atividade/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/natureza_juridica"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/natureza_juridica/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/natureza_juridica_desc"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/natureza_juridica_desc/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/tipo_entidade"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/tipo_entidade/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/tipo_entidade_desc"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/tipo_entidade_desc/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/estado"><th align="left" show-label="true" class="text gen-fields-holder"><span><xsl:value-of select="rows/content/table_1/fields/estado/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/table/context-menu/item"><th class="igrp-table-ctx-th"/></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/table_1/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><xsl:if test="nif_tab"><td align="left" data-order="{nif_tab}" data-row="{position()}" data-title="{../../../fields/nif_tab/label}" class="number" item-name="nif_tab"><span class="lookup-parser"><xsl:value-of select="nif_tab"/></span></td></xsl:if><xsl:if test="nome_da_firma_tab"><td align="left" data-order="{nome_da_firma_tab}" data-row="{position()}" data-title="{../../../fields/nome_da_firma_tab/label}" class="text" item-name="nome_da_firma_tab"><span class="lookup-parser"><xsl:value-of select="nome_da_firma_tab"/></span></td></xsl:if><xsl:if test="matriculan_reg_comercial"><td align="left" data-order="{matriculan_reg_comercial}" data-row="{position()}" data-title="{../../../fields/matriculan_reg_comercial/label}" class="text" item-name="matriculan_reg_comercial"><span class=""><xsl:value-of select="matriculan_reg_comercial"/></span></td></xsl:if><xsl:if test="data_registo_data_reg_comercial"><td align="left" data-order="{data_registo_data_reg_comercial}" data-row="{position()}" data-title="{../../../fields/data_registo_data_reg_comercial/label}" class="text" item-name="data_registo_data_reg_comercial"><span class=""><xsl:value-of select="data_registo_data_reg_comercial"/></span></td></xsl:if><xsl:if test="data_inicio_atividade"><td align="left" data-order="{data_inicio_atividade}" data-row="{position()}" data-title="{../../../fields/data_inicio_atividade/label}" class="text" item-name="data_inicio_atividade"><span class=""><xsl:value-of select="data_inicio_atividade"/></span></td></xsl:if><xsl:if test="natureza_juridica"><td align="left" data-order="{natureza_juridica}" data-row="{position()}" data-title="{../../../fields/natureza_juridica/label}" class="text" item-name="natureza_juridica"><span class=""><xsl:value-of select="natureza_juridica"/></span></td></xsl:if><xsl:if test="natureza_juridica_desc"><td align="left" data-order="{natureza_juridica_desc}" data-row="{position()}" data-title="{../../../fields/natureza_juridica_desc/label}" class="text" item-name="natureza_juridica_desc"><span class=""><xsl:value-of select="natureza_juridica_desc"/></span></td></xsl:if><xsl:if test="tipo_entidade"><td align="left" data-order="{tipo_entidade}" data-row="{position()}" data-title="{../../../fields/tipo_entidade/label}" class="text" item-name="tipo_entidade"><span class=""><xsl:value-of select="tipo_entidade"/></span></td></xsl:if><xsl:if test="tipo_entidade_desc"><td align="left" data-order="{tipo_entidade_desc}" data-row="{position()}" data-title="{../../../fields/tipo_entidade_desc/label}" class="text" item-name="tipo_entidade_desc"><span class=""><xsl:value-of select="tipo_entidade_desc"/></span></td></xsl:if><xsl:if test="estado"><td align="left" data-order="{estado}" data-row="{position()}" data-title="{../../../fields/estado/label}" class="text" item-name="estado"><span class=""><xsl:value-of select="estado"/></span></td></xsl:if><xsl:if test="//rows/content/table_1/table/context-menu/item"><td class="igrp-table-ctx-td"><xsl:apply-templates select="../../context-menu" mode="table-context-inline"><xsl:with-param name="row-params" select="context-menu"/></xsl:apply-templates></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script src="{$path}/core/igrp/IGRP.rules.class.js"/><script>
$.IGRP.rules.set({"p_nif":[{"name":"disable_nome","events":"load,keyup","isTable":false,"conditions":{"rules":[{"condition":"notnull","value":"","value2":"","patern":"","patern_custom":"","opposite":"1"}],"actions":[{"action":"disabled","targets":"nome_da_firma","procedure":"","request_fields":"","msg_type":"info","msg":""}]}},{"name":"just_number","events":"blur","isTable":false,"conditions":{"rules":[{"condition":"notcontains","value":"[0-9]+$","value2":"","patern":"","patern_custom":"","opposite":""}],"actions":[{"action":"cleanValue","targets":"nif","procedure":"","request_fields":"","msg_type":"","msg":""},{"action":"message","targets":"","procedure":"","request_fields":"","msg_type":"warning","msg":"Campo Nif só aceita números"}]}}],"p_nome_da_firma":[{"name":"Disable_nif","events":"load,keyup","isTable":false,"conditions":{"rules":[{"condition":"notnull","value":"","value2":"","patern":"","patern_custom":"","opposite":"1"}],"actions":[{"action":"disabled","targets":"nif","procedure":"","request_fields":"","msg_type":"","msg":""}]}}]},'actionsList');</script></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=15"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=15"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=15"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=15"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=15"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=15"/></xsl:stylesheet>