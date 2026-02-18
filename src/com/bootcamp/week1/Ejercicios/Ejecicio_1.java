package com.bootcamp.week1.Ejercicios;
//Date: 11-02-2026
public class Ejecicio_1 {
    public static void main(String[] args){
        //TODO: Declarar variables
        String nombre = "Ricardo Vallejo";
        int edad = 22;
        double altura = 1.67;
        boolean esActivo = true;

        //TODO: Concatenacion con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad
                          + " anios, mido " + altura + "m y estoy "
                          + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        //TODO: Usando String.format()
        String mensaje2 = String.format(
                "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
                nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}
