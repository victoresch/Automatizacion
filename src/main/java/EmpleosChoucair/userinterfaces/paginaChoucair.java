package EmpleosChoucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/")
public class paginaChoucair extends PageObject{
	public static final Target btnEmpleos= Target.the("Boton Empleos").locatedBy("//*[@id=\"menu-item-550\"]/a");

}
