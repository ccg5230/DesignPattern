package design.pattern.abstractfactory.impl;

import design.pattern.abstractfactory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
