package design.pattern.Singleton;

/**
 *  Double Check Lock概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，
 *  这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 *
 * 优点：线程安全；延迟加载；效率较高。
 */
public class SingletonDCL {

    private static volatile SingletonDCL instance;

    private SingletonDCL() {
    }

    /**
     * * getInstance 进行了两次判空,第一次判空是为了不必要的同步,第二次判空为了在instance 为 null 的情况下创建实例
     * * 既保证了线程安全且单例对象初始化后调用getInstance又不会进行同步锁判断
     * * <p>
     * * 优点:资源利用率高,效率高
     * * 缺点:第一次加载稍慢,由于java处理器允许乱序执行,偶尔会失败
     * *
     * * @return
     */
    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

}
