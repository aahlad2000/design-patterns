package creational.prototype;

import java.time.LocalDateTime;

public class MySQL implements Connection{

    private String dbName;
    private LocalDateTime currentTime;

    public MySQL(MySQL mySQL){
        this.dbName = mySQL.dbName;
        this.currentTime = mySQL.currentTime;
    }

    public MySQL(String dbName, LocalDateTime now) {
        this.dbName = dbName;
        this.currentTime = now;
    }

    @Override
    public Connection clone(){
        return new MySQL(this);
    }

    @Override
    public void checkStatus(){
        System.out.println("MySQL DB Connected at: " + this.currentTime);
    }
}
