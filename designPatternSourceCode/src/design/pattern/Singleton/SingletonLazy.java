package design.pattern.Singleton;

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 *
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    /*
     * getInstance 添加了synchronized 关键字,,也就是说 getInstance 是一个同步方法,
     * 这就是懒汉式在多线程中保持唯一性的方式
     *
     * 懒汉式存在的问题是,即是instance已经被创建,每次调用getInstance方法还是会同步,这样就会浪费一些不必要的资源
     * */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
