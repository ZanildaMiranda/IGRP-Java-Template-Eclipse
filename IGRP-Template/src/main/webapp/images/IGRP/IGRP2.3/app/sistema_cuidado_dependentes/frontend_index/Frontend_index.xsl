<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-7bba8358"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-da365e15"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/tbl_unidade__cuidado"><div class="box box-table-contents gen-container-item " gen-class="" item-name="tbl_unidade__cuidado"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/tbl_unidade__cuidado/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"></div></div><div class="table-box"><div class="table-box-inner"><table id="tbl_unidade__cuidado" class="table table-striped  igrp-data-table IGRP_contextmenu " exports=""><thead><tr><xsl:if test="rows/content/tbl_unidade__cuidado/fields/codigo"><th td-name="codigo" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_unidade__cuidado/fields/codigo/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_unidade__cuidado/fields/nome"><th td-name="nome" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_unidade__cuidado/fields/nome/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_unidade__cuidado/fields/email"><th td-name="email" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tbl_unidade__cuidado/fields/email/label"/></span></th></xsl:if><xsl:if test="rows/content/tbl_unidade__cuidado/table/context-menu/item"><th class="igrp-table-ctx-th"/></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/tbl_unidade__cuidado/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><input type="hidden" name="p_id_unidade_cuidado_tbl_fk" value="{id_unidade_cuidado_tbl}"/><input type="hidden" name="p_id_unidade_cuidado_tbl_fk_desc" value="{id_unidade_cuidado_tbl_desc}"/><xsl:if test="codigo"><td align="left" data-order="{codigo}" data-row="{position()}" data-title="{../../../fields/codigo/label}" class="text" item-name="codigo"><span class=""><xsl:value-of select="codigo"/></span></td></xsl:if><xsl:if test="nome"><td align="left" data-order="{nome}" data-row="{position()}" data-title="{../../../fields/nome/label}" class="text" item-name="nome"><span class=""><xsl:value-of select="nome"/></span></td></xsl:if><xsl:if test="email"><td align="left" data-order="{email}" data-row="{position()}" data-title="{../../../fields/email/label}" class="text" item-name="email"><span class=""><xsl:value-of select="email"/></span></td></xsl:if><xsl:if test="//rows/content/tbl_unidade__cuidado/table/context-menu/item"><td class="igrp-table-ctx-td"><xsl:apply-templates select="../../context-menu" mode="table-context-inline"><xsl:with-param name="row-params" select="context-menu"/><xsl:with-param name="type" select="'inl'"/></xsl:apply-templates></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/bootstrap-contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=12"/></xsl:stylesheet>