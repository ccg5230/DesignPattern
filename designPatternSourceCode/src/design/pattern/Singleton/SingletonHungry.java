package design.pattern.singleton;

/**
 * 饿汉式（静态常量）
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 *
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class SingletonHungry {
    /*
     * 饿汉式是在声明的时候就已经初始化Singleton1,确保了对象的唯一性
     *
     * 声明的时候就初始化对象会浪费不必要的资源
     * */
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    // 通过静态方法或枚举返回单例对象
    public SingletonHungry getInstance() {
        return instance;
    }

}
