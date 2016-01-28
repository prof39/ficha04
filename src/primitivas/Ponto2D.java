package primitivas;
/**
 * Classe Ponto2D é utilizada para representar 
 * pontos (x,y) com coordenadas de valor inteiro
 * @author nomedoautor
 */
public class Ponto2D {
    protected int x;
    protected int y;
    /**
     * Cria ponto com (0,0)
     */
    public Ponto2D() {
        x = 0;
        y = 0;
    }
    /**
     * Cria ponto com coordenadas x,y
     * @param x - valor da coordenada x
     * @param y - valor da coordenada y
     */
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Altera o valor de x
     * @param x - valor novo
     */
    public void defineX(int x) {
        this.x = x;
    }
    /**
     * Altera o valor de y
     * @param y - valor de y
     */
    public void defineY(int y) {
        this.y = y;
    }
    /**
     * Devolve a coordenada x
     * @return valor do x
     */
    public int obterX() {
        return x;
    }
    /**
     * Devolve a coordenada y
     * @return valor de y
     */
    public int obterY() {
        return y;
    }
    /**
     * Calcula a distância até outro ponto
     * @param p2 - segundo ponto para calcular a distância
     * @return distância até p2
     */
    public double distancia(Ponto2D p2) {
        //cálculo da distância com a fórmula:
        //dist = raiz ( (x2 - x1)^2 + (y2 - y2)^2 )
        double x1 = (p2.x - this.x) * (p2.x - this.x);
        double y1 = (p2.y - this.y) * (p2.y - this.y);
        return Math.sqrt(x1 + y1);
    }
    /**
     * Determina se o ponto é igual a p2
     * @param p2 - ponto a comparar
     * @return devolve true caso seja igual false caso contrário
     */
    public boolean equals(Ponto2D p2) {
        return (this.x == p2.x && this.y == p2.y);
    }
    /**
     * Devolve uma string com os valores
     * @return (x;y)
     */
    @Override
    public String toString() {
        return "("+ x +";"+ y +")";
    }
    /**
     * Cria uma cópia do ponto
     * @return novo objeto Ponto2D com as mesmas coordenadas
     */
    @Override
    public Ponto2D clone() {
        return new Ponto2D(x,y);
    }
}