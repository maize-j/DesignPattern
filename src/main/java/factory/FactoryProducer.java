package factory;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName FactoryProducer
 * @date 2021/11/17 12:41
 */
public class FactoryProducer {
    public static Factory getFactory(int type){
        if(type == 1){
            return new DogFactory();
        }else{
            return new CatFactory();
        }
    }
}
