package design.pattern.templatemethod.impl;

import design.pattern.templatemethod.AbstractClass;

/**
 * @className ConcreteClass
 * @Description 具体子类（Concrete Class）板球运动：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 * @Author chungaochen
 * Date 2019/7/30 16:10
 * Version 1.0
 **/
public class ConcreteClass extends AbstractClass {

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

}