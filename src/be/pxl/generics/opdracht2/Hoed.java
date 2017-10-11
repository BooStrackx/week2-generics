package be.pxl.generics.opdracht2;

public class Hoed<T extends Dier> {

	private Dier dier;
	private int counter = 0;
	
	public Hoed (T dier){
		this.setDier(dier);
	}
	
	public Dier kijk() {
		if (counter == 0) {
			counter++;
			return null;
		} else {
			return dier;
		}
		
	}

	public Dier getDier() {
		return dier;
	}

	public void setDier(Dier dier) {
		this.dier = dier;
	}

}
