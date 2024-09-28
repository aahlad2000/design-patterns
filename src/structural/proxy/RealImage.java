package structural.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImage(fileName);
    }

    public void loadImage(String fileName){
        System.out.println(STR."Loading : \{fileName}");
    }

    @Override
    public void viewImage() {
        System.out.println("Viewing Image");
    }

    @Override
    public void saveImage() {
        System.out.println("Saving Image");
    }
}
