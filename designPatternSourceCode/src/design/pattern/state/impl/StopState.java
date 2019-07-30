package design.pattern.state.impl;

import design.pattern.state.Context;
import design.pattern.state.State;

/**
 * @className StopState
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:30
 * Version 1.0
 **/
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}