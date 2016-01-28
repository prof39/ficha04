package primitivas;

/**
 * Classe para trabalhar com linhas em duas dimensões
 * @author gm
 */
public class Linha2D {
    private Ponto2D p1;
    private Ponto2D p2;
    private double declive;
    private boolean vertical;
    
   
    public Linha2D(Ponto2D p1, Ponto2D p2) throws IllegalArgumentException {
        
    }
    
    public Linha2D(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
       
    }
    
    private void verificaDeclive() {
      
    }
   
    private void calcularDeclive() {
       
    }
   
    public double obterDeclive() {
        return 0;
    }
    
    public boolean eVertical() {
        return false;
    }
    
    public boolean pertence(Ponto2D p) {
        boolean res = false;
        
        return false;
    }
   
    public boolean paralela(Linha2D l) {
        boolean res = false;
        
        return res;
    }
    
    public boolean perpendicular(Linha2D l) {
        boolean res = false;
      
        return res;
    }
   
    public boolean equal(Linha2D l) {
        return false;
    }
}
