package com.bootcamp.week3.Ejercicios.Uno;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Contact implements Comparable<Contact>{
    private String name, email, phone;


    public Contact(String name, String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o){
        //TODO: igualdad basada en email
        if (this == o) return true;
        if(!(o instanceof Contact c)) return false;
        return name.equals(c.name);
    }
}

class ConctactManager{
    private final Set<Contact> contacts = new TreeSet<>();

    public boolean addContact(Contact contact){
        //TODO: agregar al set. retornar true si se agrego
        return contacts.add(contact);
    }

    public Optional<Contact> findByEmail(String email){
        //TODO: buscar contacto por email usando stream + filter
        return contacts.stream()
                .filter( c -> c.getEmail().equals(email))
                .findFirst();
    }

}