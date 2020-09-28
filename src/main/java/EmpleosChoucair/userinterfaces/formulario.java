package EmpleosChoucair.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class formulario {
	
	public static final Target btnAplicar = Target.the("Boton Convocatorias").locatedBy("//input[@class='application_button button']");
	public static final Target txtNombre = Target.the("input Nombre").locatedBy("//input[@name='your-name']");
	public static final Target txtCorreo = Target.the("input Correo").locatedBy("//input[@name='your-email']");
	public static final Target txtTelefono = Target.the("input Telefono").locatedBy("//input[@name='tel']");
	public static final Target txtEstudios = Target.the("input Estudios").locatedBy("//textarea[@name='estudios']");
	public static final Target txtExperiencia = Target.the("input Experiencia").locatedBy("//textarea[@name='exp']");
	public static final Target txtConoces = Target.the("input Conoces").locatedBy("//textarea[@name='auto']");
	public static final Target txtAspiracion = Target.the("input Aspiracion Salarial").locatedBy("//input[@name='salario']");
	public static final Target txtMensaje = Target.the("input Mensaje Adicional").locatedBy("//textarea[@name='your-message']");
	public static final Target listaDesplegable = Target.the("disponibilidad").locatedBy("//span/select[@name='curso']");
	public static final Target selecciónListaDesplegable = Target.the("Selección de lista").locatedBy("//span/select[@name='curso']/descendant::option[text()='Inmediata']");
	//public static final Target captcha= Target.the("Captcha").located(By.id("recaptcha-anchor-label"));
	public static final Target captcha= Target.the("Captcha").locatedBy("//div/span[@id='recaptcha-anchor']");
	public static final Target btnEnviar = Target.the("Boton Enviar").locatedBy("//input[@class='wpcf7-form-control wpcf7-submit']");

}
