package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto12;

@SpringBootApplication
public class Tp01JosueVirreyraApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01JosueVirreyraApplication.class, args);
		
		
		Punto12 apunto12 = new Punto12();
		
		apunto12.setHeight(10);
		System.out.print(apunto12.CalculateTime());
		

	}
	
}