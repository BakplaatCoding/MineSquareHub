/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Effect
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.Sound
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.event.player.PlayerToggleFlightEvent
 *  org.bukkit.util.Vector
 */
package me.KingWatsaba.minesquare.Events;

import me.KingWatsaba.minesquare.Main;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class DoubleJump
implements Listener {
    public Main plugin;

    public DoubleJump(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onToggleFlightEvent(PlayerToggleFlightEvent event) {
        Player player = event.getPlayer();
        if (player.getGameMode() == GameMode.CREATIVE) {
            return;
        }
        event.setCancelled(true);
        player.setAllowFlight(false);
        player.setFlying(false);
        player.setVelocity(player.getLocation().getDirection().multiply(0.3).setY(2));
        Player p = player;
        p.getWorld().playSound(p.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 10.0f, -0.3f);
        p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 200);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.getGameMode() != GameMode.CREATIVE && player.getLocation().subtract(0.0, 1.0, 0.0).getBlock().getType() != Material.AIR && !player.isFlying()) {
            player.setAllowFlight(true);
        }
    }
}

