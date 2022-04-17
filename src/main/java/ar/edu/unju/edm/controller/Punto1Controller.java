package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto1;

@Controller
public class Punto1Controller {

	@GetMapping("/index")
	public String showMenu() {
		
		return "index";
	}
	
	@GetMapping("/resolverPunto1")
	public String getPunto1Page( @RequestParam (name = "num") int num, Model model ) {
		int result;
		Punto1 aPunto1 = new Punto1();
		aPunto1.setNumber(num);
		result = aPunto1.SolveFact();
		model.addAttribute("Punto1", result);
		return "punto_1";
	}
}
