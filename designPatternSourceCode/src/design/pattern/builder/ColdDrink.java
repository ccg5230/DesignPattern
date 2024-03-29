package design.pattern.builder;

import design.pattern.builder.impl.Bottle;

/**
 * 冷饮抽象类
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}