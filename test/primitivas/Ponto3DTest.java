/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a16679
 */
public class Ponto3DTest {
    
    public Ponto3DTest() {
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
     * Test of obterZ method, of class Ponto3D.
     */
    @Test
    public void testObterZ() {
        System.out.println("obterZ");
        int z = -1;
        Ponto3D p = new Ponto3D(0,0,z);
        int z2 = p.obterZ();
        assertEquals("mensagem",z,z2);
        
        z = 10;
        Ponto3D p2 = new Ponto3D(0,0,z);
        z2 = p2.obterZ();
        assertEquals("mensagem", z, z2);
        
        z = 15;
        Ponto3D p3 = new Ponto3D(0,0,z);
        z2 = p3.obterZ();
        assertEquals("mensagem", z, z2);
    }

    /**
     * Test of definirZ method, of class Ponto3D.
     */
    @Test
    public void testDefinirZ() {
        System.out.println("definirZ");
        int z = 0;
        Ponto3D p = new Ponto3D();
        p.definirZ(z);
        assertEquals("defineZ falhou",z,p.z);
        z = -1;
        p.defineZ(z);
        assertEquals("defineZ falhou", z,p.z);
        
        z = 6;
        p.defineZ(z);
        assertEquals("defineZ falhou", z,p.z);
    }

    /**
     * Test of distancia method, of class Ponto3D.
     */
    @Test
    public void testDistancia() {
        System.out.println("distancia");
        
        // (1,1,1) --> (2,3,4)
        Ponto3D p1 = new Ponto3D(1,1,1);
        Ponto3D p2 = new Ponto3D(2,3,4);
        double distEsperada = 2.23607;
        double distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        // (2,3,4) --> (1,1,1)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-5,-3) → (1,1,1)
        p1 = new Ponto3D(-1,-5,-3);
        p2 = new Ponto3D(1,1,1);
        distEsperada = 6.32456;
        distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        
        //(1,1,1) → (-1,-5,-3)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-5,-3) → (-1,-1,-1)
        p1 = new Ponto3D(-1,-5,-3);
        p2 = new Ponto3D(-1,-1,-1);
        distEsperada = 4;
        distResultado = p1.distancia(p2);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
        //(-1,-1,-1) → (-1,-5,-3)
        distResultado = p2.distancia(p1);
        assertEquals(distEsperada + " != " + distEsperada,distEsperada,distResultado, 0.01);
    }

    /**
     * Test of equals method, of class Ponto3D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Ponto3D p = null;
        Ponto3D instance = new Ponto3D();
        boolean expResult = false;
        boolean result = instance.equals(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ponto3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ponto3D instance = new Ponto3D();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Ponto3D.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Ponto3D instance = new Ponto3D();
        Ponto3D expResult = null;
        Ponto3D result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
