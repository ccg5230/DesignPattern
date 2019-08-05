package design.pattern.adapter;

import design.pattern.adapter.impl.ClassAdapter;
import design.pattern.adapter.impl.ObjectAdapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target targetObject = new ObjectAdapter(adaptee);
        targetObject.request();
    }
}