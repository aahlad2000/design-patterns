package structural.proxy;

public class ProxyPatternImplementation {
    public static void main(String[] args){
        Image proxyImageUser = new ProxyImage("hello.jpg", false);
        proxyImageUser.viewImage();
        proxyImageUser.saveImage();

        System.out.println("******************");

        Image realImageUser = new ProxyImage("hello.jpg", true);
        realImageUser.viewImage();
        realImageUser.saveImage();
    }
}
