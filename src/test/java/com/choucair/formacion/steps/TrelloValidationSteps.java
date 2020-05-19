package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.TrelloSignInPage;

import net.thucydides.core.annotations.Step;

public class TrelloValidationSteps {
	
	TrelloSignInPage trelloLogInPage;
	
	@Step
	public void registro_trello(String strcorreo) {
	//abrir navegador con la URL de trello
	trelloLogInPage.open();
	//ingresar usuario
	//click en el boton Continuar
	trelloLogInPage.IngresarDatos(strcorreo);
	//ingresar usuario nombre y contraseña
	//click en boton Registrarse
	}
}
