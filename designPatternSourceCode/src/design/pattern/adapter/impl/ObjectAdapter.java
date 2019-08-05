package design.pattern.adapter.impl;

import design.pattern.adapter.Adaptee;
import design.pattern.adapter.Target;

/**
 * @className ObjectAdapter
 * @Description 对象适配器（Adapter）类：
 * 它是一个转换器，通过引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * @Author chungaochen
 * Date 2019/8/5 16:38
 * Version 1.0
 **/
public class ObjectAdapter implements Target {

    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee=adaptee;
    }

    @Override
    public void request() { //适配系统老的接口
        adaptee.specificRequest();
    }
}