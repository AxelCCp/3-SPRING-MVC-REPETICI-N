package EJERCICIO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador1 {

	
	@RequestMapping
	public String muestraPagina() {
		return "A0_paginaInicio";
	}
	
}
