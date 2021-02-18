package EJERCICIO;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controlador5")
public class Controlador5 {
	
	
	@RequestMapping("/muestraformularioPasajero")
	public String muestraformularioPasajero(Model modelo) {
		Pasajero pasajero1  = new Pasajero();
		modelo.addAttribute("pasajero1",pasajero1);
		return "A7_formularioPasajero";
	}
	
	@RequestMapping("/confirmacionVuelo")
	public String confirmacionVuelo(@Valid @ModelAttribute("pasajero1") Pasajero pasajeroX, 
									BindingResult resultadoDeValidacion) {
		if(resultadoDeValidacion.hasErrors()==true) {
			return "A7_formularioPasajero";
		}
		else {
			return "A8_RegistroDelPasajero";
		}	
	}
	
	
}
