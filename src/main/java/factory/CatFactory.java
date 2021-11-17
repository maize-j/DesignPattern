package factory;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName CatFactory
 * @date 2021/11/17 12:28
 */
public class CatFactory extends Factory {

    @Override
    public Animal factoryMethod() {
        return new Cat();
    }
}
