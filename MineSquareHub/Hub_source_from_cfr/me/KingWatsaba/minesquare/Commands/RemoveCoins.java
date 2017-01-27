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

public class RemoveCoins
implements CommandExecutor {
    SQLSettings sql;
    static Main plugin;

    public RemoveCoins(Main instance) {
        plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("removecoins")) {
            if (!p.hasPermission("ms.hub.removecoins")) {
                p.sendMessage(Messages.noPerm);
            }
            if (args.length < 2) {
                p.sendMessage(String.valueOf(Messages.prefix) + "Wrong Command use, use: /removecoins <amount> <player>");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[1]);
            if (target == null) {
                p.sendMessage(String.valueOf(Messages.prefix) + "Could Not Find Player " + (Object)ChatColor.GOLD + (Object)ChatColor.BOLD + args[1] + "!");
                return true;
            }
            if (args.length == 2) {
                int coins = Main.sql.getCoins(target.getUniqueId());
                if (coins > 0) {
                    Scanner fi = new Scanner(args[0]);
                    fi.useDelimiter("[^\\p{Alnum},\\.-]");
                    p.sendMessage(String.valueOf(Messages.prefix) + "coins have been Remove: " + (Object)ChatColor.RED + p.getName());
                    Main.sql.addCoins(target.getUniqueId(), coins - fi.nextInt());
                    Scoreboard.UpdatBoard(target);
                    return true;
                }
                p.sendMessage(String.valueOf(Messages.prefix) + (Object)ChatColor.GOLD + (Object)ChatColor.BOLD + target.getName() + (Object)ChatColor.LIGHT_PURPLE + "has no coins :(");
            }
        }
        return false;
    }
}

