package design.pattern.builder;

/**
 * 食物条目接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
