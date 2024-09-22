package creational.prototype;

import java.time.LocalDateTime;

public class MongoDB implements Connection{
    private String dbName;
    private LocalDateTime currentTime;

    public MongoDB(MongoDB mongoDB){
        this.dbName = mongoDB.dbName;
        this.currentTime = mongoDB.currentTime;
    }

    public MongoDB(String dbName, LocalDateTime now) {
        this.dbName = dbName;
        this.currentTime = now;
    }

    @Override
    public Connection clone(){
        return new MongoDB(this);
    }

    @Override
    public void checkStatus(){
        System.out.println("Mongo DB Connected at: " + this.currentTime);

    }
}
