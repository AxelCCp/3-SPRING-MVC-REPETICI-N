package EJERCICIO;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controlador4")
public class Controlador4 {

	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		Alumno alumno1 = new Alumno();
		modelo.addAttribute("alumno1", alumno1);
		return"A5_AlumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario")//ALMACENAMOS LA INFO DE "alumno1" en "alumnoX"
	public String procesarFormulario(@Valid @ModelAttribute("alumno1") Alumno alumnoX, 
									BindingResult resultadoDeValidacion) {
									//SE ALMACENAN LOS RESULTADOS DE VALIDACIÓN, tambn ponemos el @Valid.
		if(resultadoDeValidacion.hasErrors()==true) {
			return "A5_AlumnoRegistroFormulario";
		}
		else {
			return "A6_RegistroAlumno";
		}
		
	}
	
	
	//VIDEO41 / MÉTODO QUE RECORTA LOS ESPACIOS EN BLANCO QUE PUEDEN IR EN LOS CUADROS DE TXT.
	//StringTrimmerEditor(true): true para q un string vacío se transforme en nulo.
	
	//binder.registerCustomEditor(String.class,recortaEspaciosBlanco) : para q trabaje en la clase String.
	//..y recorte los espacios en blanco
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,recortaEspaciosBlanco);
	}
	
	
}
