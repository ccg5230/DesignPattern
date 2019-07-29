package design.pattern.builder.impl;

import design.pattern.builder.Burger;

/**
 * 素食汉堡
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}