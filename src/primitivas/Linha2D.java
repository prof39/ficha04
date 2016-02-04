package primitivas;

/**
 * Classe para trabalhar com linhas em duas dimensões
 * @author NL e BM
 * @version 1
 */
public class Linha2D {
    private Ponto2D p1;
    private Ponto2D p2;
    private double declive;
    private boolean vertical;
    
   /**
    * 
    * @param p1 toma o valor de p1
    * @param p2 toma o valor de p2
    * @throws IllegalArgumentException faz uma exeção
    */
    public Linha2D(Ponto2D p1, Ponto2D p2) throws IllegalArgumentException {
        
        if(p1.equals(p2)) {
            throw new IllegalArgumentException("Não é possível criar uma linha com dois pontos iguais");
        }
        else {
            this.p1 = p1;
            this.p2 = p2;
        }
        verificaDeclive();
        if ( vertical == false){
            calcularDeclive();
        }
    }
    /**
     * 
     * @param x1 toma o valor de p1.x
     * @param y1 toma o valor de p1.y
     * @throws IllegalArgumentException faz uma exeção
     */
    public Linha2D(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
       if(x1 == x2 && y1 == y2) {
            throw new IllegalArgumentException("Não é possível criar uma linha com dois pontos iguais");
        }
        else {
            x1 = p1.x;
            x2 = p2.x;
            y1 = p1.y;
            y2 = p2.y;
            
        }
        if(x1 == x2){
            vertical = true;
        }
        else {
            vertical = false;
            
        }
        
        verificaDeclive();
        if ( vertical == false){
            calcularDeclive();
        }
        
    }
    /**
     * Verifica se é verdadeiro ou false
     */
    private void verificaDeclive() {
       if(p1.x == p2.x){
            vertical = true;
        }
        else {
            vertical = false;
       }
    }
   /**
    * Verifica se as cordenadas dos pontos estão corretas
    */
    private void calcularDeclive() {
       declive = (p1.y - p2.y)/(p1.x - p2.x);
    }
   /**
    * Devolve o declive
    * @return devolve o valor de declive
    */
    public double obterDeclive() {
        return declive;
    }
    /**
     * Verifica se a linha é vertical
     * @return mostra a linha vertical
     */
    public boolean eVertical() {
        return vertical;
    }
    /**
     * Verifica se o resto é falso 
     * @param p mostra se pretence ao Ponto2D
     * @return mostra o resultado de res
     */
    public boolean pertence(Ponto2D p) {
        boolean res = false;
        
        return res;
    }
   /**
    * Verifica se o resto é falso
    * @param l mostra se é paralela a Linha2D
    * @return mostra o resultado do resto
    */
    public boolean paralela(Linha2D l) {
        boolean res = false;
        
        return res;
    }
    /**
     * Verifica se o resto é falso
     * @param l mostra se é prependicular a Linha2D
     * @return mostra o valor de resto
     */
    public boolean perpendicular(Linha2D l) {
        boolean res = false;
      
        return res;
    }
   /**
    * Verifica se o equal é a Linha2D
    * @param l mostra se equal faz parte da Linha2D
    * @return mostra o resultado falso
    */
    public boolean equal(Linha2D l) {
        return false;
    }
}
