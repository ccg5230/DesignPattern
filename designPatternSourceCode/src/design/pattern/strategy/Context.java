package design.pattern.strategy;

/**
 * @className Context
 * @Description :环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 * @Author chungaochen
 * Date 2019/7/30 15:59
 * Version 1.0
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}