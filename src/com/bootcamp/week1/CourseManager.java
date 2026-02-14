package com.bootcamp.week1;

import java.util.ArrayList;

public class CourseManager {


    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> grados = new ArrayList<>();

        nombres.add("Ana"); grados.add(9.5);
        nombres.add("Carlos"); grados.add(5.2);
        nombres.add("Lucia"); grados.add(8.1);
        nombres.add("Pedro"); grados.add(6.9);
        nombres.add("Sofia"); grados.add(4.5);
        nombres.add("Mario"); grados.add(7.8);

        double max = -1, min = 11, sum = 0;
        String best = "", worst = "";

        for (int i = 0; i < grados.size(); i++) {
            double g = grados.get(i);

            if (g > max) { max = g; best = nombres.get(i); }
            if (g < min) { min = g; worst = nombres.get(i); }

            sum += g;
        }

        System.out.println("Best: " + best);
        System.out.println("Worst: " + worst);
        System.out.println("Average: " + (sum / grados.size()));

        for (int i = grados.size() - 1; i >= 0; i--) {
            if (grados.get(i) < 6) {
                nombres.remove(i);
                grados.remove(i);
            }
        }

        System.out.println("Approved students: " + nombres);
    }

}