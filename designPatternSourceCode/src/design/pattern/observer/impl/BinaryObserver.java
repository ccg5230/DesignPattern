package design.pattern.observer.impl;

import design.pattern.observer.Observer;
import design.pattern.observer.Subject;

/**
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("具体观察者BinaryObserver作出反应！");
    }
}
