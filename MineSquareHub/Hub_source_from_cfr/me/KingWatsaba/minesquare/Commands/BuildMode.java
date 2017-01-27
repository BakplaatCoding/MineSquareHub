/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.GameMode
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.PlayerInventory
 */
package me.KingWatsaba.minesquare.Commands;

import Utils.Messages;
import java.util.ArrayList;
import me.KingWatsaba.minesquare.Events.JoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class BuildMode
implements CommandExecutor {
    public static ArrayList<Player> isInBuildMode = new ArrayList();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("build")) {
            Player p = (Player)sender;
            if (isInBuildMode.contains((Object)p)) {
                p.sendMessage(String.valueOf(Messages.prefix) + "You are now in " + (Object)ChatColor.GOLD + "Normal " + (Object)ChatColor.GREEN + "Mode!");
                p.getInventory().clear();
                JoinEvent.AddItems(p);
                isInBuildMode.remove((Object)p);
                p.setGameMode(GameMode.ADVENTURE);
            } else if (!isInBuildMode.contains((Object)p)) {
                p.sendMessage(String.valueOf(Messages.prefix) + "You are now in " + (Object)ChatColor.GOLD + "Build " + (Object)ChatColor.GREEN + "Mode!");
                p.getInventory().clear();
                p.setGameMode(GameMode.CREATIVE);
                isInBuildMode.add(p);
                p.setFlying(true);
            }
        }
        return false;
    }
}

