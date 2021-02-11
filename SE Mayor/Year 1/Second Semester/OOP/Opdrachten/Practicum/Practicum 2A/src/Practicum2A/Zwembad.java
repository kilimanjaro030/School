public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double bre, double len, double die)
    {
        breedte = bre;
        lengte = len;
        diepte = die;
    }

    public Zwembad()
    {

    }
    public double getBreedte()
    {
        return breedte;
    }

    public double getLengte()
    {
        return lengte;
    }

    public double getDiepte()
    {
        return diepte;
    }

    public double inhoud()
    {
        return breedte * lengte * diepte;
    }

    public void setBreedte(double newBre)
    {
        breedte = newBre;
    }

    public void setLengte(double newLen)
    {
        lengte = newLen;
    }

    public void setDiepte(double newDie)
    {
        diepte = newDie;
    }

    public String toString()
    {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
        return s;
    }
}
