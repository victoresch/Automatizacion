package EmpleosChoucair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import EmpleosChoucair.userinterfaces.paginaChoucair;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class abrirNavegador implements Task {

	private PageObject pagina;
	
	public abrirNavegador(PageObject pagina) {
		this.pagina=pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pagina));
		
	}

	public static abrirNavegador en(PageObject page) {
		return instrumented(abrirNavegador.class,page);
	}

}
