/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
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

import java.util.ArrayList;
import me.KingWatsaba.minesquare.CosmeticsUtils.ParticleEvent;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
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

public class BagPack
implements Listener {
    public static void openMenu(Player p) {
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, (int)54, (String)"BagPack Particles");
        ItemStack Flame = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta FlameMeta = Flame.getItemMeta();
        FlameMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame");
        Flame.setItemMeta(FlameMeta);
        ItemStack FlameNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta FlameMetaNo = FlameNo.getItemMeta();
        FlameMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame \u00a77(\u00a7cNot Bought!\u00a77)");
        FlameNo.setItemMeta(FlameMetaNo);
        ItemStack Smoke = new ItemStack(Material.ANVIL);
        ItemMeta SmokeMeta = Smoke.getItemMeta();
        SmokeMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke");
        Smoke.setItemMeta(SmokeMeta);
        ItemStack SmokeNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta SmokeNoMeta = SmokeNo.getItemMeta();
        SmokeNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke \u00a77(\u00a7cNot Bought!\u00a77)");
        SmokeNo.setItemMeta(SmokeNoMeta);
        ItemStack Ender = new ItemStack(Material.ENDER_PEARL);
        ItemMeta EnderMeta = Ender.getItemMeta();
        EnderMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder");
        Ender.setItemMeta(EnderMeta);
        ItemStack EnderNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta EnderNoMeta = EnderNo.getItemMeta();
        EnderNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder \u00a77(\u00a7cNot Bought!\u00a77)");
        EnderNo.setItemMeta(EnderNoMeta);
        ItemStack Music = new ItemStack(Material.JUKEBOX);
        ItemMeta MusicMeta = Music.getItemMeta();
        MusicMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic");
        Music.setItemMeta(MusicMeta);
        ItemStack MusicNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta MusicMetaNo = MusicNo.getItemMeta();
        MusicMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic \u00a77(\u00a7cNot Bought!\u00a77)");
        MusicNo.setItemMeta(MusicMeta);
        ItemStack Redstone = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta RedstoneMeta = Redstone.getItemMeta();
        RedstoneMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone");
        Redstone.setItemMeta(RedstoneMeta);
        ItemStack RedstoneNo = new ItemStack(Material.INK_SACK, 1, 8);
        ItemMeta RedstoneNoMeta = RedstoneNo.getItemMeta();
        RedstoneNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone \u00a77(\u00a7cNot Bought!\u00a77)");
        RedstoneNo.setItemMeta(RedstoneNoMeta);
        ItemStack Heart = new ItemStack(Material.BARRIER);
        ItemMeta HeartMeta = Heart.getItemMeta();
        HeartMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart");
        Heart.setItemMeta(HeartMeta);
        ItemStack HeartNo = new ItemStack(Material.BARRIER);
        ItemMeta HeartMetaNo = HeartNo.getItemMeta();
        HeartMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart \u00a77(\u00a7cNot Bought!\u00a77)");
        HeartNo.setItemMeta(HeartMetaNo);
        ItemStack Enchant = new ItemStack(Material.ENCHANTMENT_TABLE);
        ItemMeta EnchantMeta = Enchant.getItemMeta();
        EnchantMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant");
        Enchant.setItemMeta(EnchantMeta);
        ItemStack EnchantNo = new ItemStack(Material.ENCHANTMENT_TABLE);
        ItemMeta EnchantMetaNo = EnchantNo.getItemMeta();
        EnchantMetaNo.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant \u00a77(\u00a7cNot Bought!\u00a77)");
        EnchantNo.setItemMeta(EnchantMetaNo);
        ItemStack Water = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WaterMeta = Water.getItemMeta();
        WaterMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater");
        Water.setItemMeta(WaterMeta);
        ItemStack WaterNo = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WaterNoMeta = WaterNo.getItemMeta();
        WaterNoMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater \u00a77(\u00a7cNot Bought!\u00a77)");
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

    @EventHandler
    public void InvClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        ItemStack Flame = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta FlameMeta = Flame.getItemMeta();
        FlameMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lFlame");
        Flame.setItemMeta(FlameMeta);
        ItemStack Smoke = new ItemStack(Material.ANVIL);
        ItemMeta SmokeMeta = Smoke.getItemMeta();
        SmokeMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lSmoke");
        Smoke.setItemMeta(SmokeMeta);
        ItemStack Ender = new ItemStack(Material.ENDER_PEARL);
        ItemMeta EnderMeta = Ender.getItemMeta();
        EnderMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnder");
        Ender.setItemMeta(EnderMeta);
        ItemStack Music = new ItemStack(Material.JUKEBOX);
        ItemMeta MusicMeta = Music.getItemMeta();
        MusicMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lMusic");
        Music.setItemMeta(MusicMeta);
        ItemStack Redstone = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta RedstoneMeta = Redstone.getItemMeta();
        RedstoneMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lRedstone");
        Redstone.setItemMeta(RedstoneMeta);
        ItemStack Heart = new ItemStack(Material.BARRIER);
        ItemMeta HeartMeta = Heart.getItemMeta();
        HeartMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lHeart");
        Heart.setItemMeta(HeartMeta);
        ItemStack Enchant = new ItemStack(Material.ENCHANTMENT_TABLE);
        ItemMeta EnchantMeta = Enchant.getItemMeta();
        EnchantMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lEnchant");
        Enchant.setItemMeta(EnchantMeta);
        ItemStack Water = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WaterMeta = Water.getItemMeta();
        WaterMeta.setDisplayName("\u00a7cParticle: \u00a76\u00a7lWater");
        Water.setItemMeta(WaterMeta);
        if (p.getOpenInventory().getTopInventory().getName().contains(ChatColor.stripColor((String)"BagPack Particles"))) {
            if (e.getCurrentItem().isSimilar(Flame)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.FLAME.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Ender)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.ENDER.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Smoke)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.SMOKE.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Redstone)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.REDSTONE.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Water)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.WATER.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Music)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.MUSIC.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Enchant)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.ENCHANT.add(p);
                p.getOpenInventory().close();
            }
            if (e.getCurrentItem().isSimilar(Heart)) {
                ParticleEvent.RemoveParticle(p);
                ParticleEvent.HEART.add(p);
                p.getOpenInventory().close();
            }
        } else {
            return;
        }
    }
}

