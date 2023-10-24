package Tp_2.Ex1;

public class Cercle extends forme {
    private float rayon;

    public Cercle() {
        super();
        rayon = 0;
    }

    public Cercle(float x, float y, float r) {
        super(x, y);
        rayon = r;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public float getRayon() {
        return rayon;
    }
    @Override
    public double surface() {
        return 3.14 * rayon * rayon;
    }
    @Override
    public double perimeter() {
        return 2 * 3.14 * rayon;
    }
    public String toString() {
        return "Cercle [x=+" + getX() + ",y=" + getY() + ",rayon=" + getRayon()  + "]";
    }
}
