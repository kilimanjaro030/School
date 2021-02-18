package Practicum3A;
public class Voetbalclub
{
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String nm)
    {
        naam = nm;
        if (naam.equals(""))
            naam = "FC";
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
        if (naam.equals(""))
            naam = "FC";
    }
    public int aantalGespeeld()
    {
        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }

    public int aantalPunten()
    {
        return (aantalGewonnen * 3) + (aantalVerloren * 0) + (aantalGelijk * 1);
    }
    public String toString()
    {
//        String s = naam + "  :   " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
//        return s;
//        return String.format("%c  :   .1f% .1f% .1f% .1f%",naam, aantalGewonnen, aantalGelijk, aantalVerloren);
        return naam + " " +  aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();

    }

}
