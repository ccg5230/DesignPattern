package design.pattern.state;

/**
 * @className Context
 * @Description:
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象
 * @Author chungaochen
 * Date 2019/7/30 15:31
 * Version 1.0
 **/
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}