package design.pattern.observer;

import design.pattern.observer.impl.BinaryObserver;
import design.pattern.observer.impl.ConcreteSubject;
import design.pattern.observer.impl.HexaObserver;
import design.pattern.observer.impl.OctalObserver;

/**
 * @className ObserverPatternDemo
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:24
 * Version 1.0
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.notifyAllObservers();
    }
}