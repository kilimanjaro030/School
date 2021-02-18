package Practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur ah1;
    private Klant k;
    private Auto a1;

    @BeforeEach
    public void init() {
        System.out.println("init");
        ah1 = new AutoHuur();
        k = new Klant("Mijnheer de Vries");
        a1 = new Auto("Peugeot 207", 50);
    }

    @Test
    void testprijstotaalHuurderpluskorting() {
        System.out.println("testprijstotaalHuurderpluskorting");
        ah1.setHuurder(k);
        k.setKorting(20);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(30);
        assertEquals(1200.0, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalHuurderpluskorting2 () {
        System.out.println("testprijstotaalHuurderpluskorting2");
        ah1.setHuurder(k);
        k.setKorting(40);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(60);
        assertEquals(1800.0, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalHuurderpluskorting3(){
        System.out.println("testprijstotaalHuurderpluskorting2");
        ah1.setHuurder(k);
        k.setKorting(10);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(3);
        assertEquals(135, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalHuurderzonderkorting(){
        System.out.println("testprijstotaalHuurderpluskorting");
        ah1.setHuurder(k);
        k.setKorting(0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(7);
        assertEquals(350, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalhuurderzonderkorting2(){
        System.out.println("testprijstotaalhuurderzonderkorting2");
        ah1.setHuurder(k);
        k.setKorting(0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(20);
        assertEquals(1000, ah1.totaalPrijs());
    }
    @Test
    void teststringhuurderpluskorting() {
        System.out.println("teststringhuurdermetkorting");
        ah1.setHuurder(k);
        k.setKorting(20);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(30);

        assertEquals("autotype: " + "Peugeot 207" + " met prijs per dag: " + 50.0 + "\n"
                + "op naam van: " + "Mijnheer de Vries " + "(" + "korting: " + 20.0 + "%" + ")" + "\n" +
                "aantal dagen: " + 30 + " en dat kost " + 1200.0, ah1.toString());
    }
    @Test
    void teststringhuurderpluskorting2() {
        System.out.println("teststringhuurdermetkorting2");
        ah1.setHuurder(k);
        k.setKorting(40);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(60);

        assertEquals("autotype: " + "Peugeot 207" + " met prijs per dag: " + 50.0 + "\n"
                + "op naam van: " + "Mijnheer de Vries " + "(" + "korting: " + 40.0 + "%" + ")" +   "\n" +
                "aantal dagen: " + 60 + " en dat kost " + 1800.0, ah1.toString());
    }
    @Test
    void teststringhuurderzonderkorting() {
        System.out.println("teststringhuurderzonderkorting");
        ah1.setHuurder(k);
        k.setKorting(0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(7);

        assertEquals("autotype: " + "Peugeot 207" + " met prijs per dag: " + 50.0 + "\n"
                + "op naam van: " + "Mijnheer de Vries " + "(" + "korting: " + 0.0 + "%" + ")" +   "\n" +
                "aantal dagen: " + 7 + " en dat kost " + 350.0, ah1.toString());
    }
    @Test
    void testprijstotaalzonderhuurder() {
        System.out.println("testprijstotaalzonderhuurder");
        k.setKorting(0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(7);

        assertEquals(0.0, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalzonderauto() {
        System.out.println("testprijstotaalzonderauto");
        ah1.setHuurder(k);
        k.setKorting(40);
        ah1.setAantalDagen(60);
        assertEquals(0.0, ah1.totaalPrijs());
    }
    @Test
    void testprijstotaalzonderhuurderenzonderauto() {
        System.out.println("testprijstotaalzonderhuurderenzonderauto");
        k.setKorting(40);
        ah1.setAantalDagen(60);
        assertEquals(0.0, ah1.totaalPrijs());
    }
    @Test
    void teststringzonderhuurder() {
        System.out.println("testToStringZonderHuurder");
        k.setKorting(0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(7);
        assertEquals("autotype: " + "Peugeot 207" + " met prijs per dag: " + 50.0 + "\n" +
                "er is geen huurder bekend " + "\n" +
                "aantal dagen: " + 0 + " en dat kost " + 0.0, ah1.toString());
    }
    @Test
    void teststringzonderauto(){
        System.out.println("teststringzonderauto");
        ah1.setHuurder(k);
        k.setKorting(40);
        ah1.setAantalDagen(60);
        assertEquals("er is geen auto bekend " + "\n" +
                "op naam van: " + "Mijnheer de Vries " + "(" + "korting: " + 40.0 + "%" + ")" + "\n" +
                "aantal dagen: " + 0 + " en dat kost " + 0.0, ah1.toString());
    }
    @Test
    void teststringzonderautoenzonderhuurder(){
        System.out.println("teststringzonderautoenzonderhuurder");
        k.setKorting(50);
        ah1.setAantalDagen(20);
        assertEquals("er is geen auto bekend " + "\n" +
                "er is geen huurder bekend" + "\n" +
                "aantal dagen: " + 0 + " en dat kost " + 0.0, ah1.toString());
    }
}