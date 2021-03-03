package Practicum5;

import java.util.ArrayList;

public class Klas {

    private String klasCode;
    private ArrayList<Leerling> Leerlingen;

    public Klas (String kC){
        klasCode = kC;
        Leerlingen = new ArrayList<Leerling>();
    }
    public String getklas(){
        return klasCode;
    }
    public void voegLeerlingToe( Leerling l){
        Leerlingen.add(l);
    }
    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling Student: Leerlingen) {
            if (nm.equals(Student.getnaam())){
                Student.setcijfer(nweCijfer);}
        }
    }
    public ArrayList<Leerling>getLeerlingen(){
        return Leerlingen ;

    }
    public int  aantalLeerlingen (){
        return Leerlingen.size();
    }
    public String toString(){
        ArrayList<Leerling> leerlingenlijst = getLeerlingen();
        for (Leerling leerling : leerlingenlijst){
            System.out.println(leerling);
        }
        return String.format("In klas %s zitten de volgende leerlingen", klasCode);
    }
}