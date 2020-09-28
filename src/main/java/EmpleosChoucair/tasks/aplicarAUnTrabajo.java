package EmpleosChoucair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import EmpleosChoucair.userinterfaces.formulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class aplicarAUnTrabajo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		BrowseTheWeb.as(actor).evaluateJavascript("window.scrollBy(0," + 1200 + ")");
		actor.attemptsTo(
				//Scroll.to(formulario.btnAplicar),
				Click.on(formulario.btnAplicar),
				Enter.theValue("Victor Estupiñan").into(formulario.txtNombre),
				Enter.theValue("victoresch@hotmail.com").into(formulario.txtCorreo),
				Enter.theValue("3216791144").into(formulario.txtTelefono),
				Enter.theValue("Ingeniero de sistemas y computación").into(formulario.txtEstudios),
				Enter.theValue("Un año y 3 meses").into(formulario.txtExperiencia),
				Enter.theValue("Tengo conocimiento necesario pero quiero seguir aprendiendo").into(formulario.txtConoces),
				Enter.theValue("3.000.000").into(formulario.txtAspiracion),
				Click.on(formulario.listaDesplegable),
				Click.on(formulario.selecciónListaDesplegable),
				Enter.theValue("Gracias por la confianza").into(formulario.txtMensaje)
				
		);
		
		BrowseTheWeb.as(actor).evaluateJavascript("window.scrollBy(0," + 500 + ")");
		actor.attemptsTo(
				
				
				Click.on(formulario.btnEnviar)
				//Click.on(formulario.captcha)
		
		);
		
		
	
		
	}

	public static aplicarAUnTrabajo seleccionado() {
		
		return instrumented(aplicarAUnTrabajo.class);
	}

}
