/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByBlockEvent
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 */
package me.KingWatsaba.minesquare.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class AtackEvent
implements Listener {
    @EventHandler
    public void EntityAtack(EntityDamageByEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void EntityBlock(EntityDamageByBlockEvent e) {
        e.setCancelled(true);
    }
}

