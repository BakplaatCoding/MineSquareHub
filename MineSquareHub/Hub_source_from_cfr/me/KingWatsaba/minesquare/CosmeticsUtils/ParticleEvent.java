/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerMoveEvent
 */
package me.KingWatsaba.minesquare.CosmeticsUtils;

import Utils.ParticleUtil;
import java.util.ArrayList;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ParticleEvent
implements Listener {
    public static ArrayList<Player> FLAME = new ArrayList();
    public static ArrayList<Player> SMOKE = new ArrayList();
    public static ArrayList<Player> ENDER = new ArrayList();
    public static ArrayList<Player> MUSIC = new ArrayList();
    public static ArrayList<Player> REDSTONE = new ArrayList();
    public static ArrayList<Player> HEART = new ArrayList();
    public static ArrayList<Player> ENCHANT = new ArrayList();
    public static ArrayList<Player> WATER = new ArrayList();
    public static ArrayList<Player> SLIME = new ArrayList();
    public static ArrayList<Player> SNOWBALL = new ArrayList();
    public static ArrayList<Player> MAGIC = new ArrayList();
    public static ArrayList<Player> CLOUD = new ArrayList();
    public static ArrayList<Player> CRIT = new ArrayList();
    public static ArrayList<Player> DARK = new ArrayList();

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if (FLAME.contains((Object)p)) {
            ParticleUtil.ParticleEffect.FLAME.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (ENDER.contains((Object)p)) {
            ParticleUtil.ParticleEffect.PORTAL.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (SMOKE.contains((Object)p)) {
            ParticleUtil.ParticleEffect.SMOKE_LARGE.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (MUSIC.contains((Object)p)) {
            ParticleUtil.ParticleEffect.NOTE.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (REDSTONE.contains((Object)p)) {
            ParticleUtil.ParticleEffect.REDSTONE.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (HEART.contains((Object)p)) {
            ParticleUtil.ParticleEffect.HEART.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (ENCHANT.contains((Object)p)) {
            ParticleUtil.ParticleEffect.ENCHANTMENT_TABLE.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (WATER.contains((Object)p)) {
            ParticleUtil.ParticleEffect.WATER_SPLASH.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (SLIME.contains((Object)p)) {
            ParticleUtil.ParticleEffect.SLIME.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (SNOWBALL.contains((Object)p)) {
            ParticleUtil.ParticleEffect.SNOWBALL.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (MAGIC.contains((Object)p)) {
            ParticleUtil.ParticleEffect.CRIT_MAGIC.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (CLOUD.contains((Object)p)) {
            ParticleUtil.ParticleEffect.CLOUD.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (CRIT.contains((Object)p)) {
            ParticleUtil.ParticleEffect.CRIT.display(0.0f, 0.0f, 0.0f, 0.05f, 10, p.getLocation(), 15.0);
        }
        if (DARK.contains((Object)p)) {
            ParticleUtil.ParticleEffect.CRIT_MAGIC.display(0.0f, 0.0f, 0.0f, 0.05f, 2, p.getLocation(), 15.0);
            ParticleUtil.ParticleEffect.SMOKE_LARGE.display(0.0f, 0.0f, 0.0f, 0.05f, 2, p.getLocation(), 15.0);
        }
    }

    public static void RemoveParticle(Player p) {
        FLAME.remove((Object)p);
        SMOKE.remove((Object)p);
        ENDER.remove((Object)p);
        MUSIC.remove((Object)p);
        REDSTONE.remove((Object)p);
        HEART.remove((Object)p);
        ENCHANT.remove((Object)p);
        WATER.remove((Object)p);
        SLIME.remove((Object)p);
        SNOWBALL.remove((Object)p);
        MAGIC.remove((Object)p);
        CLOUD.remove((Object)p);
        CRIT.remove((Object)p);
        DARK.remove((Object)p);
    }
}

