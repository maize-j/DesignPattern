package prototype;

/**
 * TODO
 *
 * @author 苞谷洁子
 * @ClassName prototype.ConcretePrototype
 * @date 2021/3/24 16:57
 */
public class ConcretePrototype extends Prototype {
    private String filed;
    public ConcretePrototype(String filed){
        this.filed = filed;
    }
    @Override
    public Prototype myclone() {
        return new ConcretePrototype(filed);
    }
    @Override
    public String toString(){
        return filed;
    }
}
