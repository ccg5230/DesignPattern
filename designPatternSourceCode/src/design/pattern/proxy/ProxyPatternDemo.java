package design.pattern.proxy;

import design.pattern.proxy.impl.ProxyImage;
import design.pattern.proxy.impl.RealImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage(new RealImage("test_10mb.jpg"));

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
