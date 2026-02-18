package com.bootcamp.week1.Ejercicios;

import java.util.ArrayList;

public class Ejercicio_5   {
    private String nombre;
    private String matricula;
    private ArrayList<Double> calificaciones;

    //TODO: constructor
    public Ejercicio_5(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = new ArrayList<Double>();
    }

    //TODO: getters
    public String getNombre(){ return this.nombre; }
    public String getMatricula(){ return this.matricula; }

    //TODO: agregar calificacion con validacion
    public void agregarCalificacion(double cal){
        if(cal >= 0 && cal <= 100){ //validar rango 0-100
            calificaciones.add(cal);
        }else{
            System.out.println("Calificación inválida: " + cal);
        }
    }

    //TODO: calcular promedio
    public double calcularPromedio() {
        if (calificaciones.isEmpty()) return 0.0;
        double suma = 0;
        //TODO: sumar todas las calificaciones
        for(double cal : calificaciones){
            suma += cal;
        }
        return suma / calificaciones.size();
    }

    @Override
    public String toString() {
        return String.format(
                "Estudiante{nombre='%s', matricula='%s', promedio=%.2f}",
                nombre, matricula, calcularPromedio());
    }

    public static void main(String[] args){
        Ejercicio_5 e1 = new Ejercicio_5("Ana Garcia", "A001");
        Ejercicio_5 e2 = new Ejercicio_5("Carlos Lopez", "A002");
        Ejercicio_5 e3 = new Ejercicio_5("Maria Torres", "A003");

        e1.agregarCalificacion(95);
        e1.agregarCalificacion(88);
        e1.agregarCalificacion(92);

        e2.agregarCalificacion(78);
        e2.agregarCalificacion(85);
        e2.agregarCalificacion(90);

        e3.agregarCalificacion(100);
        e3.agregarCalificacion(96);
        e3.agregarCalificacion(98);

        ArrayList<Ejercicio_5> lista = new ArrayList<>();
        lista.add(e1); lista.add(e2); lista.add(e3);

        System.out.println("=== Lista de Estudiantes ===");
        Ejercicio_5 mejor = lista.get(0);
        for (Ejercicio_5 e : lista) {
            System.out.println(e);
            // TODO: actualizar 'mejor' si e tiene mayor promedio
            if(e.calcularPromedio() > mejor.calcularPromedio()){
                mejor = e;
            }
        }
        System.out.println("\nMejor promedio: " + mejor.getNombre()
                + " (" + String.format("%.2f", mejor.calcularPromedio())
                + ")");
    }
}
