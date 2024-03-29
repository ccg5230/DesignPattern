package design.pattern.Command;

/**
 * 抽象命令角色类
 *
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 命令模式涉及到五个角色，它们分别是：
 * 　　客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者。
 * 　　命令(Command)角色：声明了一个给所有具体命令类的抽象接口。
 * 　　具体命令(ConcreteCommand)角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。
 *          execute()方法通常叫做执行方法。
 * 　　请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 * 　　接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 */
public interface Command  {
    void execute();
}
