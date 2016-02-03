package figura;

import primitivas.Ponto2D;

/**
 * Esta classe permite defenir o canto, a largura e a altura
 * @author BM e NL
 * @version 1
 */

public class Retangulo {
    private Ponto2D canto;
    private int largura;
    private int altura;
    
    /**
     * Define a largura e altura com o valor 1,<br>
     * o canto é criado apartir do Ponto2D.
     */
    
    public Retangulo() {
        largura = 1;
        altura = 1;
        canto = new Ponto2D();
    }
    /**
     * 
     * @param largura o valor da largura 
     * @param altura o valor da altura
     * @param canto o valor do canto é clonado
     */
    public Retangulo(int largura, int altura, Ponto2D canto) {
        this.largura = largura;
        this.altura = altura;
        this.canto = canto.clone();
    }
    /**
     * Altera o valor da largura do retangulo
     * @param largura toma o valor da largura
     */
    public void defineLargura(int largura) {
        this.largura = largura;
    }
    /***
     * Altera o valor da altura do retangulo
     * @param altura toma o valor da altura
     */
    public void defineAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Altera o valor do cantoX e do cantoY do retangulo
     * @param canto toma o valor de cantoX e cantoY
     */
    public void defineCanto(Ponto2D canto ) {
        this.canto = new Ponto2D(canto.obterX(), canto.obterY());
    }
    /**
     * Devolve o valor da largura
     * @return valor inteiro da largura
     */
    public int obterLargura() {
        return largura;
    }
    /**
     * Devolve o valor da altura
     * @return valor inteiro da altura
     */
    public int obterAltura() {
        return altura;
    }
    /**
     * Devolve o valor do canto
     * @return valor Ponto2D do canto
     */
    public Ponto2D obterCanto() {
        return canto;
    }
    /**
     * Faz a largura*altura
     * @return devolve o valor da area 
     */
    public double obterArea() {
        return largura*altura;
    }
    /**
     * Faz 2*largura + 2*altura
     * @return devolve o perimetro do retangulo
     */
    public double obterPerimetro() {
        return 2*largura + 2*altura;
    }
    /**
     * Da o valor ao cantoX e cantoY
     * @return devolve o valor do cantoX e cantoY
     */
    @Override
    public String toString() {
        return "Retangulo: Canto "+canto+" Dimensões (" + largura + "x" + altura + ")";
    }
    /**
     * Verifica se os cantos estam no retangulo
     * @param p é o que verifica se iziste os cantosX e cantosY
     * @return mostra se isiste o pomto se nao é false
     */
    public boolean estaDentro(Ponto2D p) {
        boolean res = false;
        if (canto.obterX() > p.obterX() && canto.obterX() + largura < p.obterX()) {
            if (canto.obterY() > p.obterY() && canto.obterY() + altura < p.obterY()) {
                res = true;
            }
        }
        return res;
    }
}