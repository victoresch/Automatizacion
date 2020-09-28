package EmpleosChoucair.stepdefinitions;

import org.openqa.selenium.WebDriver;

import EmpleosChoucair.tasks.abrirNavegador;
import EmpleosChoucair.tasks.aplicarAUnTrabajo;
import EmpleosChoucair.tasks.buscarUn;
import EmpleosChoucair.tasks.dirigirseA;
import EmpleosChoucair.userinterfaces.paginaChoucair;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class EmpleoChoucairStepDefinitions {

	@Managed (driver="chrome")
	private WebDriver isBrowser;
	
	private Actor victor = Actor.named("Victor");
	private paginaChoucair paginaChoucair;
	
	@Before
	public void setUp() {
		isBrowser.manage().window().maximize();
		victor.can(BrowseTheWeb.with(isBrowser));
		
	}
	@Given("^dado que victor quiere encontrar un trabajo$")
	public void dadoQueVictorQuiereEncontrarUnTrabajo() throws Exception {
		
		//1. Abrir la página de choucair https://www.choucairtesting.com/
		victor.wasAbleTo(abrirNavegador.en(paginaChoucair));
		
		//2. Dirigirse a la sección de empleos
		victor.wasAbleTo(dirigirseA.empleos());
		
		//3.Buscar un empleo
		victor.wasAbleTo(buscarUn.empleo());
		
	
		
	}

	@When("^se postula diligenciando el formulario$")
	public void sePostulaDiligenciandoElFormulario() throws Exception {
		//1. Aplicar a un empleo 
		victor.wasAbleTo(aplicarAUnTrabajo.seleccionado());
	}

	@Then("^valida el registro con una confirmacion en pantalla$")
	public void validaElRegistroConUnaConfirmacionEnPantalla() throws Exception {
	   
	}
}
