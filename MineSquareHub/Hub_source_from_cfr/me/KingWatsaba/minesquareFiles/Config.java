/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.configuration.file.FileConfigurationOptions
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.KingWatsaba.minesquareFiles;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.KingWatsaba.minesquare.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Config {
    private static FileConfiguration config = null;
    private static File configFile = null;
    public static Main main;

    public static void load() {
        config = Config.getConfig();
        config.options().header("############################################################\n# +------------------------------------------------------+ #\n# |             !=Hub Config=!              | #\n# +------------------------------------------------------+ #\n############################################################\n\nuse: '\u00a7'<colorcode> for a Color. for full Info: https://goo.gl/Fl6ttp");
        config.addDefault("Hub.world", (Object)"");
        config.addDefault("Hub.x", (Object)"");
        config.addDefault("Hub.y", (Object)"");
        config.addDefault("Hub.z", (Object)"");
        config.addDefault("Particle.flame", (Object)"");
        config.addDefault("Particle.smoke", (Object)"");
        config.addDefault("Particle.ender", (Object)"");
        config.addDefault("Particle.music", (Object)"");
        config.addDefault("Particle.redstone", (Object)"");
        config.addDefault("Particle.heart", (Object)"");
        config.addDefault("Particle.enchant", (Object)"");
        config.addDefault("Particle.water", (Object)"");
        config.addDefault("Particle.slime", (Object)"");
        config.addDefault("Particle.snowball", (Object)"");
        config.addDefault("Particle.magic", (Object)"");
        config.addDefault("Particle.cloud", (Object)"");
        config.addDefault("Particle.crit", (Object)"");
        config.addDefault("Particle.dark", (Object)"");
        config.options().copyDefaults(true);
        Config.save();
    }

    public static void reload() {
        if (configFile == null) {
            configFile = new File("plugins/MineSquareHub/Config.yml");
        }
        config = YamlConfiguration.loadConfiguration((File)configFile);
    }

    public static FileConfiguration getConfig() {
        if (config == null) {
            Config.reload();
        }
        return config;
    }

    public static void save() {
        if (config == null || configFile == null) {
            return;
        }
        try {
            config.save(configFile);
        }
        catch (IOException ex) {
            Logger.getLogger(JavaPlugin.class.getName()).log(Level.SEVERE, "Could not save configFile to " + configFile, ex);
        }
    }
}

