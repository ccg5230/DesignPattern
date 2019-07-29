package design.pattern.builder.impl;

import design.pattern.builder.Packing;

/**
 * 瓶子包装
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}