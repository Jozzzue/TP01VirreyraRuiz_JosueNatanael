package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto1 {
	//atributos
	private int number;
	
	//constructores
	public Punto1() {
		// TODO Auto-generated constructor stub
	}
	//getter y setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int SolveFact(){ // los metodos, por convencion va en minuscula el verbo
		
		int result=1;
		if (number==0)
		{
			if(number==0 || number==1)
			{
				return result;
			}
			else
			{
				result=number;
				for(int i=number-1; i>0; i--)
				{
					result=result*i;
				}
				return result;
			}
		}else
			return 0;
	}
}
