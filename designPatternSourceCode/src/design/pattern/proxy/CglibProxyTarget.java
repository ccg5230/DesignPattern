package design.pattern.proxy;

/**
 * cglib代理目标对象,没有实现任何接口：
 * 代理的类不能为final,否则报错
 * 目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
 */
public class CglibProxyTarget {
    // 可以被代理
    public void eat() {
        System.out.println("工程师正在吃饭");
    }

    // final 方法不会被生成的字类覆盖
    public final void work() {
        System.out.println("工程师正在工作");
    }

    // private 方法不会被生成的字类覆盖
    private void play() {
        System.out.println("this engineer is playing game");
    }
}
