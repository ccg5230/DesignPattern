package design.pattern.state.impl;

import design.pattern.state.Context;
import design.pattern.state.State;

/**
 * @className StartState
 * @Description:具体状态（Concrete    State）角色：实现抽象状态所对应的行为。
 * @Author chungaochen
 * Date 2019/7/30 15:30
 * Version 1.0
 **/
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}