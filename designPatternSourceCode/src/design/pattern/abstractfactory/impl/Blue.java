package design.pattern.abstractfactory.impl;

import design.pattern.abstractfactory.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
