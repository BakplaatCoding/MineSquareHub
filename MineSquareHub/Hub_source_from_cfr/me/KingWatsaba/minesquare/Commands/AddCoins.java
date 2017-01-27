/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
package me.KingWatsaba.minesquare.Commands;

import MySQL.SQLSettings;
import Utils.Messages;
import java.util.Scanner;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquare.Scoreboard.Scoreboard;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddCoins
implements CommandExecutor {
    SQLSettings sql;
    static Main plugin;

    public AddCoins(Main instance) {
        plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        int coins = Main.sql.getCoins(p.getUniqueId());
        if (cmd.getName().equalsIgnoreCase("addcoins")) {
            if (!p.hasPermission("ms.hub.addcoins")) {
                p.sendMessage(Messages.noPerm);
            }
            if (args.length < 2) {
                p.sendMessage(String.valueOf(Messages.prefix) + "Wrong Command use, use: /addcoins <amount> <player>");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[1]);
            if (target == null) {
                p.sendMessage(String.valueOf(Messages.prefix) + "Could Not Find Player " + (Object)ChatColor.GOLD + (Object)ChatColor.BOLD + args[1] + "!");
                return true;
            }
            if (args.length == 2) {
                Scanner fi = new Scanner(args[0]);
                fi.useDelimiter("[^\\p{Alnum},\\.-]");
                p.sendMessage(String.valueOf(Messages.prefix) + "coins have been added to: " + (Object)ChatColor.RED + p.getName());
                Main.sql.addCoins(target.getUniqueId(), coins + fi.nextInt());
                Scoreboard.UpdatBoard(target);
                return true;
            }
        }
        return false;
    }
}

