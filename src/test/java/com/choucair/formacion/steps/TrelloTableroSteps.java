package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.TrelloLogInPage;
import com.choucair.formacion.pageobjects.TrelloTableroPage;

public class TrelloTableroSteps {
	
	TrelloLogInPage trelloLogInPage;
	
	TrelloTableroPage trelloTableroPage;
	
	public void login_trello(String strUsuario, String strPass) {
		//abrir url
		trelloLogInPage.open();
		//ingresar usuario
		//ingresar contraseña
		//click boton ingresar
		trelloLogInPage.ingresoDatos(strUsuario, strPass);
	}
	
	public void ingresar_datos_tablero(String strTablero) {
		//crear tablero
		//ingresar nombre tablero
		//undir boton
		trelloTableroPage.crear_tablero(strTablero);
	}
	
	public void verificar_nombre_tablero(String strTablero) {
		//Verificar nombre de tablero
		trelloTableroPage.verificar_tablero(strTablero);
	}
}
