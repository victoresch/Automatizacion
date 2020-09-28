package EmpleosChoucair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import EmpleosChoucair.userinterfaces.paginaChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;;

public class dirigirseA implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(paginaChoucair.btnEmpleos)						
		);
		
	}

	public static dirigirseA empleos() {
		// TODO Auto-generated method stub
		return instrumented(dirigirseA.class);
	}

	

}
