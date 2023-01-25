package mx.com.gm.figuaras;

public class Circle {
    
    private final float PI= 3.1416f;
    float radio;
    
    public Circle(){};
    
    public void area(){
        float radio2 = (float) Math.pow(radio, 2);
        float result = PI*radio2;
        System.out.println("Area del circulo: " + result);
    }
    public void perimetro(){
        float result = 2*PI *radio;
        System.out.println("Perimetro del circulo: " + result);
        
    }
}
