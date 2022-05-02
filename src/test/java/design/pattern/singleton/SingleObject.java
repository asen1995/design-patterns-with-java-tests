package design.pattern.singleton;

public class SingleObject {

    private static String name;

    private static SingleObject instance = new SingleObject("Singleton-Name");

    private SingleObject(String nameOfSingleton){
        name = nameOfSingleton;
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public String getName() {
        return name;
    }
}
