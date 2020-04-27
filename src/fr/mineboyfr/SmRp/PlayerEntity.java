package fr.mineboyfr.SmRp;

import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


/**
 * @author MineBoyFR
 * @deprecated :
 * Player Entity :
 * Create interct of player and open Menu
 * inv :
 * Create Menu and Iteam Custom
 */
 /*
public class PlayerEntity implements Listener {
                                                                                                    //---Menu Item No Fonction----
    private static Inventory inv = Bukkit.createInventory(null, 36, ChatColor.GOLD + " " + ChatColor.BOLD + "Smrp Test Inventory");

    static {
        //create Item custom
        ItemStack lime0 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime0 = lime0.getItemMeta();
        metaLime0.setDisplayName("  ");
        lime0.setItemMeta(metaLime0);
        inv.setItem(4, lime0);
        ItemStack lime = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime = lime.getItemMeta();
        metaLime.setDisplayName("  ");
        lime.setItemMeta(metaLime);
        inv.setItem(13, lime);
        ItemStack lime1 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime1 = lime1.getItemMeta();
        metaLime1.setDisplayName("  ");
        lime1.setItemMeta(metaLime1);
        inv.setItem(22, lime1);
        ItemStack lime2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime2 = lime2.getItemMeta();
        metaLime2.setDisplayName("  ");
        lime2.setItemMeta(metaLime2);
        inv.setItem(30, lime2);
        ItemStack lime3 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime3 = lime3.getItemMeta();
        metaLime3.setDisplayName("  ");
        lime3.setItemMeta(metaLime3);
        inv.setItem(32, lime3);
        ItemStack lime4 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime4 = lime4.getItemMeta();
        metaLime4.setDisplayName("  ");
        lime4.setItemMeta(metaLime4);
        //inv.setItem(5, lime4);
        ItemStack lime5 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime5 = lime5.getItemMeta();
        metaLime5.setDisplayName("  ");
        lime4.setItemMeta(metaLime5);
        //inv.setItem(6, lime0);
        ItemStack limebis6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLimebis6 = limebis6.getItemMeta();
        metaLime.setDisplayName("  ");
        limebis6.setItemMeta(metaLimebis6);
        //inv.setItem(7, lime);
        ItemStack lime6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
        ItemMeta metaLime6 = lime6.getItemMeta();
        metaLime6.setDisplayName("  ");
        lime6.setItemMeta(metaLime0);
        //inv.setItem(8, lime0);

                                                                                                    //---create Item add fonction---

        ItemStack item = new ItemStack(Material.BELL, 1);
        ItemMeta meta1 = item.getItemMeta();
        meta1.setDisplayName("Decouvert");
        ArrayList<String> Lore = new ArrayList<>();
        Lore.add(ChatColor.RED + "Soon");
        meta1.setLore(Lore);
        item.setItemMeta(meta1);
        inv.setItem(31, item);
    }


    */






















/* Le Bug est ici je ne pige pas quand j'ouvre mon inventaire Perso il me crée un bug tu peut aider et j'ai tous essayer */
    @EventHandler
    public void fonctionItem(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        //Item Test
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Decouvert")) {
            p.sendMessage("Hey");
            p.closeInventory();
            e.setCancelled(true);
        }

        while (e.getCurrentItem().getItemMeta().getDisplayName().contains("  ")) {
            e.setCancelled(true);
            break;
        }
        while (!e.getClickedInventory().getType().equals(inv) || e.getClickedInventory() == null){
            return;
        }
        if (e.getClickedInventory().getType() == InventoryType.PLAYER){
            p.sendMessage("Pk tu bugggggggggg!");
            return;
        }
    }


























    /*
     Version Alogo test, Le but s'il est 0 de tique la couleur du Png sera bleu,
     puis plus la journée plus la couleur changée jusqu'à arriver à rouge
     puis une foi rouge il disparaît */

   /*                                                                                                                //interact smRP
    @EventHandler
    public void PlayerEntity(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().isCustomNameVisible() && !player.getInventory().getItemInMainHand().getType().equals(Material.CLOCK)) {
            player.openInventory(inv);
            Bukkit.getWorld("world").playSound(player.getLocation(), Sound.UI_TOAST_OUT, 10, 050);
            Bukkit.getWorld("world").playEffect(player.getLocation(), Effect.SMOKE, 1, 1);
        }
        if (event.getRightClicked().isCustomNameVisible() && player.getInventory().getItemInHand().getType().equals(Material.CLOCK)) {
            PlayerE(player);
        }
    }

    @EventHandler
    private void PlayerE(Entity e) {
        Player p = (Player) e;
        if (e.getWorld().getTime() <= 4000) {
            e.playEffect(EntityEffect.VILLAGER_HAPPY);
            p.sendMessage(ChatColor.DARK_GRAY + "Matin " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.AQUA + "Niv de vie 1");

        } else if (e.getWorld().getTime() <= 8000) {
            p.sendMessage(ChatColor.DARK_GRAY + "MidiMatin " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.YELLOW + "Niv de vie 2");

        } else if (e.getWorld().getTime() <= 10000) {
            p.sendMessage(ChatColor.DARK_GRAY + "Midi " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.GOLD + "Niv de vie 3");

        } else if (e.getWorld().getTime() <= 15000) {
            p.sendMessage(ChatColor.DARK_GRAY + "après-Midi " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.RED + "Niv de vie 4");

        } else if (e.getType().equals(EntityType.VILLAGER) && e.isCustomNameVisible() && e.getWorld().getTime() <= 23000) {
            p.sendMessage(ChatColor.DARK_GRAY + "Nuit " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.DARK_RED + "Niv de vie 5");
        }
    }

}
*/

