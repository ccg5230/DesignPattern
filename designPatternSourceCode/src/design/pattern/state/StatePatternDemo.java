package design.pattern.state;

import design.pattern.state.impl.StartState;
import design.pattern.state.impl.StopState;

/**
 * @className StatePatternDemo
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 15:33
 * Version 1.0
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}