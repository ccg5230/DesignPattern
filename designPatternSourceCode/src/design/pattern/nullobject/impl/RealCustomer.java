package design.pattern.nullobject.impl;

import design.pattern.nullobject.AbstractCustomer;

/**
 * @className RealCustomer
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:48
 * Version 1.0
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}