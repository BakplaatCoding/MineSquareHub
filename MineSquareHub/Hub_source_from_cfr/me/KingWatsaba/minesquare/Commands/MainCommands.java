/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Location
 *  org.bukkit.Sound
 *  org.bukkit.World
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
package me.KingWatsaba.minesquare.Commands;

import Utils.Messages;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquareFiles.FileManagers;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class MainCommands
implements CommandExecutor {
    Main plugin;

    public MainCommands(Main instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("mshub") && sender instanceof Player) {
            if (args.length < 1) {
                sender.sendMessage(String.valueOf(Messages.prefix) + "do: /mshub help - For mnore info");
                return true;
            }
            if (args.length == 1) {
                if (args[0].contains("reload")) {
                    Main.fileManager.reloadConfig();
                    sender.sendMessage(String.valueOf(Messages.prefix) + "Config has ben reloaded");
                    return true;
                }
                if (args[0].contains("clearchat")) {
                    this.ClearChat(p);
                    return true;
                }
                if (args[0].contains("help")) {
                    this.sendHelp(p);
                    return true;
                }
                Player target = Bukkit.getServer().getPlayer(args[1]);
                if (target == null) {
                    p.sendMessage(String.valueOf(Messages.prefix) + "Could Not Find Player " + (Object)ChatColor.GOLD + (Object)ChatColor.BOLD + args[1] + "!");
                    return true;
                }
                if (args.length == 2 && args[0].contains("launch")) {
                    target.setAllowFlight(true);
                    target.setFlying(true);
                    target.setVelocity(target.getLocation().getDirection().multiply(0.3).setY(2));
                    target.getWorld().playSound(p.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 10.0f, -0.3f);
                    target.setAllowFlight(false);
                    target.setFlying(false);
                }
            }
        }
        return false;
    }

    public void ClearChat(Player p) {
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage("");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.GRAY + "------------------------------------------");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.GRAY + "                                          ");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.LIGHT_PURPLE + "     Chat has been cleard!");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.GRAY + "                BY:");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.RED + (Object)ChatColor.BOLD + "         " + p.getName());
        Bukkit.getServer().broadcastMessage((Object)ChatColor.GRAY + "------------------------------------------");
        Bukkit.getServer().broadcastMessage((Object)ChatColor.GRAY + "                                          ");
    }

    public void sendHelp(Player p) {
        p.sendMessage("\u00a7c====\u00a7k!\u00a7d \u00a7d\u00a7lCommands \u00a7c\u00a7k!\u00a7c=====");
        p.sendMessage("");
        p.sendMessage("\u00a7d -> /mshub help - for help");
        p.sendMessage("\u00a7d -> /mshub clearchat - for clearing the chat");
        p.sendMessage("\u00a7d -> /mshub reload - reloading the configs");
        p.sendMessage("\u00a7d -> /mshub launh <player> - Launch a player");
        p.sendMessage("");
        p.sendMessage("\u00a7c====\u00a7k!\u00a7d \u00a7d\u00a7lCommands \u00a7c\u00a7k!\u00a7c=====");
    }
}

