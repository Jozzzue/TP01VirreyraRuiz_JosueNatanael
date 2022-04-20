package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto8;

@SpringBootApplication
public class Tp01JosueVirreyraApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01JosueVirreyraApplication.class, args);
		
		
		Punto8 apunto8 = new Punto8();
		
		int[] newarray = apunto8.SeqMultiples4();
		apunto8.PrintSeqMult(newarray);;

	}
	
}