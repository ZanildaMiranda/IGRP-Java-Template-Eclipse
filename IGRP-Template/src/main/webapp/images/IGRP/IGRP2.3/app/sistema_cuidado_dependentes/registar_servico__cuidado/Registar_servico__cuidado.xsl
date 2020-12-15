<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-823cc389"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-80941504"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/tipo"><div class="form-group col-sm-6   gen-fields-holder" item-name="tipo" item-type="text" required="required"><label for="{rows/content/form_1/fields/tipo/@name}"><span><xsl:value-of select="rows/content/form_1/fields/tipo/label"/></span></label><input type="text" value="{rows/content/form_1/fields/tipo/value}" class="form-control  " id="{rows/content/form_1/fields/tipo/@name}" name="{rows/content/form_1/fields/tipo/@name}" required="required" maxlength="250" placeholder="{rows/content/form_1/fields/tipo/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/tipo"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/descriccao"><div class="form-group col-sm-6   gen-fields-holder" item-name="descriccao" item-type="text" required="required"><label for="{rows/content/form_1/fields/descriccao/@name}"><span><xsl:value-of select="rows/content/form_1/fields/descriccao/label"/></span></label><input type="text" value="{rows/content/form_1/fields/descriccao/value}" class="form-control  " id="{rows/content/form_1/fields/descriccao/@name}" name="{rows/content/form_1/fields/descriccao/@name}" required="required" maxlength="250" placeholder="{rows/content/form_1/fields/descriccao/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/descriccao"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/unidade_cuidado"><div class="form-group col-sm-6  gen-fields-holder" item-name="unidade_cuidado" item-type="lookup" required="required"><label for="{rows/content/form_1/fields/unidade_cuidado/@name}"><xsl:value-of select="rows/content/form_1/fields/unidade_cuidado/label"/></label><div class="input-group"><input type="text" value="{rows/content/form_1/fields/unidade_cuidado/value}" class="form-control gen-lookup " id="form_1_unidade_cuidado" name="{rows/content/form_1/fields/unidade_cuidado/@name}" required="required" readonly="readonly" maxlength="250"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/unidade_cuidado"/></xsl:call-template></input><xsl:call-template name="lookup-tool"><xsl:with-param name="page" select="rows/page"/><xsl:with-param name="ad_hoc" select="'1'"/><xsl:with-param name="action" select="'LOOKUP'"/><xsl:with-param name="name" select="rows/content/form_1/fields/unidade_cuidado/@name"/><xsl:with-param name="js_lookup" select="rows/content/form_1/fields/unidade_cuidado/lookup"/><xsl:with-param name="input-id" select="'form_1_unidade_cuidado'"/><xsl:with-param name="btnClass" select="'primary'"/></xsl:call-template></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/dependente"><div class="form-group col-sm-6   gen-fields-holder" item-name="dependente" item-type="text" required="required"><label for="{rows/content/form_1/fields/dependente/@name}"><span><xsl:value-of select="rows/content/form_1/fields/dependente/label"/></span></label><input type="text" value="{rows/content/form_1/fields/dependente/value}" class="form-control  " id="{rows/content/form_1/fields/dependente/@name}" name="{rows/content/form_1/fields/dependente/@name}" required="required" maxlength="250" placeholder="{rows/content/form_1/fields/dependente/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/dependente"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/lookup/igrp.lookup.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=27"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=27"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=27"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=27"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=27"/></xsl:stylesheet>
