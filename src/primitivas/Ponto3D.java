package primitivas;

public class Ponto3D extends Ponto2D {
    protected int z;
    
    public Ponto3D() {
        
    }
    public Ponto3D(int x, int y, int z) {
        
    }
    public int obterZ() {
        return 0;
    }
    public void definirZ(int z) {
        
    }
    public double distancia(Ponto3D p) {
        return 0;
    }
    public boolean equals(Ponto3D p) {
        return false;
    }
    @Override
    public String toString() {
        return "";
    }
    public Ponto3D clone() {
        return null;
    }

    void defineZ(int z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}