package factory;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName Factory
 * @date 2021/11/17 12:16
 */
public abstract class Factory {
    abstract public Animal factoryMethod();
    public void someMethod(){
        Animal animal = factoryMethod();
        //对Animal的一些operation，或关于Animal实现类的通用方法
        //...
        animal.bark();
    }
}
