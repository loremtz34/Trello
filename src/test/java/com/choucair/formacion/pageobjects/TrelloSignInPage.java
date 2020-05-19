package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://trello.com/es/signup")
public class TrelloSignInPage extends PageObject{
	
	//Campo correo usuario
	@FindBy (id="email")
	public WebElementFacade txtemail;
	
	//boton Continuar
	@FindBy (id="signup-submit")
	public WebElementFacade btncontinuar;
	
	public void IngresarDatos(String stremail) {
		txtemail.sendKeys(stremail);
		btncontinuar.click();
	}
}
