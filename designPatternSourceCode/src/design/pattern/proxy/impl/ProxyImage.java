package design.pattern.proxy.impl;

import design.pattern.proxy.Image;

public class ProxyImage implements Image {
    //接收保存目标对象
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}