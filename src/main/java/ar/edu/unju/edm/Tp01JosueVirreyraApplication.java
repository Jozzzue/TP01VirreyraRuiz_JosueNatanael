package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto6;

@SpringBootApplication
public class Tp01JosueVirreyraApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01JosueVirreyraApplication.class, args);
		
		
		Punto6 apunto6 = new Punto6();
		apunto6.setNum(6);
			System.out.println(apunto6.StatuStudent());
		

	}
	
}