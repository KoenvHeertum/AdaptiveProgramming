package auto;

public class Klant {

	public Klant(String naam) {
		setNaam(naam);
	}
	
	private String naam;
	private double kortingsPercentage = 0;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public double getKortingsPercentage() {
		return kortingsPercentage;
	}
	public void setKortingsPercentage(double kortingsPercentage) {
		this.kortingsPercentage = kortingsPercentage;
	}
	
	public String toString(String str) {
		return ("Op naam van: Mijnheer " + getNaam() + ". (Korting: " + getKortingsPercentage() + "%).");
	}
	
}
