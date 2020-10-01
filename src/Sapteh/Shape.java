package Sapteh;

public abstract class Shape {
    private String color;
    private int x;
    private int y;

    public Shape(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;

    }
    public String getColor() {
        return color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public abstract double area();
    public abstract String draw();

}
