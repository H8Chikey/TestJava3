package Sapteh;

import javax.imageio.IIOException;

public class Program {
    public static void main (String[] args) throws IIOException{
        Tringle Trangle = new Tringle("black", 0,0, 15,10);
        System.out.println(Trangle.toString());
    }
}
