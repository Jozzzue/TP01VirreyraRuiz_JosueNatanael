package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto5 {

	private int num;
	
	public Punto5() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean IsMonth() {
		boolean ismonth;
		switch(num)
		{
		case 1:  ismonth=true;
			break;
		case 2:  ismonth=true;
			break;
		case 3:  ismonth=true;
			break;
		case 4: ismonth=true;
			break;
		case 5: ismonth=true;
			break;
		case 6: ismonth=true;
			break;
		case 7: ismonth=true;
			break;
		case 8: ismonth=true;
			break;
		case 9: ismonth=true;
			break; 
		case 10:ismonth=true;
			break;
		case 11: ismonth=true;
			break;
		case 12: ismonth=true;
			break;
		default: ismonth=false;
			break;
		}
		return ismonth;
	}
	
}
