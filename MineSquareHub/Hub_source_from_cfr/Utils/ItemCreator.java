/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCreator {
    int items = 0;

    public static void CreateItem(ItemStack names, Material m, ItemMeta meta, String Displayname) {
        names = new ItemStack(m);
        meta = names.getItemMeta();
        meta.setDisplayName(Displayname);
        names.setItemMeta(meta);
    }
}

