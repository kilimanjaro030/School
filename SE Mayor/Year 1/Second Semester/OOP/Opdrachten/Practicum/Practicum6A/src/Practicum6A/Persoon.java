package Practicum6A;

import java.util.*;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> games;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        games = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (!games.contains(g) && budget >= g.huidigeWaarde()) {
            games.add(g);
            budget = budget - g.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if(games.contains(g) && koper.koop(g)){
            games.remove(g);
            budget= budget +g.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        String s = String.format(Locale.GERMAN,"%s heeft een budget van \u20ac%.2f en bezit de volgende games:", naam, budget);
        for (Game D : games) {
            s =   s  + "\n" + D  ;
        }
        return s;
    }

}