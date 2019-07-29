package design.pattern.proxy;

import design.pattern.proxy.impl.UserDao;

public class DynamicproxyDemo {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();

        //cglib代理模式============================================================
        // 生成 Cglib 代理类
        CglibProxyTarget cglibProxy = (CglibProxyTarget) new CglibProxyFactory(new CglibProxyTarget()).getProxyInstance();
        // 调用相关方法
        cglibProxy.eat();
        cglibProxy.work();//private方法不会被cglib增强处理
    }
}
