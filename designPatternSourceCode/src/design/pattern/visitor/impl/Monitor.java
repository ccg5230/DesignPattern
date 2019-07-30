package design.pattern.visitor.impl;

import design.pattern.visitor.Element;
import design.pattern.visitor.Visitor;

/**
 * @className Monitor
 * @Description
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，
 * 另外具体元素中可能还包含本身业务逻辑的相关操作。
 * @Author chungaochen
 * Date 2019/7/30 16:40
 * Version 1.0
 **/
public class Monitor implements Element {//显示器

    @Override
    public void accept(Visitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}