/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.FileConfiguration
 */
package me.KingWatsaba.minesquareFiles;

import java.io.File;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquareFiles.Config;
import org.bukkit.configuration.file.FileConfiguration;

public class FileManagers {
    Main main;

    public void setup(Main p) {
        if (!p.getDataFolder().exists()) {
            p.getDataFolder().mkdir();
        }
        Config.reload();
        Config.load();
        Config.save();
        Config.reload();
    }

    public FileConfiguration getScoreboard() {
        return Config.getConfig();
    }

    public void reloadConfig() {
        Config.reload();
    }

    public void saveConfig() {
        Config.save();
    }
}

