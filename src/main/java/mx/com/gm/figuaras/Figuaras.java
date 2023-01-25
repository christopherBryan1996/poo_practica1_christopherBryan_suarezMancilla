/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.com.gm.figuaras;

/**
 *
 * @author manci
 */
public class Figuaras {

    public static void main(String[] args) {
        Square square = new Square();
        square.altura =1;
        square.base = 1;
        square.area();
        square.perimetro();
        System.out.println("----------------------------------------");
        
        square.altura =1.2f;
        square.base = 2;
        square.area();
        square.perimetro();
        System.out.println("----------------------------------------");
        
        square.altura =4f;
        square.base = 99.5f;
        square.area();
        square.perimetro();
        System.out.println("----------------------------------------");
        
        Circle circle = new Circle();
        circle.radio=2;
        circle.area();
        circle.perimetro();
        System.out.println("----------------------------------------");
        
        circle.radio=99.5f;
        circle.area();
        circle.perimetro();
        System.out.println("----------------------------------------");
        
        Triangle triangle = new Triangle();
        triangle.a=10;
        triangle.perimetro();
        triangle.area();
        System.out.println("----------------------------------------");
        
        triangle.a=0;
        triangle.b = 3;
        triangle.c = 4;
        triangle.perimetro();
        triangle.area();
        System.out.println("----------------------------------------");
        
        
    }
}
