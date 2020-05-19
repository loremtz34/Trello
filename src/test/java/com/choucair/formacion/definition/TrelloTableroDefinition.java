package com.choucair.formacion.definition;

import com.choucair.formacion.steps.TrelloTableroSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TrelloTableroDefinition {
	
	@Steps
	TrelloTableroSteps trelloTableroSteps;

	@Given("^Inicio sesion con correo \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
	public void inicio_sesion_con_correo_y_contraseña(String Usuario, String Clave){
		trelloTableroSteps.login_trello(Usuario, Clave);
	}

	@When("^Creo un tablero nuevo con nombre \"([^\"]*)\"$")
	public void creo_un_tablero_nuevo_con_nombre(String strTablero)  {
	   trelloTableroSteps.ingresar_datos_tablero(strTablero);
	}
	@Then("^Verifico la creacion exitosa del tablero \"([^\"]*)\"$")
	public void verifico_la_creacion_exitosa_del_tablero(String strTablero)  {
		trelloTableroSteps.verificar_nombre_tablero(strTablero);
	}
}
