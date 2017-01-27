/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.Sound
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.ConsoleCommandSender
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.KingWatsaba.minesquare.Menus;

import MySQL.SQLSettings;
import Utils.ISBuying;
import Utils.Messages;
import java.util.Scanner;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquare.Scoreboard.Scoreboard;
import me.KingWatsaba.minesquareFiles.FileManagers;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ParticleMenu
implements Listener {
    SQLSettings sql;
    Main plugin;

    public ParticleMenu(Main instance) {
        this.plugin = instance;
    }

    public static void opeMenu(Player p) {
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, (int)54, (String)"ParticleMenu");
        ItemStack Flame = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta FlameMeta = Flame.getItemMeta();
        FlameMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame");
        Flame.setItemMeta(FlameMeta);
        ItemStack FlameNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta FlameMetaNo = FlameNo.getItemMeta();
        FlameMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("flame") + "\u00a77)");
        FlameNo.setItemMeta(FlameMetaNo);
        ItemStack Smoke = new ItemStack(Material.ANVIL);
        ItemMeta SmokeMeta = Smoke.getItemMeta();
        SmokeMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke");
        Smoke.setItemMeta(SmokeMeta);
        ItemStack SmokeNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta SmokeNoMeta = SmokeNo.getItemMeta();
        SmokeNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("smoke") + "\u00a77)");
        SmokeNo.setItemMeta(SmokeNoMeta);
        ItemStack Ender = new ItemStack(Material.ENDER_PEARL);
        ItemMeta EnderMeta = Ender.getItemMeta();
        EnderMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder");
        Ender.setItemMeta(EnderMeta);
        ItemStack EnderNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta EnderNoMeta = EnderNo.getItemMeta();
        EnderNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("ender") + "\u00a77)");
        EnderNo.setItemMeta(EnderNoMeta);
        ItemStack Music = new ItemStack(Material.JUKEBOX);
        ItemMeta MusicMeta = Music.getItemMeta();
        MusicMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic");
        Music.setItemMeta(MusicMeta);
        ItemStack MusicNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta MusicMetaNo = MusicNo.getItemMeta();
        MusicMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("music") + "\u00a77)");
        MusicNo.setItemMeta(MusicMetaNo);
        ItemStack Redstone = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta RedstoneMeta = Redstone.getItemMeta();
        RedstoneMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone");
        Redstone.setItemMeta(RedstoneMeta);
        ItemStack RedstoneNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta RedstoneNoMeta = RedstoneNo.getItemMeta();
        RedstoneNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("redstone") + "\u00a77)");
        RedstoneNo.setItemMeta(RedstoneNoMeta);
        ItemStack Heart = new ItemStack(Material.BARRIER);
        ItemMeta HeartMeta = Heart.getItemMeta();
        HeartMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart");
        Heart.setItemMeta(HeartMeta);
        ItemStack HeartNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta HeartMetaNo = HeartNo.getItemMeta();
        HeartMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("love") + "\u00a77)");
        HeartNo.setItemMeta(HeartMetaNo);
        ItemStack Enchant = new ItemStack(Material.ENCHANTMENT_TABLE);
        ItemMeta EnchantMeta = Enchant.getItemMeta();
        EnchantMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant");
        Enchant.setItemMeta(EnchantMeta);
        ItemStack EnchantNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta EnchantMetaNo = EnchantNo.getItemMeta();
        EnchantMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("enchant") + "\u00a77)");
        EnchantNo.setItemMeta(EnchantMetaNo);
        ItemStack Water = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WaterMeta = Water.getItemMeta();
        WaterMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater");
        Water.setItemMeta(WaterMeta);
        ItemStack WaterNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta WaterNoMeta = WaterNo.getItemMeta();
        WaterNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("water") + "\u00a77)");
        WaterNo.setItemMeta(WaterNoMeta);
        ItemStack border = new ItemStack(Material.STAINED_GLASS_PANE, 1, 15);
        ItemMeta BorderMeta = border.getItemMeta();
        BorderMeta.setDisplayName(" ");
        border.setItemMeta(BorderMeta);
        if (!p.hasPermission("ms.hub.particles.flame")) {
            inv.setItem(0, FlameNo);
        } else {
            inv.setItem(0, Flame);
        }
        if (!p.hasPermission("ms.hub.particles.smoke")) {
            inv.setItem(1, SmokeNo);
        } else {
            inv.setItem(1, Smoke);
        }
        if (!p.hasPermission("ms.hub.particles.ender")) {
            inv.setItem(2, EnderNo);
        } else {
            inv.setItem(2, Ender);
        }
        if (!p.hasPermission("ms.hub.particle.music")) {
            inv.setItem(3, MusicNo);
        } else {
            inv.setItem(3, Music);
        }
        if (!p.hasPermission("ms.hub.particles.redstone")) {
            inv.setItem(4, RedstoneNo);
        } else {
            inv.setItem(4, Redstone);
        }
        if (!p.hasPermission("ms.hub.particles.heart")) {
            inv.setItem(5, HeartNo);
        } else {
            inv.setItem(5, Heart);
        }
        if (!p.hasPermission("ms.hub.particles.enchant")) {
            inv.setItem(6, EnchantNo);
        } else {
            inv.setItem(6, Enchant);
        }
        if (!p.hasPermission("ms.hub.particles.water")) {
            inv.setItem(7, WaterNo);
        } else {
            inv.setItem(7, Water);
        }
        inv.setItem(36, border);
        inv.setItem(37, border);
        inv.setItem(38, border);
        inv.setItem(39, border);
        inv.setItem(40, border);
        inv.setItem(41, border);
        inv.setItem(42, border);
        inv.setItem(43, border);
        inv.setItem(44, border);
        p.openInventory(inv);
    }

    public static String getCost(String ParticleConfig) {
        return Main.fileManager.getScoreboard().getString("Particle." + ParticleConfig);
    }

    @EventHandler
    public void onplayerClickInv(InventoryClickEvent e) {
        ItemStack YES = new ItemStack(Material.STAINED_CLAY, 1, 5);
        ItemMeta YESMeta = YES.getItemMeta();
        YESMeta.setDisplayName("\u00a7aYES!");
        ItemStack NO = new ItemStack(Material.STAINED_CLAY, 1, 6);
        ItemMeta NOMeta = NO.getItemMeta();
        NOMeta.setDisplayName("\u00a7cNO!");
        NO.setItemMeta(NOMeta);
        YES.setItemMeta(YESMeta);
        Scanner flame = new Scanner(Main.fileManager.getScoreboard().getString("Particle.flame"));
        Scanner music = new Scanner(Main.fileManager.getScoreboard().getString("Particle.music"));
        Scanner smoke = new Scanner(Main.fileManager.getScoreboard().getString("Particle.smoke"));
        Scanner ender = new Scanner(Main.fileManager.getScoreboard().getString("Particle.ender"));
        Scanner water = new Scanner(Main.fileManager.getScoreboard().getString("Particle.water"));
        Scanner redstone = new Scanner(Main.fileManager.getScoreboard().getString("Particle.redstone"));
        Scanner heart = new Scanner(Main.fileManager.getScoreboard().getString("Particle.heart"));
        Scanner enchant = new Scanner(Main.fileManager.getScoreboard().getString("Particle.enchant"));
        Player p = (Player)e.getWhoClicked();
        int coins = Main.sql.getCoins(p.getUniqueId());
        ItemStack FlameNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta FlameMetaNo = FlameNo.getItemMeta();
        FlameMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("flame") + "\u00a77)");
        FlameNo.setItemMeta(FlameMetaNo);
        ItemStack EnderNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta EnderNoMeta = EnderNo.getItemMeta();
        EnderNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("ender") + "\u00a77)");
        EnderNo.setItemMeta(EnderNoMeta);
        ItemStack SmokeNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta SmokeNoMeta = SmokeNo.getItemMeta();
        SmokeNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("smoke") + "\u00a77)");
        SmokeNo.setItemMeta(SmokeNoMeta);
        ItemStack RedstoneNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta RedstoneNoMeta = RedstoneNo.getItemMeta();
        RedstoneNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("redstone") + "\u00a77)");
        RedstoneNo.setItemMeta(RedstoneNoMeta);
        ItemStack HeartNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta HeartMetaNo = HeartNo.getItemMeta();
        HeartMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("love") + "\u00a77)");
        HeartNo.setItemMeta(HeartMetaNo);
        ItemStack EnchantNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta EnchantMetaNo = EnchantNo.getItemMeta();
        EnchantMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("enchant") + "\u00a77)");
        EnchantNo.setItemMeta(EnchantMetaNo);
        ItemStack WaterNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta WaterNoMeta = WaterNo.getItemMeta();
        WaterNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("water") + "\u00a77)");
        WaterNo.setItemMeta(WaterNoMeta);
        ItemStack MusicNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta MusicMetaNo = MusicNo.getItemMeta();
        MusicMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic \u00a77(\u00a7cCost: \u00a76\u00a7l" + ParticleMenu.getCost("music") + "\u00a77)");
        MusicNo.setItemMeta(MusicMetaNo);
        if (!p.getOpenInventory().getTopInventory().getName().contains(ChatColor.stripColor((String)"ParticleMenu"))) {
            return;
        }
        if (e.getCurrentItem().isSimilar(FlameNo)) {
            ISBuying.BuyItem("ParticleFlame", flame.nextInt(), "ms.hub.particles.flame", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleFlame") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Flame!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.flame");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - flame.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(SmokeNo)) {
            ISBuying.BuyItem("ParticleSmoke", smoke.nextInt(), "ms.hub.particles.smoke", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleSmoke") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Smoke!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.smoke");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - smoke.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(EnderNo)) {
            ISBuying.BuyItem("ParticleEnder", ender.nextInt(), "ms.hub.particles.ender", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleEnder") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Ender!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.ender");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - ender.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(EnderNo)) {
            ISBuying.BuyItem("ParticleEnder", ender.nextInt(), "ms.hub.particles.ender", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleEnder") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Ender!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.ender");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - ender.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(WaterNo)) {
            ISBuying.BuyItem("ParticleWater", ender.nextInt(), "ms.hub.particles.water", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleWater") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Water!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.water");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - water.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(EnchantNo)) {
            ISBuying.BuyItem("ParticleEnchant", ender.nextInt(), "ms.hub.particles.enchant", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleEnchant") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Enchant!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.enchant");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - enchant.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(HeartNo)) {
            ISBuying.BuyItem("ParticleHeart", ender.nextInt(), "ms.hub.particles.heart", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleHeart") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Heart!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.heart");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - heart.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(RedstoneNo)) {
            ISBuying.BuyItem("ParticleRedstone", ender.nextInt(), "ms.hub.particles.redstone", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleRedstone") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "Redstone!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.redstone");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - redstone.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(MusicNo)) {
            ISBuying.BuyItem("ParticleMusic", ender.nextInt(), "ms.hub.particles.music", p);
        }
        if (p.getOpenInventory().getTopInventory().getName() == ChatColor.stripColor((String)"ParticleMusic") && e.getCurrentItem().isSimilar(YES)) {
            p.sendMessage(String.valueOf(Messages.Bought) + "music!");
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "manuaddp " + p.getName() + " ms.hub.particles.music");
            p.getOpenInventory().close();
            Main.sql.RemoveCoins(p.getUniqueId().toString(), coins - music.nextInt());
            Scoreboard.UpdatBoard(p);
            p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0f, 1.0f);
        }
        if (e.getCurrentItem().isSimilar(NO)) {
            p.getOpenInventory().close();
            p.sendMessage(String.valueOf(Messages.prefix) + (Object)ChatColor.GOLD + "Buy System has been Canceld");
        }
    }
}

