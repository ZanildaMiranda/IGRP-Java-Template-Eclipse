<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/quickbuttonbox/quickbuttonbox.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-cf68f4e0"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/header"><section class="content-header gen-container-item " gen-class="" item-name="header"><h2><xsl:value-of select="rows/content/header/fields/header_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder boxed gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder  pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-c7f4aa21"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/total_proc_finished"><div class="quick-button-box gen-container-item " gen-class="" item-name="total_proc_finished"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/total_proc_finished/fields"/><a href="{rows/content/total_proc_finished/fields/total_proc_finished_url/value}" target="modal" class="quick-button metro {rows/content/total_proc_finished/fields/total_proc_finished_bg/value}"><i class="fa {rows/content/total_proc_finished/fields/total_proc_finished_icn/value}" aria-hidden="true"/><p><xsl:value-of select="rows/content/total_proc_finished/fields/total_proc_finished_tit/value"/></p><span class="badge"><xsl:value-of select="rows/content/total_proc_finished/fields/total_proc_finished_val/value"/></span></a></div></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/total_proc_em_execucao"><div class="quick-button-box gen-container-item " gen-class="" item-name="total_proc_em_execucao"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/total_proc_em_execucao/fields"/><a href="{rows/content/total_proc_em_execucao/fields/total_proc_em_execucao_url/value}" target="modal" class="quick-button metro {rows/content/total_proc_em_execucao/fields/total_proc_em_execucao_bg/value}"><i class="fa {rows/content/total_proc_em_execucao/fields/total_proc_em_execucao_icn/value}" aria-hidden="true"/><p><xsl:value-of select="rows/content/total_proc_em_execucao/fields/total_proc_em_execucao_tit/value"/></p><span class="badge"><xsl:value-of select="rows/content/total_proc_em_execucao/fields/total_proc_em_execucao_val/value"/></span></a></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=1531222833876"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=1531222833876"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=1531222833876"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=1531222833876"/></xsl:stylesheet>