package figura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primitivas.Ponto2D;
import figura.Circulo;

/**
 *
 * @author a12679
 */
public class CirculoTest {

    public CirculoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of defineCentro method, of class Circulo.
     */
    @Test
    public void testDefineCentro() {
        System.out.println("defineCentro");
        Ponto2D centro = new Ponto2D(0, 0);
        Circulo instance = new Circulo();
        instance.defineCentro(centro);
        Ponto2D obtido = instance.obterCentro();

        assertTrue(centro.equals(obtido));
    }

    /**
     * Test of defineRaio method, of class Circulo.
     */
    @Test
    public void testDefineRaio() {
        System.out.println("defineRaio");
        int raio = 5;
        Circulo instance = new Circulo();
        instance.defineRaio(raio);
        int obtido = instance.obterRaio();
        assertEquals(raio, obtido);
    }

    /**
     * Test of obterCentro method, of class Circulo.
     */
    @Test
    public void testObterCentro() {
        System.out.println("obterCentro");
        Circulo instance = new Circulo();
        Ponto2D esperado = instance.obterCentro();
        Ponto2D obtido = instance.obterCentro();
        assertEquals(esperado, obtido);
    }

    /**
     * Test of obterRaio method, of class Circulo.
     */
    @Test
    public void testObterRaio() {
        System.out.println("obterRaio");
        Circulo instance = new Circulo();
        instance.raio = 5;
        int esperado = 5;
        int obtido = instance.obterRaio();
        assertEquals(esperado, obtido);
    }

    /**
     * Test of obterArea method, of class Circulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Circulo instance = new Circulo();
        instance.raio = 6;
        double esperado = 113.097335529;
        double obtido = instance.obterArea();
        assertEquals(esperado, obtido, 113.09);
    }

    /**
     * Test of obterPerimetro method, of class Circulo.
     */
    @Test
    public void testObterPerimetro() {
        System.out.println("obterPerimetro");
        Circulo instance = new Circulo();
        instance.raio = 8;
        double esperado = 50.265482457;
        double obtido = instance.obterPerimetro();
        assertEquals(esperado, obtido, 50.2);
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = new Circulo();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of estaDentro method, of class Circulo.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("estaDentro");
        Ponto2D p = new Ponto2D(5, 5);
        Circulo instance = new Circulo();
        instance.raio = 2;
        boolean esperado = false;
        boolean obtido = instance.estaDentro(p);
        assertEquals(esperado, obtido);
    }

}
