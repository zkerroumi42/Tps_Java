package Tp_2.Ex1;

public abstract class forme {
    private float x;
    private float y;
    public forme(){
        x=y=0;
    };
    public forme(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public forme deplacer(forme f,float dx,float dy){
        f.x=this.x+dx;
        f.y=this.y+=dy;
        return f;
    }
    public abstract double surface();
    public abstract double perimeter();
}
