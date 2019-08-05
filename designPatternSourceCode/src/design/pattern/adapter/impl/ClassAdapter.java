package design.pattern.adapter.impl;

import design.pattern.adapter.Adaptee;
import design.pattern.adapter.Target;

/**
 * @className ClassAdapter
 * @Description 类适配器（Adapter）类：
 * 它是一个转换器，通过继承适配者，把适配者接口转换成目标接口，
 * 让客户按目标接口的格式访问适配者。
 * <p>
 * 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口Target不兼容而不能一起工作的那些类Adeptee能一起工作。
 * 类适配器模式类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 * </p>
 *
 * @Author chungaochen
 * Date 2019/8/5 16:34
 * Version 1.0
 **/
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}