package singleton;

/**
 * TODO
 * 设计模式--单例模式--双重校验
 * 对获取实例instanceSingleton()的整个方法都加锁确实可以确保线程安全
 * 但是由于加锁后当有线程在访问该方法时，其他的线程必须等待，存在性能问题
 * 因此采用双重校验方法，只对创建实例的部分加锁，但同样为了避免出现宪线程安全问题，在锁内再一次判断实例是否已被创建
 * @author 苞谷洁子
 * @ClassName Singleton
 * @date 2021/3/24 14:52
 */
public class SingletonByCheck {
    private static SingletonByCheck singleton;
    private SingletonByCheck(){}
    public static SingletonByCheck instanceSingleton(){
        if(singleton == null){
            synchronized(SingletonByCheck.class){
                if(singleton == null){
                    singleton = new SingletonByCheck();
                }
            }
        }
        return singleton;
    }
}
