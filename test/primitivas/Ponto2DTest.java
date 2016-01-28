/*
 * Classe de testes
 */
package primitivas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes para a classe Ponto2D
 * @author gm
 */
public class Ponto2DTest {
    
    public Ponto2DTest() {
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
     * Test of defineX method, of class Ponto2D.
     */
    @Test
    public void testDefineX() {
        System.out.println("defineX");
        int x = 0;
        Ponto2D p = new Ponto2D();
        p.defineX(x);
        assertEquals("defineX falhou",x,p.x);
        x = -1;
        p.defineX(x);
        assertEquals(x,p.x);
    }

    /**
     * Test of defineY method, of class Ponto2D.
     */
    @Test
    public void testDefineY() {
        System.out.println("defineY");
        int y = 0;
        Ponto2D p = new Ponto2D();
        p.defineY(y);
        assertEquals("y diferente de "+y,y,p.y);
        y = -1;
        p.defineY(y);
        assertEquals("y diferente de "+y,y,p.y);
    }

    /**
     * Test of obterX method, of class Ponto2D.
     */
    @Test
    public void testObterX() {
        System.out.println("obterX");
        int x = -1;
        Ponto2D p = new Ponto2D(x,0);
        int x2 = p.obterX();
        assertEquals(x+" != "+x2,x,x2);
        
        x = 10;
        Ponto2D p2 = new Ponto2D(x,0);
        x2 = p2.obterX();
        assertEquals(x+" != "+x2,x,x2);
        
    }

    /**
     * Test of obterY method, of class Ponto2D.
     */
    @Test
    public void testObterY() {
        System.out.println("obterY");
        int y = -1;
        Ponto2D p = new Ponto2D(0,y);
        int y2 = p.obterY();
        assertEquals(y+" != "+y2,y,y2);
        
        y = 10;
        Ponto2D p2 = new Ponto2D(0,y);
        y2 = p2.obterY();
        assertEquals(y+" != "+y2,y,y2);
    }

    /**
     * Test of distancia method, of class Ponto2D.
     */
    @Test
    public void testDistancia() {
        System.out.println("distancia");
        // (1,1) --> (2,3)
        Ponto2D p1 = new Ponto2D(1,1);
        Ponto2D p2 = new Ponto2D(2,3);
        double distEsperada = 2.23607;
        double distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        // (2,3) --> (1,1)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-5) → (1,1)
        p1 = new Ponto2D(-1,-5);
        p2 = new Ponto2D(1,1);
        distEsperada = 6.32456;
        distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        
        //(1,1) → (-1,-5)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-5) → (-1,-1)
        p1 = new Ponto2D(-1,-5);
        p2 = new Ponto2D(-1,-1);
        distEsperada = 4;
        distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-1) → (-1,-5)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
    }

    /**
     * Test of igual method, of class Ponto2D.
     */
    @Test
    public void testEquals() {
        System.out.println("igual");
        Ponto2D p1 = new Ponto2D(1,1);
        Ponto2D p2 = new Ponto2D(1,1);
        
        boolean res = p1.equals(p2);
        assertEquals(p1+"=="+p2,true,res);
        
        p1 = new Ponto2D(10,2);
        p2 = new Ponto2D(2,3);
        res = p1.equals(p2);
        assertEquals(p1+"=="+p2,false,res);
        
    }

    /**
     * Test of toString method, of class Ponto2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ponto2D p1 = new Ponto2D(1,2);
        Ponto2D p2 = new Ponto2D(-1,-4);
        
        String res1 = p1.toString();
        String esperado = "(1;2)";
        assertEquals(esperado + " == "+res1,esperado,res1);
        
        res1 = p2.toString();
        esperado = "(-1;-4)";
        assertEquals(esperado + " == "+res1,esperado,res1);
    }
    
}
