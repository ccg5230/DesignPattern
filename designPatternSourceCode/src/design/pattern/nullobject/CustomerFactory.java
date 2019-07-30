package design.pattern.nullobject;

import design.pattern.nullobject.impl.NullCustomer;
import design.pattern.nullobject.impl.RealCustomer;

/**
 * @className CustomerFactory
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:50
 * Version 1.0
 **/
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}