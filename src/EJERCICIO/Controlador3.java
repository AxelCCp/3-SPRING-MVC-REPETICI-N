package EJERCICIO;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("controlador3")
public class Controlador3 {

	@RequestMapping("/suscripcionRevista")
	public String suscripcionRevista() {
		return "A3_FormularioSuscripcion";
	}
	
	
	@RequestMapping("/procesarSuscripcion")
	public String procesarSuscripcion(HttpServletRequest request, Model modelo) {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String revista = request.getParameter("revista");
		String direccion = request.getParameter("direccion");
		
		String resumen = "EL CLIENTE " + nombre + " " + apellido + " SE HA SUSCRITO CON EXITO A LA "
						+ "REVISTA " + revista
						+ " \nDIRECCIÓN DE ENTREGA: " + direccion;
		
		modelo.addAttribute("resumen", resumen);
		
		return "A4_RegistroSuscripcion";
	}
	
}
