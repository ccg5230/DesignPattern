package design.pattern.observer.impl;

import design.pattern.observer.Observer;
import design.pattern.observer.Subject;

/**
 * @className HexaObserver
 * @Description:
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 * @Author chungaochen
 * Date 2019/7/30 15:22
 * Version 1.0
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("具体观察者HexaObserver作出反应！");
    }
}