/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 */
package MySQL;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import me.KingWatsaba.minesquare.Main;
import org.bukkit.Bukkit;

public class Mysql {
    public static Main plugin;
    public static String user;
    public static String pass;
    public static String host;
    public static String db;
    public Connection connection;

    static {
        user = "os_19524";
        pass = "cc04d9db56";
        host = "mysql.offensiveservers.nl";
        db = "os_19524";
    }

    public Mysql(Main instance) {
        plugin = instance;
    }

    public Mysql(String user2, String pass2, String host2, String dB2) {
    }

    public static String getDB() {
        return db;
    }

    public static String getHost() {
        return host;
    }

    public void MySQL(String user, String pass, String host, String db) {
        this.connect();
    }

    public void close() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, pass);
        }
        catch (SQLException e) {
            e.printStackTrace();
            Bukkit.broadcastMessage((String)"\u00a7b\u00a7lkan geen database vinden Meld dit aub aan het Minesquare  DevelopersTeam!");
        }
    }

    public void Update(String qry) {
        try {
            Statement stmt = this.connection.createStatement();
            stmt.executeUpdate(qry);
            stmt.close();
        }
        catch (Exception ex) {
            this.connect();
            System.err.println(ex);
        }
    }

    public ResultSet Query(String qry) {
        ResultSet rs = null;
        try {
            Statement stmt = this.connection.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (Exception ex) {
            this.connect();
            System.err.println(ex);
        }
        return rs;
    }
}

