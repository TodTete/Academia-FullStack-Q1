package com.bootcamp.week2.Ejercicios.Builder_5;

// ===== Decorator =====
public abstract class PizzaDecorator implements PizzaOrder {

    protected final PizzaOrder wrapped;

    PizzaDecorator(PizzaOrder wrapped) {
        this.wrapped = wrapped;
    }
}

