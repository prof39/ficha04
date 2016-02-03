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
        p.definirZ(z);
        assertEquals("defineZ falhou", z,p.z);
        
        z = 6;
        p.definirZ(z);
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
        double distEsperada = 3.741;
        double distResultado = p1.distancia(p2);
        assertEquals("Mensagem", distEsperada , distResultado, 0.001);
        // (2,3,4) --> (1,1,1)
        distResultado = p2.distancia(p1);
        assertEquals("Mensagem", distEsperada , distResultado,0.001);
        //(-1,-5,-3) → (1,1,1)
        p1 = new Ponto3D(-1,-5,-3);
        p2 = new Ponto3D(1,1,1);
        distEsperada = 7.4833;
        distResultado = p1.distancia(p2);
       assertEquals("Mensagem", distEsperada , distResultado,0.001);
        
        //(1,1,1) → (-1,-5,-3)
        distResultado = p2.distancia(p1);
       assertEquals("Mensagem", distEsperada , distResultado,0.001);
        //(-1,-5,-3) → (-1,-1,-1)
        p1 = new Ponto3D(-1,-5,-3);
        p2 = new Ponto3D(-1,-1,-1);
        distEsperada = 4.472;
        distResultado = p1.distancia(p2);
       assertEquals("Mensagem", distEsperada , distResultado,0.001);
        //(-1,-1,-1) → (-1,-5,-3)
        distResultado = p2.distancia(p1);
       assertEquals("Mensagem", distEsperada , distResultado,0.001);
    }

    /**
     * Test of equals method, of class Ponto3D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Ponto3D p1 = new Ponto3D(1,1,1);
        Ponto3D p2 = new Ponto3D(1,1,1);
        
        boolean res = p1.equals(p2);
        assertEquals(p1+"=="+p2,true,res);
        
        p1 = new Ponto3D(10,2,2);
        p2 = new Ponto3D(2,3,5);
        res = p1.equals(p2);
        assertEquals(p1+"=="+p2,false,res);
    }

    /**
     * Test of toString method, of class Ponto3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
     
        Ponto3D p1 = new Ponto3D(1,2,1);
        Ponto3D p2 = new Ponto3D(-1,-4,-2);
        
        String res1 = p1.toString();
        String esperado = "(1;2;1)";
        assertEquals("Mensagem" ,esperado,res1);
        
        res1 = p2.toString();
        esperado = "(-1;-4;-2)";
        assertEquals("Mensagem" ,esperado,res1);
    }

    /**
     * Test of clone method, of class Ponto3D.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Ponto3D p1 = new Ponto3D(5,2,-8);
        Ponto3D clone = p1.clone();
        
        
        assertTrue("Mensagem", p1.equals(clone));
        
    }
    
}
