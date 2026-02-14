package com.bootcamp.week1;

public class StudentEmailGenerator {
    public static void main(String[] args) {
        String[] nombres = {
                "Ana Maria Garcia Lopez",
                "Juan Carlos Rodriguez Perez",
                "Sofia Fernandez Gomez",
                "Luis Alberto Martinez Sanchez",
                "Maria Jose Hernandez Diaz"
        };

        StringBuilder data = new StringBuilder();
        int contador = 0;

        for (String nombre : nombres){
            String[] parts = nombre.split(" ");
            String email = (parts[0] + "." + parts[2] + "@bootcamp.edu").toLowerCase();

            data.append("Nombre completo: ").append(nombre)
                    .append(" Email: ").append(email)
                    .append(" Longitud del email: ").append(email.length())
                    .append("\n");

            if (email.length() > 20) contador++;
        }

        data.append("Cantidad de emails con longitud mayor a 20 caracteres: ").append(contador);

        System.out.println(data.toString());
    }
}
