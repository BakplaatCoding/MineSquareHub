/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
package me.KingWatsaba.minesquare.Commands;

import MySQL.SQLSettings;
import Utils.Messages;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Coins
implements CommandExecutor {
    Main main;

    public Coins(Main main2) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
        Player p = (Player)sender;
        int coins = Main.sql.getCoins(p.getUniqueId());
        if (cmd.getName().equalsIgnoreCase("coins")) {
            sender.sendMessage(String.valueOf(Messages.prefix) + "You have: " + (Object)ChatColor.GOLD + coins);
        }
        return false;
    }
}

