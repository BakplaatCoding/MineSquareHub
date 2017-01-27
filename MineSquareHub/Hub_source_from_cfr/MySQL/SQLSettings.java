/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.java.JavaPlugin
 */
package MySQL;

import MySQL.Mysql;
import java.io.PrintStream;
import java.sql.ResultSet;
import java.util.UUID;
import org.bukkit.plugin.java.JavaPlugin;

public class SQLSettings {
    private Mysql mysql;

    public SQLSettings(JavaPlugin plugin, String Host, String User, String DB, String Pass) {
        this.mysql = new Mysql(User, Pass, Host, DB);
        this.mysql.Update("CREATE DATABASE IF NOT EXISTS Hub");
        this.mysql.Update("CREATE TABLE IF NOT EXISTS PlayerData (UUID varchar(100),NAME varchar(100),COINS int(100))");
    }

    public void setFirstJoin(UUID uuid, String name, int Coins2) {
        this.mysql.Update("INSERT INTO PlayerData (UUID, NAME, COINS) VALUES ('" + uuid + "', '" + name + "', '" + Coins2 + "')");
    }

    public void setSPELERS(String server, int spelers) {
        this.mysql.Update("UPDATE " + server + " SET SPELERS='" + spelers + "' WHERE SERVER='" + server + "'");
    }

    public void setMINSPELERS(String server, int spelers) {
        this.mysql.Update("UPDATE " + server + " SET MIN_SPELERS='" + spelers + "' WHERE SERVER='" + server + "'");
    }

    public void setMAXSPELERS(String server, int spelers) {
        this.mysql.Update("UPDATE " + server + " SET MAX_SPELERS='" + spelers + "' WHERE SERVER='" + server + "'");
    }

    public int getCoins(UUID uuid) {
        int c = 0;
        try {
            ResultSet rs = this.mysql.Query("SELECT COINS FROM PlayerData WHERE UUID='" + uuid + "'");
            while (rs.next()) {
                c = rs.getInt(1);
            }
        }
        catch (Exception err) {
            System.err.println(err);
        }
        return c;
    }

    public void addCoins(UUID uuid, int amout) {
        this.mysql.Update("UPDATE PlayerData SET COINS='" + amout + "' WHERE UUID='" + uuid + "'");
    }

    public void RemoveCoins(String uuid, int amout) {
        this.mysql.Update("UPDATE PlayerData SET COINS='" + amout + "' WHERE UUID='" + uuid + "'");
    }

    public int getMINSPELERS(String server) {
        int c = 0;
        try {
            ResultSet rs = this.mysql.Query("SELECT MIN_SPELERS FROM " + server + " WHERE SERVER='" + server + "'");
            while (rs.next()) {
                c = rs.getInt(1);
            }
        }
        catch (Exception err) {
            System.err.println(err);
        }
        return c;
    }

    public int getMAXSPELERS(String server) {
        int c = 0;
        try {
            ResultSet rs = this.mysql.Query("SELECT MAX_SPELERS FROM Poptag WHERE SERVER='" + server + "'");
            while (rs.next()) {
                c = rs.getInt(1);
            }
        }
        catch (Exception err) {
            System.err.println(err);
        }
        return c;
    }

    public int getGAME(String server) {
        int c = 0;
        try {
            ResultSet rs = this.mysql.Query("SELECT SERVER FROM Poptag WHERE SERVER='" + server + "'");
            while (rs.next()) {
                c = rs.getInt(1);
            }
        }
        catch (Exception err) {
            System.err.println(err);
        }
        return c;
    }
}

