package design.pattern.adapter;

/**
 * @className Adaptee
 * @Description 适配者（Adaptee）类：现存组件库中的组件接口,要将它适配成用户所期待的。
 * @Author chungaochen
 * Date 2019/8/5 16:32
 * Version 1.0
 **/
public class Adaptee {

    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}