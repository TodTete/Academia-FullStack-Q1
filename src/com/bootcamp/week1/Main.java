package com.bootcamp.week1;

import java.util.ArrayList;

abstract class BootcampMember {

    String name, email;

    public BootcampMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();
}

interface Gradeable {
    double getGrade();
    boolean isPassing();
}

class Stundet extends BootcampMember implements Gradeable{

    double grade;

    public Stundet(String name, String email, double grade) {
        super(name, email);
        this.grade = grade;
    }

    public String getRole() { return "Estudiante"; }
    public double getGrade() { return grade; }
    public boolean isPassing() { return grade >= 0; }
}

class Instructor2 extends BootcampMember {

    public Instructor2(String name, String email) {
        super(name, email);
    }

    public String getRole() { return "Instructor"; }

}

public class Main {
    public static void main(String[] args) {

        ArrayList<BootcampMember> list = new ArrayList<>();

        list.add(new Stundet("Ricardo" , "tete@gmail.com", 8));
        list.add(new Stundet("Luis" , "luis@gmail.com", 3));
        list.add(new Instructor2("Enrique S.F." , "enriqs.f@gmail.com"));

        for (BootcampMember m : list) {
            System.out.println(m.name + " -> " + m.getRole() );
        }

    }
}