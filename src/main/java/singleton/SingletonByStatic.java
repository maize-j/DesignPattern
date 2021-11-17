package singleton;

/**
 * TODO
 * 设计模式--单例模式--静态内部类实现方法
 * 这种方法在Jvm的支持下确保了SingletonByStatic实例只有一个，是单例的
 * 既保证了懒汉加载模式，避免了内存的浪费，也保证了线程安全
 * @author 苞谷洁子
 * @ClassName singleton.SingletonByStatic
 * @date 2021/3/24 15:28
 */
public class SingletonByStatic {
    private SingletonByStatic(){}
    //在SingletonByStatic被加载进内存时，静态内部类还没有被加载进内存，调用SingletonByStaticHolder.singleton;时加载
    private static class SingletonByStaticHolder{
        private static final SingletonByStatic singleton = new SingletonByStatic();
    }
    private static SingletonByStatic instanceSingleton(){
        return SingletonByStaticHolder.singleton;
    }

    public static void main(String[] args) {
        //两次获取到的是同一个实例
        System.out.println(instanceSingleton());
        System.out.println(instanceSingleton());
    }
}
