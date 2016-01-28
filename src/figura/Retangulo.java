package figura;

import primitivas.Ponto2D;

public class Retangulo {
    private Ponto2D canto;
    private int largura;
    private int altura;
    
    public Retangulo() {
        largura = 1;
        altura = 1;
        canto = new Ponto2D();
    }
    public Retangulo(int largura, int altura, Ponto2D canto) {
        this.largura = largura;
        this.altura = altura;
        this.canto = canto.clone();
    }
    
    public void defineLargura(int largura) {
        this.largura = largura;
    }
    public void defineAltura(int altura) {
        this.altura = altura;
    }
    
    public void defineCanto(Ponto2D canto ) {
        this.canto = new Ponto2D(canto.obterX(), canto.obterY());
    }
    public int obterLargura() {
        return largura;
    }
    public int obterAltura() {
        return altura;
    }
    
    public Ponto2D obterCanto() {
        return canto;
    }
    
    public double obterArea() {
        return largura*altura;
    }
    
    public double obterPerimetro() {
        return 2*largura + 2*altura;
    }
    @Override
    public String toString() {
        return "Retangulo: Canto "+canto+" Dimensões (" + largura + "x" + altura + ")";
    }
    
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