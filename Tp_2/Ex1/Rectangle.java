package Tp_2.Ex1;

public class Rectangle extends forme{
    private float largeur;
    private float longueur;

    public Rectangle() {
        super();
        largeur =longueur= 0;
    }

    public Rectangle(float x, float y, float largeur, float longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public float getLongueur() {
        return longueur;
    }
    @Override
    public double surface() {
        return largeur * longueur;
    }
    @Override
    public double perimeter() {
        return 2 * (largeur + longueur);
    }

    public String toString() {
        return "Rectangle [x=+" + getX() + ",y=" + getY() + ",longueur=" + getLongueur() + "largeur=" + getLargeur() + "]";
    }
}

