import Practicum3A.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub cl;
    @BeforeEach
    public void init(){
        System.out.println("init");
        cl = new Voetbalclub("");
    }

    @Test
    void testnaam() {
        new Voetbalclub("");
        assertEquals("FC", cl.getNaam());

    }

    @Test
    void testWinst3PuntenOp() {
        System.out.println("testWinst3PuntenOpResultaat");
        cl.verwerkResultaat('w');

        assertEquals(3, cl.aantalPunten());

    }
    @Test
    void testGelijkLevert1PuntOp() {
        System.out.println("testGelijkLevert1PuntOp");
        cl.verwerkResultaat('g');

        assertEquals(1, cl.aantalPunten());
    }
    @Test
    void testVerliesLevert0PuntenOp() {
        System.out.println("testVerliesLevert0PuntenOp");
        cl.verwerkResultaat('v');

        assertEquals(0, cl.aantalPunten());
    }
    @Test
    void testWinstLevertcorrecteToString() {
        System.out.println("testWinstLevertcorrecteToString");
        cl.verwerkResultaat('w');

        assertEquals("FC" + " " + 1 + " " + 1 + " " + 0 + " " + 0 + " " + 3, cl.toString());
    }
    @Test

    void testGelijkLevertJuistetoString() {
        System.out.println("testGelijkLevertJuistetoString");
        cl.verwerkResultaat('g');

        assertEquals("FC" + " " + 1 + " " + 0 + " " + 1 + " " + 0 + " " + 1, cl.toString());
    }
    @Test
    void testVerliesLevertJuistetoString() {
        System.out.println("testVerliesLevertJuistetoString");
        cl.verwerkResultaat('v');

        assertEquals("FC" + " " + 1 + " " + 0 + " " + 0 + " " + 1 + " " + 0, cl.toString());
    }
    @Test
    void testjuistewedstrijdaantallen() {
        System.out.println("testjuistewedstrijdaantallen");
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('v');
        cl.verwerkResultaat('g');
        cl.verwerkResultaat('w');


        assertEquals(6, cl.aantalGespeeld());
    }
    @Test
    void testjuistewedstrijdaantallen2() {
        System.out.println("testjuistewedstrijdaantallen2");
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('v');
        cl.verwerkResultaat('g');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('s');

        assertEquals(9, cl.aantalGespeeld());
    }
    @Test
    void testjuistepuntenaantal() {
        System.out.println("testjuistepuntenaantal");
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('v');
        cl.verwerkResultaat('g');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('s');

        assertEquals(13, cl.aantalPunten());
    }
    @Test
    void testjuistepuntenaantal2() {
        System.out.println("testjuistepuntenaantal2");
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('v');
        cl.verwerkResultaat('g');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('w');
        cl.verwerkResultaat('g');

        assertEquals(20, cl.aantalPunten());
    }
}
