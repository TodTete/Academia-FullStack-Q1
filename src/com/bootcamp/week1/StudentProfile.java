package com.bootcamp.week1;

public class StudentProfile {

    public static void main(String[] args) {

        byte edad = 22;
        int ID = 1;
        long telefono = 1234567890L;
        float promedioParcial = 85.5f;
        double promedioFinal = 90.75;
        char seccion = 'B';
        boolean becado = true;
        String nombre = "Juan Perez";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " Byte : " + Byte.BYTES + "bytes");
        System.out.println("ID: " + ID + " Int : " + Integer.BYTES + "bytes");
        System.out.println("Teléfono: " + telefono + " Long : " + Long.BYTES + "bytes");
        System.out.println("Promedio Parcial: " + promedioParcial + " Float : " + Float.BYTES + "bytes");
        System.out.println("Promedio Final: " + promedioFinal + " Double : " + Double.BYTES + "bytes");
        System.out.println("Sección: " + seccion + " Char : " + Character.BYTES + "bytes");
        System.out.println("Becado: " + becado);

    }
}
