package design.pattern.visitor.impl;

import design.pattern.visitor.Element;
import design.pattern.visitor.Visitor;

/**
 * @className Computer
 * @Description
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，
 * 另外具体元素中可能还包含本身业务逻辑的相关操作。
 * @Author chungaochen
 * Date 2019/7/30 16:43
 * Version 1.0
 **/
public class Computer implements Element {
    Element[] parts;

    public Computer(){
        parts = new Element[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(Visitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}