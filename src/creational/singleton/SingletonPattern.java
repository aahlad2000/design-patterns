package creational.singleton;

public class SingletonPattern {

    private static volatile SingletonPattern instance;

    public static SingletonPattern getInstance(){
        if(instance == null){
            synchronized (SingletonPattern.class){
               if(instance == null){
                   instance = new SingletonPattern();
               }
            }
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Printing message with current instance");
    }
}
