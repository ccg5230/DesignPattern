package design.pattern.visitor.impl;

import design.pattern.visitor.Visitor;

/**
 * @className ComputerPartDisplayVisitor
 * @Description 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * @Author chungaochen
 * Date 2019/7/30 16:37
 * Version 1.0
 **/
public class ComputerPartDisplayVisitor implements Visitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}