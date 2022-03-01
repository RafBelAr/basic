  
Insert into MENUITEMS (COD_ITEM,TXT_IMAGEPATH,ES_INTERNA,TXT_LANGUAGE,TXT_PATH,COD_PARENTID,TXT_SECURITY_EXPRESSION,TXT_TITLE,NUM_WEIGHT,ES_DIALOGO) values ('1',null,'1','va',null,'0',null,'Administració','30','0');
Insert into MENUITEMS (COD_ITEM,TXT_IMAGEPATH,ES_INTERNA,TXT_LANGUAGE,TXT_PATH,COD_PARENTID,TXT_SECURITY_EXPRESSION,TXT_TITLE,NUM_WEIGHT,ES_DIALOGO) values ('2','fa-button-menu fa-cog','1','va','/view/pantallas/secured/uoConfiguracion.xhtml','1',null,'Unitats','40','0');
Insert into MENUITEMS (COD_ITEM,TXT_IMAGEPATH,ES_INTERNA,TXT_LANGUAGE,TXT_PATH,COD_PARENTID,TXT_SECURITY_EXPRESSION,TXT_TITLE,NUM_WEIGHT,ES_DIALOGO) values ('3','fa-button-menu fa-list-alt','1','va','/view/pantallas/secured/listasGestion.xhtml','1',null,'Llistes destí','50','0');
Insert into MENUITEMS (COD_ITEM,TXT_IMAGEPATH,ES_INTERNA,TXT_LANGUAGE,TXT_PATH,COD_PARENTID,TXT_SECURITY_EXPRESSION,TXT_TITLE,NUM_WEIGHT,ES_DIALOGO) values ('4','fa-button-menu fa-car','1','es','/view/pantallas/secured/coches.xhtml','0',null,'Coches',null,'0');
Insert into MENUITEMS (COD_ITEM,TXT_IMAGEPATH,ES_INTERNA,TXT_LANGUAGE,TXT_PATH,COD_PARENTID,TXT_SECURITY_EXPRESSION,TXT_TITLE,NUM_WEIGHT,ES_DIALOGO) values ('5','fa-button-menu fa-car','1','va','/view/pantallas/secured/coches.xhtml','0',null,'Cotxes',null,'0');

COMMIT;