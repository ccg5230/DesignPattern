package design.pattern.visitor;

/**
 * @className Element
 * @Description 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 * @Author chungaochen
 * Date 2019/7/30 16:34
 * Version 1.0
 **/
public interface Element
{
    void accept(Visitor visitor);
}