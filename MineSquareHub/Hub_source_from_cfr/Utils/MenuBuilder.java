/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Sound
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.inventory.ItemStack
 */
package Utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class MenuBuilder {
    public static void BuildMenu(Player p, Sound s, String disname, int slots, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, ItemStack item10, ItemStack item11, ItemStack item12, ItemStack item13, ItemStack item14, ItemStack item15, ItemStack item16, ItemStack item17, ItemStack item18, ItemStack item19, ItemStack item20, ItemStack item21, ItemStack item22, ItemStack item23, ItemStack item24, ItemStack item25, ItemStack item26, ItemStack item27, ItemStack item28, ItemStack item29, ItemStack item30, ItemStack item31, ItemStack item32, ItemStack item33, ItemStack item34, ItemStack item35, ItemStack item36, ItemStack item37, ItemStack item38, ItemStack item39, ItemStack item40, ItemStack item41, ItemStack item42, ItemStack item43, ItemStack item44, ItemStack item45, ItemStack item46, ItemStack item47, ItemStack item48, ItemStack item49, ItemStack item50, ItemStack item51, ItemStack item52, ItemStack item53, ItemStack item54) {
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, (int)slots, (String)disname);
        inv.setItem(0, item1);
        inv.setItem(1, item2);
        inv.setItem(2, item3);
        inv.setItem(3, item4);
        inv.setItem(4, item5);
        inv.setItem(5, item6);
        inv.setItem(6, item7);
        inv.setItem(7, item8);
        inv.setItem(8, item9);
        inv.setItem(9, item10);
        inv.setItem(10, item11);
        inv.setItem(11, item12);
        inv.setItem(12, item13);
        inv.setItem(13, item14);
        inv.setItem(14, item15);
        inv.setItem(15, item16);
        inv.setItem(16, item17);
        inv.setItem(17, item18);
        inv.setItem(18, item19);
        inv.setItem(19, item20);
        inv.setItem(20, item21);
        inv.setItem(21, item22);
        inv.setItem(22, item23);
        inv.setItem(23, item24);
        inv.setItem(24, item25);
        inv.setItem(25, item26);
        inv.setItem(26, item27);
        inv.setItem(27, item28);
        inv.setItem(28, item29);
        inv.setItem(29, item30);
        inv.setItem(30, item31);
        inv.setItem(31, item32);
        inv.setItem(32, item33);
        inv.setItem(33, item34);
        inv.setItem(34, item35);
        inv.setItem(35, item36);
        inv.setItem(36, item37);
        inv.setItem(37, item38);
        inv.setItem(38, item39);
        inv.setItem(39, item40);
        inv.setItem(40, item41);
        inv.setItem(41, item42);
        inv.setItem(42, item43);
        inv.setItem(43, item44);
        inv.setItem(44, item45);
        inv.setItem(45, item46);
        inv.setItem(46, item47);
        inv.setItem(47, item48);
        inv.setItem(48, item49);
        inv.setItem(49, item50);
        inv.setItem(50, item51);
        inv.setItem(51, item52);
        inv.setItem(52, item53);
        inv.setItem(53, item54);
        p.openInventory(inv);
        p.playSound(p.getLocation(), s, 1.0f, 1.0f);
    }

    public static void BuildMenu27(Player p, Sound s, String disname, int slots, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, ItemStack item10, ItemStack item11, ItemStack item12, ItemStack item13, ItemStack item14, ItemStack item15, ItemStack item16, ItemStack item17, ItemStack item18, ItemStack item19, ItemStack item20, ItemStack item21, ItemStack item22, ItemStack item23, ItemStack item24, ItemStack item25, ItemStack item26, ItemStack item27) {
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, (int)slots, (String)disname);
        inv.setItem(0, item1);
        inv.setItem(1, item2);
        inv.setItem(2, item3);
        inv.setItem(3, item4);
        inv.setItem(4, item5);
        inv.setItem(5, item6);
        inv.setItem(6, item7);
        inv.setItem(7, item8);
        inv.setItem(8, item9);
        inv.setItem(9, item10);
        inv.setItem(10, item11);
        inv.setItem(11, item12);
        inv.setItem(12, item13);
        inv.setItem(13, item14);
        inv.setItem(14, item15);
        inv.setItem(15, item16);
        inv.setItem(16, item17);
        inv.setItem(17, item18);
        inv.setItem(18, item19);
        inv.setItem(19, item20);
        inv.setItem(20, item21);
        inv.setItem(21, item22);
        inv.setItem(22, item23);
        inv.setItem(23, item24);
        inv.setItem(24, item25);
        inv.setItem(25, item26);
        inv.setItem(26, item27);
        p.openInventory(inv);
        p.playSound(p.getLocation(), s, 1.0f, 1.0f);
    }
}

