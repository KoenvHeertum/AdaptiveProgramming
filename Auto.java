package auto;

public class Auto {

	private String type;
	private double prijsPerDag;
	
	public Auto(String type, double prPd) {
		setType(type);
		setPrijsPerDag(prPd);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	public void setPrijsPerDag(double prijsPerDag) {
		this.prijsPerDag = prijsPerDag;
	}
	
	
}
