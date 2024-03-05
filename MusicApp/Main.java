/*
 * MUSIC APP
 */

public class Main {
    private DatabaseSingleton connection;
    public static void main(String[] args) {
        System.out.println("Bienvenidos! Aplicación de música");
        //Crea nuevo usuario y pasa como parámetro la conexión
        User user1 = new User(1001, connection);
    }
}
