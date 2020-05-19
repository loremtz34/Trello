package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.TrelloFormValidationPage;

public class TrelloFormValidationSteps {

	TrelloFormValidationPage trelloFormValidationpage;
	
	public void diligencio_datos_tabla(List<List<String>> data, int id) {
		trelloFormValidationpage.nombre_completo(data.get(id).get(0).trim());
		trelloFormValidationpage.crear_contrasena(data.get(id).get(1).trim());
		trelloFormValidationpage.registrarse();
		trelloFormValidationpage.verificaHome();
	}
}

