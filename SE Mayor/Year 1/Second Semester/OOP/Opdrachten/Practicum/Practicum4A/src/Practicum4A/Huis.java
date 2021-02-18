package Practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }
    public void setHuisbaas( Persoon hb) {
        huisbaas = hb;
    }
    public Persoon getHuisbaas() {
        return huisbaas;
    }
    public String toString(){
        return String.format("Huis %s is gebouwd in %s \nen heeft huisbaas %s", adres, bouwjaar, huisbaas.toString());
    }
}
