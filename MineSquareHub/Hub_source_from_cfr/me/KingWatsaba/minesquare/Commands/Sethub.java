/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Player
 */
package me.KingWatsaba.minesquare.Commands;

import Utils.Messages;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquareFiles.FileManagers;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Sethub
implements CommandExecutor {
    Main plugin;

    public Sethub(Main instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("sethub") && sender instanceof Player) {
            if (!sender.hasPermission("ms.hub.sethub")) {
                sender.sendMessage(Messages.noPerm);
            } else {
                Player p = (Player)sender;
                Location loc = p.getLocation();
                Main.fileManager.getScoreboard().set("Hub.world", (Object)p.getWorld().getName());
                Main.fileManager.getScoreboard().set("Hub.x", (Object)loc.getBlockX());
                Main.fileManager.getScoreboard().set("Hub.y", (Object)loc.getBlockY());
                Main.fileManager.getScoreboard().set("Hub.z", (Object)loc.getBlockZ());
                Main.fileManager.saveConfig();
                sender.sendMessage(String.valueOf(Messages.prefix) + "Hub has been set!");
            }
        }
        return false;
    }
}

