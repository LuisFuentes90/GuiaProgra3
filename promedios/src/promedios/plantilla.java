package promedios;

import java.util.Scanner;

public class plantilla {
         
    public void ingresoDeNotas(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de la guia: ");
        double notaGuia = leer.nextDouble();
        double guia = calcularNotaGuia(notaGuia);
        
        System.out.println("Ingrese la nota del control de lectura: ");
        double notaLectura = leer.nextDouble();
        double lectura = calcularNotaLectura(notaLectura);
        
        System.out.println("Ingrese la nota del parcial: ");
        double notaParcial = leer.nextDouble();
        double parcial = calcularNotaParcial(notaParcial);
        
        
        double promedioFinal = CalcularPromedio(guia, lectura, parcial);
        
        MostrarResultado(promedioFinal);
    }
    
    public double calcularNotaGuia(double nota){
        
        double promGuia = nota * 0.3;
        return promGuia;
    }
    
    public double calcularNotaLectura(double nota){
        
        double promLect = nota * 0.1;
        return promLect;
    }
    
    public double calcularNotaParcial(double nota){
        
        double promParcial = nota * 0.6;
        return promParcial;
    }
    
    public double CalcularPromedio(double guia, double lectura, double parcial){
        double promedio = guia + lectura + parcial;
        return promedio;
    }

    public void MostrarResultado(double promedio){
        
        System.out.println("El promedio de su evaluacion es de " + promedio);
        if(promedio >= 6){
            System.out.println("EVALUACION APROBADA!");
        }else{
            System.out.println("EVALUACION REPROBADA");
        }
    }
    
}