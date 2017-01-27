/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 */
package me.KingWatsaba.minesquare.Events;

import java.util.ArrayList;
import me.KingWatsaba.minesquare.Commands.BuildMode;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryMoveEvent
implements Listener {
    @EventHandler
    public void onInvMove(InventoryClickEvent e) {
        if (BuildMode.isInBuildMode.contains((Object)e.getWhoClicked())) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }
}

