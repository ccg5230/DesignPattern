package design.pattern.templatemethod.impl;

import design.pattern.templatemethod.AbstractClass;

/**
 * @className Football
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 16:16
 * Version 1.0
 **/
public class Football extends AbstractClass {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }
}