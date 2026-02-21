package com.bootcamp.week2.Ejercicios.Observer_6;

public class EmailStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] Enviando: " + message);
    }
}
