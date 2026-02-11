package com.bootcamp.week1;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentCard {

    static void main() {
        Scanner in = new Scanner(System.in);
        String name, favLanguage; //Variable para almacenar el nombre y el lenguaje favorito
        int age; //Variable para almacenar la edad

        System.out.print("Enter your name: ");
        name = in.nextLine(); //Leer el nombre completo

        System.out.print("Enter your age: ");
        age = in.nextInt(); //Leer la edad
        in.nextLine();

        System.out.print("Enter your favorite programming language: ");
        favLanguage = in.nextLine(); //Leer el lenguaje favorito

        LocalDate today = LocalDate.now(); //Obtenemos la fecha actual

        int width = 32; //Ancho fijo para el formato de la tarjeta
        System.out.println("*".repeat(width)); //Imprimir la línea superior de asteriscos

        System.out.println("* " + "Name: " + name
                + " ".repeat(width - ("* Name: ".length() + name.length() + 1)) + "*");
        //Imprimir el nombre con formato
        System.out.println("* " + "Age: " + age
                + " ".repeat(width - ("* Age: ".length() + String.valueOf(age).length() + 1)) + "*");

        System.out.println("* " + "Fav Language: " + favLanguage
                + " ".repeat(width - ("* Fav Language: ".length() + favLanguage.length() + 1)) + "*");

        System.out.println("* " + "Date: " + today
                + " ".repeat(width - ("* Date: ".length() + today.toString().length() + 1)) + "*");

        System.out.println("*".repeat(width));
    }
}