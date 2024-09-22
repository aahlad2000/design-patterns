package creational.prototype;

import java.time.LocalDateTime;

public class ConnectionPool {
    public static void main(String[] args){
        MySQL mySQL1 = new MySQL("MySQL", LocalDateTime.now());
        MongoDB mongoDB1 = new MongoDB("MongoDB", LocalDateTime.now());

        MySQL mySQL2 = (MySQL) mySQL1.clone();
        MongoDB mongoDB2 = (MongoDB) mongoDB1.clone();

        mySQL1.checkStatus();
        mongoDB1.checkStatus();

        mySQL2.checkStatus();
        mongoDB2.checkStatus();
    }
}
