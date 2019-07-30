package design.pattern.strategy.impl;

import design.pattern.strategy.Strategy;

/**
 * @className OperationSubstract
 * @Description: 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * @Author chungaochen
 * Date 2019/7/30 15:58
 * Version 1.0
 **/
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}