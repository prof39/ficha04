package primitivas;
/**
 * Classe para trabalhar com pontos em tres dimensões
 * @author NL e BM
 * @version 1
 */
public class Ponto3D extends Ponto2D {
    
    protected int z;
    
    public Ponto3D() {
        
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    /**
     * Atribuimos valores a cada coodenada
     * @param x toma o valor de x
     * @param y toma o valor de y
     * @param z toma o valor de z
     */
    public Ponto3D(int x, int y, int z) {
        
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * Devolve o valor de obterZ
     * @return o valor inteiro de z
     */
    public int obterZ() {
        
        return z;
    }
    /**
     * Altera o valor de definirZ
     * @param z toma o valor de z
     */
    public void definirZ(int z) {
        
        this.z = z;
    }
    /**
     * Vamos dar um valor a destancia
     * @param p damos varias coordenadas
     * @return da o valor de destancia
     */
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
    /**
     * Vamos fazer equals do Ponto3D
     * @param p utilizamos as coordenadas que foram dados anteriormente
     * @return mostra o resto
     */
    public boolean equals(Ponto3D p) {
        
        boolean res = false;
        
        if(this.x == p.x && this.y == p.y && this.z == p.z) {
            
            res = true;
        }
        
        return res;
    }
    /**
     * Vamos testar as cordenadas
     * @return mostra as cordenadas
     */
    @Override
    public String toString() {
        
        return "("+this.x+";"+this.y+";"+this.z+")";
    }
    /**
     * Vamos faser um clone das cordenadas do ponto p2
     * @return mostra o valor do ponto p2
     */
    public Ponto3D clone() {
        
        Ponto3D p2 = new Ponto3D(this.x,this.y,this.z);
        
        return p2;
    }    
}
