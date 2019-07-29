package design.pattern.abstractfactory.impl;

import design.pattern.abstractfactory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
