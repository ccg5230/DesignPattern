package design.pattern.templatemethod;

import design.pattern.templatemethod.impl.ConcreteClass;
import design.pattern.templatemethod.impl.Football;

/**
 * @className TemplatePatternDemo
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 16:17
 * Version 1.0
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        AbstractClass game = new ConcreteClass();
        game.TemplateMethod();
        System.out.println();
        game = new Football();
        game.TemplateMethod();
    }
}