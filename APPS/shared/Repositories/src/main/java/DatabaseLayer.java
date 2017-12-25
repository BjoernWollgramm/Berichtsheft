import javax.sql.DataSource;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseLayer {
    private Connection connections;
    private  DataSource dataSource;

    private void setupDatabaseDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void setDbUrl(URL dbUrl, String table, String name, String password){
        try {
            connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/berichtsheft","root","admin");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Connection getConnections() {

        return connections;
    }



}
