package com.bootcamp.week1;

public class CourseGrader {
    public static void main(String[] args) {

        double[] calificaciones = {9.5, 8.1, 7.1, 6.8, 5.9};
        double suma = 0;
        int contador = 0;

        for(double i : calificaciones){
             if( i == 0)continue;

            if(i >= 9 && i <= 10) System.out.println("Excelente");
            else if(i >= 7 && i <= 8.9) System.out.println("Bueno");
            else if(i >= 6 && i <= 6.9) System.out.println("Aprobado");
            else if(i < 6) System.out.println("Reprobado");

            suma += i;
            contador++;
        }

        double promedio = (double) suma / contador;
        String total = (promedio >= 7) ? "Aprueba" : "Reprueba";

        System.out.println("El promedio de las calificaciones es: " + promedio);
        System.out.println("El Grupo " + total);
    }
}
