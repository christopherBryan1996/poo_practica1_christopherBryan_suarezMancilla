package mx.com.gm.figuaras;

public class Square {
    float base, altura;

    public Square() {};
    public void area(){
        float result = base * altura;
        System.out.println("Area del cuadrado: "+ result);
    }
    public void perimetro(){
        float result = base*2 + altura*2;
        System.out.println("Perimetro del cuadrado: "+ result);
    }
    
}
