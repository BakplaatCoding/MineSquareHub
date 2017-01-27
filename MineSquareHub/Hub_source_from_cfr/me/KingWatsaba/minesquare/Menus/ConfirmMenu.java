/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.KingWatsaba.minesquare.Menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ConfirmMenu {
    public static void opeMenu(Player p, String Name2) {
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, (int)27, (String)Name2);
        ItemStack NO = new ItemStack(Material.STAINED_CLAY, 1, 6);
        ItemMeta NOMeta = NO.getItemMeta();
        NOMeta.setDisplayName("\u00a7cNO!");
        NO.setItemMeta(NOMeta);
        ItemStack YES = new ItemStack(Material.STAINED_CLAY, 1, 5);
        ItemMeta YESMeta = YES.getItemMeta();
        YESMeta.setDisplayName("\u00a7aYES!");
        YES.setItemMeta(YESMeta);
        inv.setItem(11, YES);
        inv.setItem(15, NO);
        p.openInventory(inv);
    }
}

