package creational.singleton;

public class Main {
    public static void main(String[] args){
        SingletonPattern singleton = SingletonPattern.getInstance();
        singleton.printMessage();
    }
}
