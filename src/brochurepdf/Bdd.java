package brochurepdf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connection a la base de donnees via le driver JDBC
 *
 * @author Oualali.A
 * @version 1.0
 */
public class Bdd {

    private Connection connection;

    /**
     *
     * @throws Exception retourne un Exception de type SQLException
     */
    public void connexion() throws Exception {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/marieteam", "root", "");

    }

    /**
     *
     * @return un connection
     */
    public Connection getConnection() {
        return this.connection;
    }

    /**
     *
     * @param connection modifie la connection
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
