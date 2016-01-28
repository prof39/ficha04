package figura;

import primitivas.Ponto2D;

public class Circulo  {
    private Ponto2D centro;
    private int raio;
    
    public Circulo() {
        centro = new Ponto2D();
        raio = 0;
    }
    public Circulo(Ponto2D centro, int raio) {
        this.centro = centro.clone();
        this.raio = raio;
    }
    public void defineCentro(Ponto2D centro) {
        this.centro = centro.clone();
    }
    public void defineRaio(int raio) {
        this.raio = raio;
    }
    public Ponto2D obterCentro() {
        return centro;
    }
    public int obterRaio() {
        return raio;
    }
    
    public double obterArea() {
        return Math.PI * raio * raio;
    }
    
    public double obterPerimetro() {
        return 2*Math.PI*raio;
    }
    @Override
    public String toString() {
        return "Circulo: Centro "+centro+ " Raio "+raio;
    }
    
    public boolean estaDentro(Ponto2D p) {
        return (centro.distancia(p) < raio);
    }
}