package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrelloFormValidationPage extends PageObject{
	
	//Nombre completo
	@FindBy (id="displayName")
	public WebElementFacade txtname;
	
	//Crear contraseña
	@FindBy (id="password")
	public WebElementFacade txtpassword;
	
	//boton Registrarse
	@FindBy (xpath= "//*[@id='signup-submit']/span/span")
	public WebElementFacade btnregistrarse;
	
	//Bienvenido a Trello
	@FindBy (xpath="//*[@id='4e13b651-82b9-480b-9ccc-06eaf0bd4115']/section/h1/span")
	public WebElementFacade lblBienvenido;
	
	public void nombre_completo(String datoPrueba) {
		txtname.click();
		txtname.clear();
		txtname.sendKeys(datoPrueba);
	}
	
	public void crear_contrasena(String datoPrueba){
		txtpassword.click();
		txtpassword.clear();
		txtpassword.sendKeys(datoPrueba);
	}
	
	public void registrarse() {
		btnregistrarse.click();
	}
	
	public void verificaHome() {
		String labelv = "¡Bienvenido a Trello!";
		String strMensaje = lblBienvenido.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
