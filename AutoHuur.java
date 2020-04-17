package auto;

public class AutoHuur {
	
	public AutoHuur() {
		System.out.println("Eerste autohuur: " + toString());
	}
	
	private int aantalDagen = 0;
	private Auto auto;
	private Klant klant;

	public int getAantalDagen() {
		return aantalDagen;
	}

	public void setAantalDagen(int aantalDagen) {
		this.aantalDagen = aantalDagen;
	}

	public void setGehuurdeAuto(Auto gehuurdeAuto) {
		auto = gehuurdeAuto;
	}
	
	public Auto getGehuurdeAuto() {
		return auto;
	}

	public Klant getHuurder() {
		return klant;
	}

	public void setHuurder(Klant klant) {
		this.klant = klant;
	}
	
	public double totaalPrijs() {
		double totaalPrijs = (getGehuurdeAuto().getPrijsPerDag() * getAantalDagen()) * ((100 - getHuurder().getKortingsPercentage())/100);
		return totaalPrijs;
	}
	
	public String toString() {
		String tempH = null;
		String tempA = null;
		String tempD = null;
		if(getGehuurdeAuto() == null) {
			tempA = "Er is geen auto gedetecteerd";
		} else {
			tempA = "Autotype: " + (getGehuurdeAuto().getType()) + " met een dagprijs van " + (getGehuurdeAuto().getPrijsPerDag());
		}
		if(getHuurder() == null) {
			tempH = "Er is geen huurder";
		} else {
			tempH = "Op naam van: " + (getHuurder().getNaam()) + " (korting " + (getHuurder().getKortingsPercentage()) + "%)";
		}
		if(getAantalDagen() == 0) {
			tempD = ("Aantal dagen: 0 en dat kost 0");
		} else {
			tempD = ("Aantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs());
		}
		return("\n" + tempA + "\n" + tempH + "\n" + tempD);
	}
	
	
	
}
