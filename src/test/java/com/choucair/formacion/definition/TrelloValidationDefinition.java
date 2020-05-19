package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.TrelloFormValidationSteps;
import com.choucair.formacion.steps.TrelloValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TrelloValidationDefinition {

	@Steps
	TrelloValidationSteps trelloValidationSteps;
	
	@Steps	
	TrelloFormValidationSteps trelloFormValidationSteps;
	
	@Given("^Registro en trello con usuario  \"([^\"]*)\"$")
	public void registro_en_trello_con_usuario(String correo)  {
	    trelloValidationSteps.registro_trello(correo);
	}

	@When("^Diligencio formulario de registro$")
	public void diligencio_formulario_de_registro(DataTable dtDatosForm) {
	   List<List<String>> data = dtDatosForm.raw();
	   
	   for(int i=1; i<data.size();i++) {
		   trelloFormValidationSteps.diligencio_datos_tabla(data,i);
	   }
		
	}


	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
	    
	}
}
