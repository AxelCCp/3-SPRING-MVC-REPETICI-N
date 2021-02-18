package EJERCICIO;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//PROCESA LAS PETICIONES JSP

@Controller
@RequestMapping("/controlador2")
public class Controlador2 {

	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "A1_HolaAlumnosFormulario";
	}
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "A2_HolaAlumnosSpring";
	}
	@RequestMapping("procesarFormulario2")
	public String procesarFormulario2(HttpServletRequest request, Model modelo) {
		
		//RESCATAMOS LA INFO INGRESADA EN EL CUADRO TXT "nombreAlumno"
		String nombre = request.getParameter("nombreAlumno");
		String apellido = request.getParameter("apellidoAlumno");
		String mensaje = nombre + " " + apellido + " se ha matriculado en le curso de Spring."; 
		modelo.addAttribute("matricula", mensaje);
		
		String ciudad= request.getParameter("ciudad");
		String cede= "El alumno a elegido el centro de estudios de " + ciudad;
		modelo.addAttribute("centroEstudios", cede);
		
		return "A2_HolaAlumnosSpring";
	}
	
	
	
	
}


