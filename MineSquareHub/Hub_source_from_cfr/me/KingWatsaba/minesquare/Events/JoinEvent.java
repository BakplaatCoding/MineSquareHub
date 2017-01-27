/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.KingWatsaba.minesquare.Events;

import MySQL.SQLSettings;
import Utils.Messages;
import java.util.Scanner;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquare.Scoreboard.Scoreboard;
import me.KingWatsaba.minesquareFiles.FileManagers;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinEvent
implements Listener {
    Main plugin;
    Main main;

    public JoinEvent(Main instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev) {
        Player p = ev.getPlayer();
        if (!p.hasPlayedBefore()) {
            p.sendMessage((Object)ChatColor.GRAY + "------------------------------------------");
            p.sendMessage((Object)ChatColor.GRAY + (Object)ChatColor.BOLD + "Welcome to: " + (Object)ChatColor.LIGHT_PURPLE + (Object)ChatColor.BOLD + "TheMinesquareNetwork!");
            p.sendMessage((Object)ChatColor.RED + "               " + (Object)ChatColor.BOLD + p.getName());
            p.sendMessage((Object)ChatColor.GRAY + "------------------------------------------");
            Main.sql.setFirstJoin(p.getUniqueId(), p.getName(), 0);
            JoinEvent.AddItems(p);
            this.Teleport(p);
            Scoreboard.add(p);
            p.setAllowFlight(true);
        } else {
            p.sendMessage((Object)ChatColor.GRAY + "------------------------------------------");
            p.sendMessage((Object)ChatColor.GRAY + "                                          ");
            p.sendMessage((Object)ChatColor.GRAY + "                                          ");
            p.sendMessage((Object)ChatColor.GRAY + (Object)ChatColor.BOLD + "Welcome back to: " + (Object)ChatColor.LIGHT_PURPLE + (Object)ChatColor.BOLD + "TheMinesquareNetwork!");
            p.sendMessage((Object)ChatColor.GRAY + "                                          ");
            p.sendMessage((Object)ChatColor.RED + "               " + (Object)ChatColor.BOLD + p.getName());
            p.sendMessage((Object)ChatColor.GRAY + "                                          ");
            p.sendMessage((Object)ChatColor.GRAY + "                                          ");
            p.sendMessage((Object)ChatColor.GRAY + "------------------------------------------");
            JoinEvent.AddItems(p);
            this.Teleport(p);
            Scoreboard.add(p);
            p.setAllowFlight(true);
        }
    }

    public static void AddItems(Player p) {
        ItemStack menu = new ItemStack(Material.COMPASS);
        ItemMeta menuMeta = menu.getItemMeta();
        menuMeta.setDisplayName("\u00a7c\u00a7lSquare\u00a7fMenu \u00a77>> \u00a7f(\u00a77Right Click\u00a7f)");
        menu.setItemMeta(menuMeta);
        ItemStack DonatorBox = new ItemStack(Material.ENDER_CHEST);
        ItemMeta DonatorBoxMeta = DonatorBox.getItemMeta();
        DonatorBoxMeta.setDisplayName("\u00a7c\u00a7lDonator\u00a7fBox \u00a77>> \u00a7f(\u00a77Right Click\u00a7f)");
        DonatorBox.setItemMeta(DonatorBoxMeta);
        ItemStack Shop = new ItemStack(Material.DIAMOND);
        ItemMeta ShopMeta = Shop.getItemMeta();
        ShopMeta.setDisplayName("\u00a7c\u00a7lVanity\u00a7fUnlocker \u00a77>> \u00a7f(\u00a77Click to unlock\u00a7f)");
        Shop.setItemMeta(ShopMeta);
        ItemStack ItemSlot = new ItemStack(Material.BARRIER);
        ItemMeta ItemSlotMeta = ItemSlot.getItemMeta();
        ItemSlotMeta.setDisplayName("\u00a7c\u00a7lItem\u00a7fSlot \u00a77>> \u00a7f(\u00a77Click to select\u00a7f)");
        ItemSlot.setItemMeta(ItemSlotMeta);
        ItemStack BagPack2 = new ItemStack(Material.CHEST);
        ItemMeta BagPackMeta = BagPack2.getItemMeta();
        BagPackMeta.setDisplayName("\u00a7c\u00a7lVanity\u00a7fSelector \u00a77>> \u00a7f(\u00a77Click to select\u00a7f)");
        BagPack2.setItemMeta(BagPackMeta);
        ItemStack ServerSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta ServerSwordMeta = ServerSword.getItemMeta();
        ServerSwordMeta.setDisplayName("\u00a7c\u00a7lPvP\u00a7fSword \u00a77>> \u00a7f(\u00a77Hold to enable PvP\u00a7f)");
        ServerSword.setItemMeta(ServerSwordMeta);
        p.getInventory().clear();
        p.getInventory().setItem(4, menu);
        p.getInventory().setItem(2, ServerSword);
        p.getInventory().setItem(0, DonatorBox);
        p.getInventory().setItem(6, ItemSlot);
        p.getInventory().setItem(8, Shop);
        p.getInventory().setItem(7, BagPack2);
    }

    public void Teleport(Player p) {
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
}

