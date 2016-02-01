package primitivas;

public class Ponto3D extends Ponto2D {
    
    protected int z;
    
    public Ponto3D() {
        
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Ponto3D(int x, int y, int z) {
        
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int obterZ() {
        
        return z;
    }
    public void definirZ(int z) {
        
        this.z = z;
    }
    public double distancia(Ponto3D p) {
        
        double x1 = this.x;
        double y1 = this.y;
        double z1 = this.z;
        double x2 = p.x;
        double y2 = p.y;
        double z2 = p.z;
        double t1 = (x2 - x1) * (x2 - x1);
        double t2 = (y2 - y1) * (y2 - y1);
        double t3 = (z2 - z1) * (z2 - z1);
        double distancia = 0;
        
        distancia = Math.sqrt((t1) + (t2) + (t3));
        
        return distancia;
    }
    public boolean equals(Ponto3D p) {
        
        boolean res = false;
        
        if(this.x == p.x && this.y == p.y && this.z == p.z) {
            
            res = true;
        }
        
        return res;
    }
    @Override
    public String toString() {
        
        return "Coordenadas: " +this.x+";"+this.y+";"+this.z;
    }
    public Ponto3D clone() {
        
        Ponto3D p2 = new Ponto3D(this.x,this.y,this.z);
        
        return p2;
    }

    void defineZ(int z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
