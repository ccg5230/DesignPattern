package design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void setMemento(Memento state){
        mementoList.add(state);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}