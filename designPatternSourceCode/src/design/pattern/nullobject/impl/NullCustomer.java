package design.pattern.nullobject.impl;

import design.pattern.nullobject.AbstractCustomer;

/**
 * @className NullCustomer
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:48
 * Version 1.0
 **/
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}