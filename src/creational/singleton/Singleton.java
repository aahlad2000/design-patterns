package creational.singleton;

public class Singleton {

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
               if(instance == null){
                   instance = new Singleton();
               }
            }
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Printing message with current instance");
    }
}
