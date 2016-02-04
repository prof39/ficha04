package primitivas;

/**
 * Classe para trabalhar com linhas em duas dimensões
 *
 * @author gm
 */
public class Linha2D {

    private Ponto2D p1;
    private Ponto2D p2;
    private double declive;
    private boolean vertical;

    public Linha2D(Ponto2D p1, Ponto2D p2) throws IllegalArgumentException {

        if (p1.equals(p2)) {
            throw new IllegalArgumentException("Não é possível criar uma linha com dois pontos iguais");
        } 
        else {
            this.p1 = p1;
            this.p2 = p2;
        }
        verificaDeclive();
        if (vertical == false) {
            calcularDeclive();
        }
    }

    public Linha2D(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
        if (x1 == x2 && y1 == y2) {
            throw new IllegalArgumentException("Não é possível criar uma linha com dois pontos iguais");
        } 
        else {
            x1 = p1.x;
            x2 = p2.x;
            y1 = p1.y;
            y2 = p2.y;

        }
        if (x1 == x2) {
            vertical = true;
        } 
        else {
            vertical = false;

        }

        verificaDeclive();
        if (vertical == false) {
            calcularDeclive();
        }

    }

    private void verificaDeclive() {
        if (p1.x == p2.x) {
            vertical = true;
        } 
        else {
            vertical = false;
        }
    }

    private void calcularDeclive() {
        declive = (p1.y - p2.y) / (p1.x - p2.x);
    }

    public double obterDeclive() {
        return declive;
    }

    public boolean eVertical() {
        if (p1.x == p2.x) {
            vertical = true;
        } 
        else {
            vertical = false;
        }
        return vertical;
    }

    public boolean pertence(Ponto2D p) {
        boolean res = false;
        double m = declive;
        double b = p.y - m * p.x;
        if(eVertical() == true) {
            if(p1.x == p.x) {
                res = true;
            }
        }
        else if(p.y == m * p.x + b) {
            res = true;
        }
        return res;
    }

    public boolean paralela(Linha2D l) {
        boolean res = false;
        if (l.vertical == true && this.vertical == true) {
            res = true;
        } else if (l.vertical == true || this.vertical == true) {
            res = false;
        } else if (l.declive == this.declive) {

            res = true;

        }

        return res;            
    }

    public boolean perpendicular(Linha2D l) {
        boolean res = false;
        double a = 0;
        a = l.declive * this.declive;
        
        if(l.vertical == true && this.vertical == true){
            res = false;
        }
        else if(l.vertical == true && this.declive == 1){
            res = true;
        }
        else if(this.declive == 1 && l.vertical == true){
            res = true;
        }
        else if(a == -1) {
            res = true;
        }

        return res;
    }

    public boolean equal(Linha2D l) {
        
        return this.pertence(l.p1) && this.pertence(l.p2);
    }
}
