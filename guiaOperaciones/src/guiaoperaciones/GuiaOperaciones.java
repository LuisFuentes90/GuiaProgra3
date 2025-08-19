package guiaoperaciones;

import java.util.Scanner;

public class GuiaOperaciones {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        char clave;
        double resultado;
        
        System.out.println("Ingrese un numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Elija una clave:\n "
                + "'+' (para sumar)\n "
                + "'-' (para restar)\n "
                + "'*' (para multiplicar)\n "
                + "'/' (para dividir)\n "
                + "'R' (para sacar raiz)\n "
                + "'E' (Para elevar el primer numero con el segundo)");
        clave = teclado.next().charAt(0);
        
        switch(clave){
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es de: " + resultado);
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Numero erroneo, la division por cero no esta permitida");
                }else{
                    resultado = (double) num1 / num2;
                    System.out.println("El resultado de la division es de: " + resultado);
                }
                break;
            case 'R':
                double raizN1 = Math.sqrt(num1);
                double raizN2 = Math.sqrt(num2);
                System.out.println("La raiz de " + num1 + " es: " + raizN1);
                System.out.println("La raiz de " + num2 + " es: " + raizN2);
                break;
            case 'E':
                double elev = Math.pow(num1, num2);
                resultado = Math.round(elev * 1000.0) / 1000.0;
                System.out.println(num1 + " elevado a " + num2 + ": " + resultado);
                break;
            default:
                System.out.println("CLAVE INCORRECTA");
                break;
        }
    }
    
}
