package design.pattern.builder.impl;

import design.pattern.builder.ColdDrink;

/**
 * 冷饮：百事可乐
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}