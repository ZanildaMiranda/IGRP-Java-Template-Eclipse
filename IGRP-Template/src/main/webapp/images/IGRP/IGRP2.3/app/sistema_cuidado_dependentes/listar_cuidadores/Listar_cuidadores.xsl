<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-e4036b3b"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-d40558ae"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/tbl_cuidadores"><div class="box box-table-contents gen-container-item " gen-class="" item-name="tbl_cuidadores"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/tbl_cuidadores/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"></div></div><div class="table-box"><div class="table-box-inner"><table id="tbl_cuidadores" class="table table-striped  igrp-data-table IGRP_contextmenu " exports=""><thead><tr><xsl:if test="rows/content/tbl_cuidadores/fields/tbl_cuidadores_img_1"><th td-name="tbl_cuidadores_img_1" align="left" show-label="true" class="img  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_cuidadores/fields/tbl_cuidadores_img_1/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_cuidadores/fields/text_1"><th td-name="text_1" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_cuidadores/fields/text_1/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_cuidadores/fields/email"><th td-name="email" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_cuidadores/fields/email/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_cuidadores/fields/unidade_cuidado"><th td-name="unidade_cuidado" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_cuidadores/fields/unidade_cuidado/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_cuidadores/table/context-menu/item"><th class="igrp-table-ctx-th"/></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/tbl_cuidadores/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><input type="hidden" name="p_id_cuidador_tbl_fk" value="{id_cuidador_tbl}"/><input type="hidden" name="p_id_cuidador_tbl_fk_desc" value="{id_cuidador_tbl_desc}"/><xsl:if test="tbl_cuidadores_img_1"><td align="left" data-row="{position()}" data-title="{../../fields/tbl_cuidadores_img_1/label}" class="img" item-name="tbl_cuidadores_img_1"><img class="table-img   " src="{tbl_cuidadores_img_1}"/></td></xsl:if><xsl:if test="text_1"><td align="left" data-order="{text_1}" data-row="{position()}" data-title="{../../../fields/text_1/label}" class="text" item-name="text_1"><span class=""><xsl:value-of select="text_1"/></span></td></xsl:if><xsl:if test="email"><td align="left" data-order="{email}" data-row="{position()}" data-title="{../../../fields/email/label}" class="text" item-name="email"><span class=""><xsl:value-of select="email"/></span></td></xsl:if><xsl:if test="unidade_cuidado"><td align="left" data-order="{unidade_cuidado}" data-row="{position()}" data-title="{../../../fields/unidade_cuidado/label}" class="text" item-name="unidade_cuidado"><span class=""><xsl:value-of select="unidade_cuidado"/></span></td></xsl:if><xsl:if test="//rows/content/tbl_cuidadores/table/context-menu/item"><td class="igrp-table-ctx-td"><xsl:apply-templates select="../../context-menu" mode="table-context-inline"><xsl:with-param name="row-params" select="context-menu"/><xsl:with-param name="type" select="'inl'"/></xsl:apply-templates></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/bootstrap-contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=4"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=4"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=4"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=4"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=4"/></xsl:stylesheet>
