package design.pattern.facade.impl;

import design.pattern.facade.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}