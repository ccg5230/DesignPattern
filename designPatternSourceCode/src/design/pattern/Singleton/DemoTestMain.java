package design.pattern.Singleton;

public class DemoTestMain {
    public static void main(String[] args) {


        //获取唯一可用的对象
        SingletonLazy object = SingletonLazy.getInstance();

        //显示消息
        object.showMessage();
        //获取唯一可用的对象
        SingletonEnum singleton= SingletonEnum.INSTANCE;
    }
}
