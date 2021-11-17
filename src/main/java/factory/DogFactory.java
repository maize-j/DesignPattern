package factory;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName DogFactory
 * @date 2021/11/17 12:27
 */
public class DogFactory extends Factory {
    @Override
    public Animal factoryMethod() {
        return new Dog();
    }
}
