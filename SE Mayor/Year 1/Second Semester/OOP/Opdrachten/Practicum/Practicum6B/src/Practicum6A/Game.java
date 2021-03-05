package Practicum6A;

import java.time.LocalDate;
import java.util.*;
public class Game {

	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	private String Games;

	public Game (String nm, int rJ, double nwpr){
		naam=nm;
		releaseJaar=rJ;
		nieuwprijs=nwpr;
	}

	public String getNaam(){
		return naam;
	}

	public double huidigeWaarde() {
		int delta= LocalDate.now().getYear()-releaseJaar;
		double factor=Math.pow(0.70, delta);
		return nieuwprijs * factor;
	}

	public boolean equals(Object andereObject) {
		boolean object = false;
		if (andereObject instanceof Game) {
			Game andereGame = (Game) andereObject;
			if (this.naam.equals(andereGame.naam) &&
					this.releaseJaar == andereGame.releaseJaar) {
				object = true;
			}
		}
		return object;
	}
	public String toString() {
		return String.format(Locale.GERMAN, "%s, uitgegeven in %s; nieuwprijs: \u20ac%.2f nu voor: \u20ac%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
	}
}