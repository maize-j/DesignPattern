package factory;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName Client
 * @date 2021/11/17 12:29
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = FactoryProducer.getFactory(1);
        factory.someMethod();
    }
}
