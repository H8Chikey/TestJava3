package Sapteh;

public class Tringle extends Shape{

    private int H;
    private int Base;

    public Tringle(String color, int x, int y, int H, int Base){
        super(color, x, y);
        this.H = H;
        this.Base = Base;
    }

    public int getH() {
        return H;
    }
    public int getBase() {
        return Base;
    }

    public void setBase(int base) {
        Base = base;
    }
    public void setH(int h) {
        H = h;
    }

    @Override
    public double area(){
        return H * Base / 2;
    }

    @Override
    public String draw(){
        return "Draw tringle" ;
    }

    @Override
    public String toString(){
        return "Color " + super.getColor() + "\n" +
                "Coord x " + super.getX() + "\n"+
                "Coord y " + super.getY() + "\n"+
                "Heght " + getH() + "\n"+
                "Base " + getBase() + "\n" +
                "Area " + area() + "\n" +
                "Draw " + draw();
    }

}
