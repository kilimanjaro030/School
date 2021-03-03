package Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling (String nm){
        naam = nm;
    }

    public String getnaam(){
        return  naam;
    }

    public double getcijfer(){
        return cijfer;
    }

    public void setcijfer(double cf){
        cijfer = cf;

    }
    public String toString(){
        return String.format("%s heeft cijfer: %.1f", naam, cijfer);
    }
}