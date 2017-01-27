/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.FoodLevelChangeEvent
 */
package me.KingWatsaba.minesquare.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NoFood
implements Listener {
    @EventHandler
    public void onPlayerFoodChange(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
}

