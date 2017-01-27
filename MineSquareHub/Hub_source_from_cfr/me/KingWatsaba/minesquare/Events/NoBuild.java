/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockPlaceEvent
 */
package me.KingWatsaba.minesquare.Events;

import java.util.ArrayList;
import me.KingWatsaba.minesquare.Commands.BuildMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class NoBuild
implements Listener {
    @EventHandler
    public void noBuild(BlockPlaceEvent e) {
        if (BuildMode.isInBuildMode.contains((Object)e.getPlayer())) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }
    }
}

