package design.pattern.facade.impl;

import design.pattern.facade.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
