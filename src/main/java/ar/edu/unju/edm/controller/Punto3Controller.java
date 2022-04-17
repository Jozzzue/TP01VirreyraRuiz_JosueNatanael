package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto3;

@Controller
public class Punto3Controller {

	@GetMapping("/resolverPunto3")
	public String getPunto3Page( @RequestParam (name = "num1") int num1, @RequestParam (name = "num2") int num2, @RequestParam (name = "num3") int num3, @RequestParam (name = "num4") int num4, @RequestParam (name = "num5") int num5, Model model ) {
		
		Punto3 aPunto3 = new Punto3();
		String iseven="SI es par", noteven="NO es par";
		aPunto3.setNum(num1);
		if(aPunto3.IsEven() == true)
			model.addAttribute("Punto31", iseven);
		else
			model.addAttribute("Punto31", noteven);
		
		aPunto3.setNum(num2);
		if(aPunto3.IsEven() == true)
			model.addAttribute("Punto32", iseven);
		else
			model.addAttribute("Punto32", noteven);
		
		aPunto3.setNum(num3);
		if(aPunto3.IsEven() == true)
			model.addAttribute("Punto33", iseven);
		else
			model.addAttribute("Punto33", noteven);
	
		aPunto3.setNum(num4);
		if(aPunto3.IsEven() == true)
			model.addAttribute("Punto34", iseven);
		else
			model.addAttribute("Punto34", noteven);
		
		aPunto3.setNum(num5);
		if(aPunto3.IsEven() == true)
			model.addAttribute("Punto35", iseven);
		else
			model.addAttribute("Punto35", noteven);

		return "punto_3";
	}
}
