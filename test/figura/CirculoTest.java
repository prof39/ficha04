package figura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primitivas.Ponto2D;

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
        Ponto2D centro = new Ponto2D(0,0);
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
        Ponto2D expResult = instance.obterCentro();
        Ponto2D result = instance.obterCentro();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterRaio method, of class Circulo.
     */
    @Test
    public void testObterRaio() {
        System.out.println("obterRaio");
        Circulo instance = new Circulo();
        int expResult = 0;
        int result = instance.obterRaio();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterArea method, of class Circulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.obterArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obterPerimetro method, of class Circulo.
     */
    @Test
    public void testObterPerimetro() {
        System.out.println("obterPerimetro");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.obterPerimetro();
        assertEquals(expResult, result, 0.0);
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
        Ponto2D p = new Ponto2D(0,0);
        Circulo instance = new Circulo();
        boolean expResult = false;
        boolean result = instance.estaDentro(p);
        assertEquals(expResult, result);
    }
    
}
