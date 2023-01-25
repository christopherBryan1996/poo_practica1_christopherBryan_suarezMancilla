package mx.com.gm.figuaras;

public class Triangle {
    float a,b,c;
    
    public void perimetro (){
        float result=0;
        if (b == 0 && c == 0){
            result = 3*a;
        }else if(b != 0 && c == 0){
            result = 2*a+b;
        }else if(b != 0 && c != 0){
            result = a+b+c;
        }
        System.out.println("Perimetro del triangulo: "+ result);
    }
    public void area(){
        double result = 0;
        if (b == 0 && c == 0){
            double a2 = Math.pow(a, 2);
            result = (Math.sqrt(3)/4)*a2;
        }else if(b != 0 && c != 0 && a == 0){
            result = b*c/2;
        }
        System.out.println("Area del triangulo: "+ result);
    }
}
