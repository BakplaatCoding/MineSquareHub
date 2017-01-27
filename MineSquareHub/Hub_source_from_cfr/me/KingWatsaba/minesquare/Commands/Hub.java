/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
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
import java.util.Scanner;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquareFiles.FileManagers;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Hub
implements CommandExecutor {
    Main plugin;

    public Hub(Main instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hub")) {
            Player p = (Player)sender;
            String x = Main.fileManager.getScoreboard().getString("Hub.x");
            String y = Main.fileManager.getScoreboard().getString("Hub.y");
            String z = Main.fileManager.getScoreboard().getString("Hub.z");
            String World1 = Main.fileManager.getScoreboard().getString("Hub.world");
            Scanner fi = new Scanner(x);
            Scanner f2 = new Scanner(y);
            Scanner f3 = new Scanner(z);
            fi.useDelimiter("[^\\p{Alnum},\\.-]");
            f2.useDelimiter("[^\\p{Alnum},\\.-]");
            f3.useDelimiter("[^\\p{Alnum},\\.-]");
            double xpos = fi.nextDouble();
            double ypos = f2.nextDouble();
            double zpos = f3.nextDouble();
            Location Hub2 = new Location(Bukkit.getWorld((String)World1), xpos, ypos, zpos);
            p.teleport(Hub2);
            p.sendMessage(String.valueOf(Messages.prefix) + "Teleported to HUB!");
        }
        return false;
    }
}

