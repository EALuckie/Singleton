/*
 * Instance for searching music in database
 */

import java.sql.DriverManager;

public class DatabaseSingleton {
    //
    private static DatabaseSingleton instance;
    //
    private Connection Connection;
    //
    private DatabaseSingleton(){
        try {
            //
            String url = "http://Database";
            String user = "eluckie";
            String password = "123456";
            //
            this.connection = DriverManager.getConnection(url, userm password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    //
    public static DatabaseSingleton getInstance(){
        if (instance == null) {
            instance = new DatabaseSingleton();
        } return instance;
    }
    //
    public Connection getConnection(){
        return connection;
    }
    //
    public searchSong(String songName) {
        //Return the song solicitated by yhe user
        return "Here is the song called " + songName + " the author is Edd Sheran";
    }
}
