package Practicum2B;

public class Voetbalclub
{
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String nm)
    {
        naam = nm;
    }

    public String getNaam()
    {
        return naam;
    }
    public int getAantalGewonnen()
    {
        return aantalGewonnen;
    }
    public int getAantalVerloren()
    {
        return aantalVerloren;
    }
    public int getAantalGelijkgespeeld()
    {
        return aantalGelijk;
    }

    public void verwerkResultaat(char ch)
    {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld()
    {
        int Gespeeldewedstrijden = aantalGewonnen + aantalVerloren + aantalGelijk;
        return Gespeeldewedstrijden;
    }

    public int aantalPunten()
    {
        int totalepunten = (aantalGewonnen * 3) + (aantalVerloren * 0) + (aantalGelijk * 1);
        return totalepunten;
    }
    public String toString()
    {
        String s = naam + "  :   " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return s;
    }

}
