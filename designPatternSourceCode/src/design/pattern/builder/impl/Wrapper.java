package design.pattern.builder.impl;

import design.pattern.builder.Packing;

/**
 * 纸盒、纸袋包装
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
