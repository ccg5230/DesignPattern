package design.pattern.abstractfactory.impl;

import design.pattern.abstractfactory.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}