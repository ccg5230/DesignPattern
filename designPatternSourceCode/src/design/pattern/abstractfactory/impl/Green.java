package design.pattern.abstractfactory.impl;

import design.pattern.abstractfactory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}