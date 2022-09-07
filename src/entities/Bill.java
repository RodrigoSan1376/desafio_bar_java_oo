package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		double aux = 0.0;
		if(feeding() < 30.0) {
			aux = 4.0;
		}				
		return aux;
	}
	
	public double feeding() {
		return beer * 5.0 + barbecue * 7.0 + softDrink * 3.0;
	}
	
	public double ticket() {
		double aux = 0.0;
		if(gender == 'F') {
			aux = 8.0;
		}
		else {
			aux = 10.0;
		}
		return aux;
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}

}
