/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.InventoryView
 */
package Utils;

import MySQL.SQLSettings;
import Utils.Messages;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import me.KingWatsaba.minesquare.Menus.ConfirmMenu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;

public class ISBuying {
    public static SQLSettings sql;
    static Main plugin;

    public ISBuying(Main instance) {
        plugin = instance;
    }

    public static void BuyItem(String Name, int cost, String perm, Player p) {
        if (p.hasPermission(perm)) {
            p.getOpenInventory().close();
            return;
        }
        if (!p.hasPermission(perm)) {
            int coins = Main.sql.getCoins(p.getUniqueId());
            if (coins < cost) {
                p.sendMessage(String.valueOf(Messages.prefix) + "You dont have Enough coins :(");
            } else {
                ConfirmMenu.opeMenu(p, Name);
            }
        }
    }
}

