package design.pattern.prototype;

/**
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 主要解决：在运行期建立和删除原型。
 *
 * 何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。
 * 2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 * 3、为了避免创建一个与产品类层次平行的工厂类层次时。 4、当一个类的实例只能有几个不同状态组合中的一种时。
 *      建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *
 * 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。
 *
 * 关键代码： 1、实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()，在 .NET 中可以使用 Object 类的 MemberwiseClone()
 *      方法来实现对象的浅拷贝或通过序列化的方式来实现深拷贝。
 *      2、原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。
 *
 * 应用实例： 1、细胞分裂。 2、JAVA 中的 Object clone() 方法。
 *
 * 优点： 1、性能提高。 2、逃避构造函数的约束。
 *
 * 缺点： 1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，
 *      特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
 * 2、必须实现 Cloneable 接口。
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}