/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Server
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.KingWatsaba.minesquare;

import MySQL.SQLSettings;
import me.KingWatsaba.minesquare.Commands.AddCoins;
import me.KingWatsaba.minesquare.Commands.BuildMode;
import me.KingWatsaba.minesquare.Commands.Coins;
import me.KingWatsaba.minesquare.Commands.Hub;
import me.KingWatsaba.minesquare.Commands.MainCommands;
import me.KingWatsaba.minesquare.Commands.RemoveCoins;
import me.KingWatsaba.minesquare.Commands.Sethub;
import me.KingWatsaba.minesquare.CosmeticsUtils.ParticleEvent;
import me.KingWatsaba.minesquare.Events.AtackEvent;
import me.KingWatsaba.minesquare.Events.DamageEvent;
import me.KingWatsaba.minesquare.Events.DoubleJump;
import me.KingWatsaba.minesquare.Events.DropEvent;
import me.KingWatsaba.minesquare.Events.InventoryMoveEvent;
import me.KingWatsaba.minesquare.Events.ItemClickEvent;
import me.KingWatsaba.minesquare.Events.JoinEvent;
import me.KingWatsaba.minesquare.Events.NoBuild;
import me.KingWatsaba.minesquare.Events.NoFood;
import me.KingWatsaba.minesquare.Events.NoPickUp;
import me.KingWatsaba.minesquare.Menus.BagPack;
import me.KingWatsaba.minesquare.Menus.ParticleMenu;
import me.KingWatsaba.minesquare.Scoreboard.Scoreboard;
import me.KingWatsaba.minesquareFiles.FileManagers;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
extends JavaPlugin
implements Listener {
    public static SQLSettings sql;
    public final FileConfiguration config;
    public static Scoreboard board;
    public static FileManagers fileManager;

    public Main() {
        this.config = this.getConfig();
    }

    public void onEnable() {
        sql = new SQLSettings(this, "", "", "", "");
        this.safeConfigs();
        this.registerListener();
        this.registerCommands();
    }

    public void onDisable() {
        this.safeConfigs();
        fileManager.saveConfig();
    }

    public void registerListener() {
        this.getServer().getPluginManager().registerEvents((Listener)new JoinEvent(this), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new ItemClickEvent(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new DropEvent(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new AtackEvent(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new InventoryMoveEvent(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new NoBuild(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new NoFood(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new DamageEvent(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new DoubleJump(this), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new NoPickUp(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new ParticleMenu(this), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new BagPack(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new ParticleEvent(), (Plugin)this);
    }

    public void safeConfigs() {
        fileManager = new FileManagers();
        fileManager.setup(this);
        fileManager.saveConfig();
        fileManager.reloadConfig();
    }

    public void registerCommands() {
        this.getCommand("addcoins").setExecutor((CommandExecutor)new AddCoins(this));
        this.getCommand("coins").setExecutor((CommandExecutor)new Coins(this));
        this.getCommand("sethub").setExecutor((CommandExecutor)new Sethub(this));
        this.getCommand("hub").setExecutor((CommandExecutor)new Hub(this));
        this.getCommand("mshub").setExecutor((CommandExecutor)new MainCommands(this));
        this.getCommand("build").setExecutor((CommandExecutor)new BuildMode());
        this.getCommand("removecoins").setExecutor((CommandExecutor)new RemoveCoins(this));
    }
}

