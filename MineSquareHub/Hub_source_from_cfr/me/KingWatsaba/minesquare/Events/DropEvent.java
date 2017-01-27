/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerDropItemEvent
 */
package me.KingWatsaba.minesquare.Events;

import java.util.ArrayList;
import me.KingWatsaba.minesquare.Commands.BuildMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropEvent
implements Listener {
    @EventHandler
    public void onPlayerDrop(PlayerDropItemEvent e) {
        if (BuildMode.isInBuildMode.contains((Object)e.getPlayer())) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }
}

