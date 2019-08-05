package design.pattern.adapter;
/**
 * @Author chungaochen
 * @Description 目标接口：
 * 当前系统业务所期待的接口，它可以是抽象类或接口。
 * 需要能够使用系统现有的组件接口Adaptee
 * @Date 16:51 16:51
 * @Param
 * @return
 **/
public interface Target
{
    public void request();
}