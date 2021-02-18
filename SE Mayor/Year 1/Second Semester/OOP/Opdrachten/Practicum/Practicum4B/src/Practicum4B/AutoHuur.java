package Practicum4B;
public class AutoHuur {
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;

	public AutoHuur() {

	}
	public void setAantalDagen(int aD) {
		if(gehuurdeAuto == null || huurder == null){
			aantalDagen = 0;
		}
		else{
			aantalDagen = aD;
		}

	}

	public int getAantalDagen() {
		return aantalDagen;
	}
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
	}

	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	public void setHuurder(Klant k) {
		huurder = k;
	}

	public Klant getHuurder() {
		return huurder;
	}

	public double totaalPrijs() {
		double tP = 0;
		if(gehuurdeAuto != null && huurder != null)
		{
			double kP = (aantalDagen * gehuurdeAuto.getPrijsPerDag()) * (huurder.getKorting() / 100);
			tP = tP + (aantalDagen * gehuurdeAuto.getPrijsPerDag()) - kP;
		}
		return tP;
	}
	public String toString() {
		String text = "";
		if(gehuurdeAuto == null && huurder == null){
			text = text + "er is geen auto bekend " + "\ner is geen huurder bekend" + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		}
		if(gehuurdeAuto == null && huurder != null){
			text = text + "er is geen auto bekend "+ "\n" + huurder.toString() + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		}
		if(gehuurdeAuto != null && huurder == null){
			text = text + "autotype: " + gehuurdeAuto.toString() + "\ner is geen huurder bekend \naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		}
		if(gehuurdeAuto != null && huurder != null){
			text = text + "autotype: " + gehuurdeAuto.toString() + "\n" + huurder.toString() + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
 		}
		return text;
	}
}