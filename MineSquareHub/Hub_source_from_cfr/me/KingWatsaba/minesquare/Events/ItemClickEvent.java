/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.Sound
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.bukkit.inventory.meta.SkullMeta
 */
package me.KingWatsaba.minesquare.Events;

import Utils.MenuBuilder;
import me.KingWatsaba.minesquare.Menus.BagPack;
import me.KingWatsaba.minesquare.Menus.ParticleMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemClickEvent
implements Listener {
    @EventHandler
    public void GetClickedItem(PlayerInteractEvent e) {
        ItemStack border = new ItemStack(Material.STAINED_GLASS_PANE, 1, 10);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setDisplayName("");
        border.setItemMeta(borderMeta);
        ItemStack border1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, 15);
        ItemMeta borderMeta1 = border1.getItemMeta();
        borderMeta1.setDisplayName("");
        border1.setItemMeta(borderMeta1);
        ItemStack lobby = new ItemStack(Material.BOOKSHELF);
        ItemMeta lobbyMeta = lobby.getItemMeta();
        lobbyMeta.setDisplayName("\u00a7c\u00a7lLobbys \u00a77>> \u00a7fClick to Select a new lobby!");
        lobby.setItemMeta(lobbyMeta);
        ItemStack Particles = new ItemStack(Material.COAL, 1, 1);
        ItemMeta ParticlesMeta = Particles.getItemMeta();
        ParticlesMeta.setDisplayName("\u00a7c\u00a7lParticles \u00a77>> \u00a7fClick to Select a Particle!");
        Particles.setItemMeta(ParticlesMeta);
        ItemStack Wear = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta WearMeta = Wear.getItemMeta();
        WearMeta.setDisplayName("\u00a7c\u00a7lWardrobe \u00a77>> \u00a7fClick to Select For new Clothes!");
        Wear.setItemMeta(WearMeta);
        ItemStack Gadget = new ItemStack(Material.CHEST);
        ItemMeta GadgetMeta = Gadget.getItemMeta();
        GadgetMeta.setDisplayName("\u00a7c\u00a7lGadgets \u00a77>> \u00a7fClick to Select a Gadget!");
        Gadget.setItemMeta(GadgetMeta);
        ItemStack Baloons = new ItemStack(Material.STAINED_CLAY, 1, 13);
        ItemMeta BaloonsMeta = Baloons.getItemMeta();
        BaloonsMeta.setDisplayName("\u00a7c\u00a7lBaloons \u00a77>> \u00a7fClick to Select a Baloon!");
        Baloons.setItemMeta(BaloonsMeta);
        ItemStack Pets = new ItemStack(Material.MONSTER_EGG);
        ItemMeta PetsMeta = Pets.getItemMeta();
        PetsMeta.setDisplayName("\u00a7c\u00a7lPets \u00a77>> \u00a7fClick to Select a Pet!");
        Pets.setItemMeta(PetsMeta);
        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        skull.setDurability(3);
        SkullMeta sm = (SkullMeta)skull.getItemMeta();
        sm.setOwner("Alyzix");
        sm.setDisplayName("\u00a7c\u00a7lHats \u00a77>> \u00a7fClick to Select a Hat!");
        skull.setItemMeta((ItemMeta)sm);
        Player p = e.getPlayer();
        ItemStack menu = new ItemStack(Material.COMPASS);
        ItemMeta menuMeta = menu.getItemMeta();
        menuMeta.setDisplayName("\u00a7c\u00a7lSquare\u00a7fMenu \u00a77>> \u00a7f(\u00a77Right Click\u00a7f)");
        menu.setItemMeta(menuMeta);
        ItemStack DonatorBox = new ItemStack(Material.ENDER_CHEST);
        ItemMeta DonatorBoxMeta = DonatorBox.getItemMeta();
        DonatorBoxMeta.setDisplayName("\u00a7c\u00a7lDonator\u00a7fBox \u00a77>> \u00a7f(\u00a77Right Click\u00a7f)");
        DonatorBox.setItemMeta(DonatorBoxMeta);
        ItemStack Shop = new ItemStack(Material.DIAMOND);
        ItemMeta ShopMeta = Shop.getItemMeta();
        ShopMeta.setDisplayName("\u00a7c\u00a7lVanity\u00a7fUnlocker \u00a77>> \u00a7f(\u00a77Click to unlock\u00a7f)");
        Shop.setItemMeta(ShopMeta);
        ItemStack ItemSlot = new ItemStack(Material.BARRIER);
        ItemMeta ItemSlotMeta = ItemSlot.getItemMeta();
        ItemSlotMeta.setDisplayName("\u00a7c\u00a7lItem&fSlot \u00a77>> \u00a7f(\u00a77Click to select\u00a7f)");
        ItemSlot.setItemMeta(ItemSlotMeta);
        ItemStack BagPack2 = new ItemStack(Material.CHEST);
        ItemMeta BagPackMeta = BagPack2.getItemMeta();
        BagPackMeta.setDisplayName("\u00a7c\u00a7lVanity\u00a7fSelector \u00a77>> \u00a7f(\u00a77Click to select\u00a7f)");
        BagPack2.setItemMeta(BagPackMeta);
        if (p.getInventory().getItemInHand().isSimilar(menu)) {
            MenuBuilder.BuildMenu(p, Sound.BLOCK_ENDERCHEST_OPEN, (Object)ChatColor.RED + "ServerMenu", 54, null, null, null, null, lobby, null, null, null, null, border, border, border, border, border, border, border, border, border, null, border, null, null, null, null, null, border, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        if (p.getInventory().getItemInHand().isSimilar(DonatorBox)) {
            MenuBuilder.BuildMenu(p, Sound.BLOCK_ENDERCHEST_OPEN, (Object)ChatColor.RED + "DonatorBox", 54, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        if (p.getInventory().getItemInHand().isSimilar(Shop)) {
            MenuBuilder.BuildMenu(p, Sound.BLOCK_ENDERCHEST_OPEN, (Object)ChatColor.RED + "Shop", 54, null, null, null, null, null, null, null, null, null, null, Particles, null, skull, null, Wear, null, Gadget, null, null, null, Baloons, null, null, null, Pets, null, null, null, null, null, null, null, null, null, null, null, border1, border1, border1, border1, border1, border1, border1, border1, border1, null, null, null, null, null, null, null, null, null);
        }
        if (p.getInventory().getItemInHand().isSimilar(BagPack2)) {
            MenuBuilder.BuildMenu(p, Sound.BLOCK_ENDERCHEST_OPEN, (Object)ChatColor.RED + "BagPack", 54, null, null, null, null, null, null, null, null, null, null, Particles, null, skull, null, Wear, null, Gadget, null, null, null, Baloons, null, null, null, Pets, null, null, null, null, null, null, null, null, null, null, null, border1, border1, border1, border1, border1, border1, border1, border1, border1, null, null, null, null, null, null, null, null, null);
        }
    }

    @EventHandler
    public void invClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        ItemStack border = new ItemStack(Material.STAINED_GLASS_PANE, 1, 10);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setDisplayName("");
        border.setItemMeta(borderMeta);
        ItemStack Particles = new ItemStack(Material.COAL, 1, 1);
        ItemMeta ParticlesMeta = Particles.getItemMeta();
        ParticlesMeta.setDisplayName("\u00a7c\u00a7lParticles \u00a77>> \u00a7fClick to Select a Particle!");
        Particles.setItemMeta(ParticlesMeta);
        ItemStack lobby = new ItemStack(Material.BOOKSHELF);
        ItemMeta lobbyMeta = lobby.getItemMeta();
        lobbyMeta.setDisplayName("\u00a7c\u00a7lLobbys \u00a77>> \u00a7fClick to Select a new lobby!");
        lobby.setItemMeta(lobbyMeta);
        if (e.getCurrentItem().isSimilar(lobby)) {
            MenuBuilder.BuildMenu27(p, Sound.ENTITY_GENERIC_EXPLODE, (Object)ChatColor.RED + "Lobby's", 27, border, border, border, border, border, border, border, border, border, null, null, null, null, null, null, null, null, null, border, border, border, border, border, border, border, border, border);
        }
        if (e.getCurrentItem().isSimilar(Particles) && p.getOpenInventory().getTopInventory().getName().contains(ChatColor.stripColor((String)"BagPack"))) {
            BagPack.openMenu(p);
        }
        if (e.getCurrentItem().isSimilar(Particles) && p.getOpenInventory().getTopInventory().getName().contains(ChatColor.stripColor((String)"Shop"))) {
            ParticleMenu.opeMenu(p);
        }
    }
}

