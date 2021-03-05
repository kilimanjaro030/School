package Practicum6A;
import java.lang.*;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }
    public String getNaam(){
        return naam;
    }
    public double huidigeWaarde(){
        int Jr = LocalDate.now().getYear() - releaseJaar;
        double hW =  nieuwprijs * Math.pow(0.70,Jr);
        return hW;



    }
    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;
            if(this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar) {
                gelijkeObjecten = true;
            }

        }
        return gelijkeObjecten;
    }
    public String toString(){
        return String.format("%s, uitgegeven in %d; nieuwprijs: \u20ac%.2f nu voor: \u20ac%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
