package design.pattern.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator or=new Originator(); //发起人
        CareTaker cr=new CareTaker(); //管理者：不能对备忘录的内容进行访问与修改
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        cr.setMemento(or.createMemento()); //管理者保存备忘录：借助发起人创建备忘录
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        or.restoreMemento(cr.getMemento(0)); //发起人恢复备忘录：从管理者获取备忘录
        System.out.println("恢复状态:"+or.getState());
    }
}
