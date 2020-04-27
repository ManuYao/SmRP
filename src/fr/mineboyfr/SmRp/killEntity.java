package fr.mineboyfr.SmRp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class killEntity implements Listener {

    @EventHandler
    public void onEDeath(EntityDeathEvent event) {
        Player player = event.getEntity().getKiller();
        if (player != null) {
            System.out.println("heyyy");
            if (event.getEntity().getCustomName().equalsIgnoreCase(ChatColor.BOLD + "SmRP" + ChatColor.GOLD + "Test")) {
                ItemStack stuf = new ItemStack(Material.ROTTEN_FLESH, 1, (byte) 4);
                event.getDrops().clear();
                ItemStack stack = new ItemStack(Material.DIAMOND_BLOCK, 15);
                event.setDroppedExp(30000);
                player.sendMessage("MORT");
                //event.getDrops().add(stack);
                player.getLocation().getWorld().dropItem(player.getLocation(), stack);
            }
        }else {
            return;
        }
    }
}

