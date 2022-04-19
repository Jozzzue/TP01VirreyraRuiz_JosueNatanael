package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto7;

@SpringBootApplication
public class Tp01JosueVirreyraApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01JosueVirreyraApplication.class, args);
		
		
		Punto7 apunto7 = new Punto7();
		
		int[] newarray = apunto7.CreateNumericalSeq();
		apunto7.PrintNumSeq(newarray);

	}
	
}