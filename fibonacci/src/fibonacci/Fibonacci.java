package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;
        int num3;
        
        System.out.println("*****Sucesión de Fibonacci*****");
        System.out.print(num1+", "+num2+", ");
        for(int cont=1;cont<=18;cont++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print( num3+", ");
        }
        
    }
    
}
