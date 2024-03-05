public class User {
    private String iD;
    private int privileges;
    private DatabaseSingleton connection;
    //
    public User (String iD, DatabaseSingleton connection) {
        this.iD = iD;
        this.privileges = 3;
        this.connection = connection;
    }
    //
    public void searchMusic(String song) {
        connection.searchSong(song);
    }
}
