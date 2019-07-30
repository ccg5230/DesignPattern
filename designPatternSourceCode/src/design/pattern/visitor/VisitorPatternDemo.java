package design.pattern.visitor;

import design.pattern.visitor.impl.Computer;
import design.pattern.visitor.impl.ComputerPartDisplayVisitor;

/**
 * @className VisitorPatternDemo
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 16:49
 * Version 1.0
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {

        Element computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}