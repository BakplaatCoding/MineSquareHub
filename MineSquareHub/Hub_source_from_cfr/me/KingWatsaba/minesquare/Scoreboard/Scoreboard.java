/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 *  org.bukkit.Bukkit
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
 *  org.bukkit.scoreboard.DisplaySlot
 *  org.bukkit.scoreboard.Objective
 *  org.bukkit.scoreboard.Score
 *  org.bukkit.scoreboard.Scoreboard
 *  org.bukkit.scoreboard.ScoreboardManager
 */
package me.KingWatsaba.minesquare.Scoreboard;

import MySQL.SQLSettings;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import me.KingWatsaba.minesquare.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard
implements Listener {
    public static Main plugin;

    public Scoreboard(Main instance) {
        plugin = instance;
    }

    public static void add(Player p) {
        Random r = new Random();
        String Color2 = "\u00a7" + (1 + r.nextInt(9));
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board = manager.getNewScoreboard();
        Objective objective = board.registerNewObjective("Minesquare", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName((Object)ChatColor.LIGHT_PURPLE + (Object)ChatColor.BOLD + "MineSquare" + (Object)ChatColor.GRAY + " " + Color2 + "\u00a7lV1.0");
        Score spacer = objective.getScore("\u00a7f");
        spacer.setScore(11);
        Score score = objective.getScore((Object)ChatColor.RED + (Object)ChatColor.BOLD + "Creative:" + (Object)ChatColor.GREEN + " 0/0");
        score.setScore(10);
        Score score2 = objective.getScore((Object)ChatColor.RED + (Object)ChatColor.BOLD + "Factions:" + (Object)ChatColor.GREEN + " 0/0");
        score2.setScore(9);
        Score score3 = objective.getScore((Object)ChatColor.RED + (Object)ChatColor.BOLD + "Prison:" + (Object)ChatColor.GREEN + " 0/0");
        score3.setScore(8);
        Score score4 = objective.getScore((Object)ChatColor.RED + (Object)ChatColor.BOLD + "KitPvP:" + (Object)ChatColor.GREEN + " 0/0");
        score4.setScore(7);
        Score spacer1 = objective.getScore((Object)ChatColor.WHITE + "\u00a7f          ");
        spacer1.setScore(6);
        Score score5 = objective.getScore((Object)ChatColor.GOLD + (Object)ChatColor.BOLD + "SquareCoins: " + (Object)ChatColor.GREEN + Main.sql.getCoins(p.getUniqueId()));
        score5.setScore(5);
        Score spacer2 = objective.getScore((Object)ChatColor.WHITE + "\u00a7f      ");
        spacer2.setScore(4);
        Score score6 = objective.getScore((Object)ChatColor.GRAY + (Object)ChatColor.BOLD + "Rank:" + "<rank>");
        score6.setScore(3);
        Score spacer4 = objective.getScore((Object)ChatColor.WHITE + "\u00a7f");
        spacer4.setScore(2);
        Score score7 = objective.getScore((Object)ChatColor.YELLOW + (Object)ChatColor.BOLD + "play.minesquare.net");
        score7.setScore(1);
        p.setScoreboard(board);
    }

    public static void UpdatBoard(Player p) {
        p.getScoreboard().getScores((OfflinePlayer)p);
        Scoreboard.add(p);
    }
}

