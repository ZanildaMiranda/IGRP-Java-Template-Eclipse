<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-10959b9a"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/box_1"><div class="box igrp-box-holder gen-container-item " gen-class="" item-name="box_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/box_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body" gen-preserve-content="true"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/box_1/fields"/><div><div class="row " id="row-fc55cfe2"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/codigo"><div class="form-group col-sm-6   gen-fields-holder" item-name="codigo" item-type="text"><label for="{rows/content/form_1/fields/codigo/@name}"><span><xsl:value-of select="rows/content/form_1/fields/codigo/label"/></span></label><input type="text" value="{rows/content/form_1/fields/codigo/value}" class="form-control  " id="{rows/content/form_1/fields/codigo/@name}" name="{rows/content/form_1/fields/codigo/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/codigo/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/codigo"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/local"><div class="form-group col-sm-6   gen-fields-holder" item-name="local" item-type="text"><label for="{rows/content/form_1/fields/local/@name}"><span><xsl:value-of select="rows/content/form_1/fields/local/label"/></span></label><input type="text" value="{rows/content/form_1/fields/local/value}" class="form-control  " id="{rows/content/form_1/fields/local/@name}" name="{rows/content/form_1/fields/local/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/local/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/local"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/nome"><div class="form-group col-sm-6   gen-fields-holder" item-name="nome" item-type="text"><label for="{rows/content/form_1/fields/nome/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome/value}" class="form-control  " id="{rows/content/form_1/fields/nome/@name}" name="{rows/content/form_1/fields/nome/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/nome/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/telefone"><div class="form-group col-sm-3   gen-fields-holder" item-name="telefone" item-type="text"><label for="{rows/content/form_1/fields/telefone/@name}"><span><xsl:value-of select="rows/content/form_1/fields/telefone/label"/></span></label><input type="text" value="{rows/content/form_1/fields/telefone/value}" class="form-control  " id="{rows/content/form_1/fields/telefone/@name}" name="{rows/content/form_1/fields/telefone/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/telefone/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/telefone"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/nif"><div class="form-group col-sm-6   gen-fields-holder" item-name="nif" item-type="text"><label for="{rows/content/form_1/fields/nif/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nif/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nif/value}" class="form-control  " id="{rows/content/form_1/fields/nif/@name}" name="{rows/content/form_1/fields/nif/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/nif/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nif"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/form_1_email_1"><div class="form-group col-sm-6   gen-fields-holder" item-name="form_1_email_1" item-type="text"><label for="{rows/content/form_1/fields/form_1_email_1/@name}"><span><xsl:value-of select="rows/content/form_1/fields/form_1_email_1/label"/></span></label><input type="text" value="{rows/content/form_1/fields/form_1_email_1/value}" class="form-control  " id="{rows/content/form_1/fields/form_1_email_1/@name}" name="{rows/content/form_1/fields/form_1_email_1/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/form_1_email_1/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/form_1_email_1"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/unidade_pertencente"><div class="form-group col-sm-6   gen-fields-holder" item-name="unidade_pertencente" item-type="text"><label for="{rows/content/form_1/fields/unidade_pertencente/@name}"><span><xsl:value-of select="rows/content/form_1/fields/unidade_pertencente/label"/></span></label><input type="text" value="{rows/content/form_1/fields/unidade_pertencente/value}" class="form-control  " id="{rows/content/form_1/fields/unidade_pertencente/@name}" name="{rows/content/form_1/fields/unidade_pertencente/@name}" disabled="disabled" maxlength="250" placeholder="{rows/content/form_1/fields/unidade_pertencente/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/unidade_pertencente"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/toolsbar"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar"><div class="btns-holder btn-group-lg pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=12"/></xsl:stylesheet>