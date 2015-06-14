/*
面试题2：实现Singleton模式
设计一个类，我们只能生成该类的一个实例
*/

/*
单线程环境下
1.私有（private）的构造函数，表明这个类是不可能形成实例了。这主要是怕这个类会有多个实例。
2.即然这个类是不可能形成实例，那么，我们需要一个静态的方式让其形成实例：getInstance()。
注意这个方法是在new自己，因为其可以访问私有的构造函数，所以他是可以保证实例被创建出来的。
3.所形成的实例保存在自己类中的私有成员中。
4.我们取实例时，只需要使用Singleton.getInstance()就行了。
*/
// 饿汉式
public class Singleton{
	private static final Singleton singleton = new Singleton();

	private Singleton(){}

	public static Singleton getInstance(){
		return singleton;
	}
}

// 懒汉式
public class Singleton{
	private static Singleton singleton = null;

	private Singleton(){}

	public static Singleton getInstance(){
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
}
/*
多线程环境下
1.第一个条件是说，如果实例创建了，那就不需要同步了，直接返回就好了。
2.不然，我们就开始同步线程。
3.第二个条件是说，如果被同步的线程中，有一个线程创建了对象，那么别的线程就不用再创建了。
*/
// 双重加锁
public class Singleton(){
	private static Singleton singleton = null;

	private Singleton(){}

	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}

// singleton = new Singleton()非原子操作，volatile禁止指令重排序
public class Singleton(){
	private volatile static Singleton singleton = null;

	private Singleton(){}

	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}

/*
Effective Java中推荐的方式
使用JVM本身机制保证了线程安全问题;由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，
因此它只有在getInstance()被调用时才会真正创建;同时读取实例的时候不会进行同步，没有性能缺陷;也不依赖 JDK 版本。
*/
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton (){}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/*
新版Effective Java中推荐的方式
默认枚举实例的创建是线程安全的，所以不需要担心线程安全的问题。
但是在枚举中的其他任何方法的线程安全由程序员自己负责。还有防止上面的通过反射机制调用私用构造器
*/
public enum Singleton{
    INSTANCE;
}