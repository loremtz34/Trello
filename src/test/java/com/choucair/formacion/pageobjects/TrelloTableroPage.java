package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.containsString; 

public class TrelloTableroPage extends PageObject{
	
	//Boton Nuevo tablero
	@FindBy (xpath = "//*[@id='content']/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/ul/li[2]/div")
	public WebElementFacade btnNuevoTablero;
	
	//titulo tablero a ingresar
	@FindBy (xpath = "//*[@id='chrome-container']/div[3]/div/div/div/form/div[1]/div/div[1]/input")
	public WebElementFacade txttablero;
	
	//boton crear tablero
	@FindBy (xpath = "//*[@id='chrome-container']/div[3]/div/div/div/form/div[2]/button")
	public WebElementFacade btncrear;
	
	//Titulo de tablero creado
	@FindBy (xpath = "//*[@id='content']/div/div[1]/div[1]/div[1]/span")
	public WebElementFacade txtTituloTablero;
	
	public void crear_tablero(String strTablero) {
		btnNuevoTablero.click();
		txttablero.click();
		txttablero.sendKeys(strTablero);
		btncrear.click();
	}
	
	public void verificar_tablero(String strTablero) {
		String label = strTablero;
		String titulo = txtTituloTablero.getText();
		assertThat(titulo, containsString(label));
	}
}
