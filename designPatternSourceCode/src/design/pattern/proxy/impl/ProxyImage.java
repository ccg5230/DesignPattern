package design.pattern.proxy.impl;

import design.pattern.proxy.Image;

public class ProxyImage implements Image {
    //接收保存目标对象
    private Image target;

    public ProxyImage(Image target){
        this.target=target;
    }

    @Override
    public void display() {
        System.out.println("静态代理开始事务...");
        target.display();
        System.out.println("静态代理提交事务...");
    }
}