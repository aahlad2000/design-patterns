package structural.proxy;

public class ProxyImage implements Image{

    private String fileName;
    private boolean isRealUser;
    private RealImage realImage;

    public ProxyImage(String fileName, boolean isRealUser){
        this.fileName = fileName;
        this.isRealUser = isRealUser;
    }

    @Override
    public void viewImage() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.viewImage();
    }

    @Override
    public void saveImage() {
        if(isRealUser){
            if(realImage == null){
                realImage = new RealImage(fileName);
            }
            realImage.saveImage();
        } else {
            System.out.println("Access denied: Not a real user!");
        }
    }

}
