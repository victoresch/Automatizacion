package EmpleosChoucair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import EmpleosChoucair.userinterfaces.convocatorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;;

public class buscarUn implements Task{



	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(convocatorias.btnConvocatorias),
				Enter.theValue("Analista").into(convocatorias.palabrasClave),
				Enter.theValue("Medellin").into(convocatorias.ubicacion),
				Click.on(convocatorias.btnBuscarTrabajo),
				Click.on(convocatorias.item)
						
		);
		
	}

	public static buscarUn empleo() {
		// TODO Auto-generated method stub
		return instrumented(buscarUn.class);
	}

}
