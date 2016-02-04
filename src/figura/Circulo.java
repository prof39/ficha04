package figura;

import primitivas.Ponto2D;

/**
 * Esta classe permite definir, obter o raio e o centro, <br>
 * e mostra o valor do perimetro, da área do circulo. <br>
 * Por fim diz se o p (ponto) está dentro ou fora do circulo.
 *
 * @author BM e NL
 * @version 1
 */
public class Circulo {

    Ponto2D centro;
    int raio;

    /**
     * No construtor cria um novo centro através do Ponto2D. <br>
     */
    public Circulo() {
        centro = new Ponto2D();
        raio = 0;
    }

    /**
     * @param centro foi colonado.
     * @param raio toma o valor do raio.
     */
    public Circulo(Ponto2D centro, int raio) {
        this.centro = centro.clone();
        this.raio = raio;
    }

    /**
     *Define o Centro
     * @param centro passa ter um clone
     */
    public void defineCentro(Ponto2D centro) {
        this.centro = centro.clone();
    }

    /**
     * Altera o valor do raio do circulo
    
     * @param raio toma o valor do raio
     */
    public void defineRaio(int raio) {
        this.raio = raio;
    }

    /**
     * Devolve o centro
     *
     * @return devolve o objeto do Ponto2D do centro
     */
    public Ponto2D obterCentro() {
        return centro;
    }

    /**
     * Devolve o valor do raio
     *
     * @return valor inteiro do raio
     */
    public int obterRaio() {
        return raio;
    }

    /**
     * Devolve o valor da área
     *
     * @return devolve o valor da área do circulo
     */
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    /**
     * Devolve o perimetro
     *
     * @return devolve o perimetro do circulo
     */
    public double obterPerimetro() {
        return 2 * Math.PI * raio;
    }

    /**
     * Dá o valor do centro e do raio de um circulo
     *
     * @return devolve o valor do centro e do raio
     */
    @Override
    public String toString() {
        return "Circulo: Centro " + centro + " Raio " + raio;
    }

    /**
     * Verifica se o ponto esta dentro do circulo
     *
     * @param p é o ponto que é verificado se está dentro ou fora de um circulo
     * @return se está dentro ou fora
     */
    public boolean estaDentro(Ponto2D p) {
        return (centro.distancia(p) < raio);
    }
}
