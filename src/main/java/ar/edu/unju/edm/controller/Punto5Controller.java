package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto5;

@Controller
public class Punto5Controller {

	@GetMapping("/resolverPunto5")
	public String getPunto5Page( @RequestParam (name = "num") int num, Model model ) {
		String whatis;
		Punto5 aPunto5 = new Punto5();
		aPunto5.setNum(num);
		if(aPunto5.IsMonth() == true)
			whatis = "SI es un mes";
		else
			whatis = "NO es un mes";

			model.addAttribute("Punto5", whatis);
		return "punto_5";
	}
}
