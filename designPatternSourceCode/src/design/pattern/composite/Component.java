package design.pattern.composite;

/**
 * 组合模式 (Component)
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。
 * 组合模式使得用户对单个对象和组合对象的使用具有唯一性。
 * 组合模式是一种结构型模式。
 *
 * 意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 * 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，
 * 从而使得客户程序与复杂元素的内部结构解耦。
 *
 * 何时使用： 1、您想表示对象的部分-整体层次结构（树形结构）。
 * 2、您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 *
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 *
 * 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int depth);
}