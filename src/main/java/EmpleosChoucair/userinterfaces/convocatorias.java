package EmpleosChoucair.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class convocatorias {
	
	public static final Target btnConvocatorias = Target.the("Boton Convocatorias").locatedBy("//div//h3//a[contains(text(),'Convocatorias')]");
	public static final Target palabrasClave = Target.the("input palabras clave").located(By.id("search_keywords"));
	public static final Target ubicacion = Target.the("input ubicacion").located(By.id("search_location"));
	public static final Target btnBuscarTrabajo= Target.the("Boton Buscar Trabajo").locatedBy("//*[@id=\"content\"]/div/div/div/div/div/section[9]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input");
																							                                       ////section//div//div//div//div//div//div//div//div//div//form//div//div//input
	public static final Target item= Target.the("item resultado").locatedBy("//section//div//div//div//div//div//div//div//div//div//ul//li//a");
																													
}
