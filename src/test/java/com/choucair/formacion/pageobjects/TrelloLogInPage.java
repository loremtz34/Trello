package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/login")
public class TrelloLogInPage extends PageObject{

	//Campo nombre
	@FindBy (id="user")
	public WebElementFacade txtcorreo;
	
	//Campo password
	@FindBy (id="password")
	public WebElementFacade txtpass;
	
	//Boton login
	@FindBy (id="login")
	public WebElementFacade btnlogin;
	
	//Otro Login (?)
	@FindBy (xpath = "//*[@id='login-submit']/span/span")
	public WebElementFacade btnlogin2;
	
	//bienvenido a trello
	@FindBy (xpath = "//*[@id='content']/div/div[1]/div[1]/div[1]/span")
	public WebElementFacade lblhome;
	
	
	public void ingresoDatos(String strusuario, String strpass) {
		txtcorreo.sendKeys(strusuario);
		btnlogin.click();
		txtpass.click();
		txtpass.sendKeys(strpass);
		btnlogin2.click();
		
	}
	
}
