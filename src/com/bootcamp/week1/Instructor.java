package com.bootcamp.week1;

public class Instructor  {

  String name, specialty;
  int yearsExperience;
  double rating;

    public Instructor() {
        this("Unknown", "None", 0, 0.0);
    }

    public Instructor(String name, String specialty, int yearsExperience, double rating) {
        this.name = name;
        this.specialty = specialty;
        this.yearsExperience = yearsExperience;
        this.rating = rating;
    }

    public void promote(){
        rating += 0.5;
    }

    public void promote(double bonus){
        rating += bonus;
    }

    public static String compareByExperience(Instructor a, Instructor b){
        return (a.yearsExperience > b.yearsExperience) ? a.name : b.name;
    }

    public static void main(String[] args) {

        Instructor a = new Instructor("Ricardo", "Java", 1, 3.5);
        Instructor b = new Instructor("Luis", "C", 3, 4.5);

        a.promote();
        b.promote(1.0);

        System.out.println("Mas experimentado: " + compareByExperience(a, b));
    }
}