package Practicum6A;

import java.util.*;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> games;
    private ArrayList<Game> nogNietInBezit;

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
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        for(Game k : games) {
            for(Game j : teKoop){
                if(j.equals(k)){
                    teKoop.remove(k);
                    return teKoop;
                }
            }
        }
        return teKoop;
    }

    public Game zoekGameOpNaam(String Gnm) {
        for(Game g : games) {
            if(g.getNaam().equals(Gnm)) {
            return g;
        }
        }
        return null;
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