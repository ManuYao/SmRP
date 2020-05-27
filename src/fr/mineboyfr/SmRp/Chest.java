package fr.mineboyfr.SmRp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

import java.util.Objects;

public class Chest implements Listener {

    @EventHandler
    private void chest(InventoryMoveItemEvent e) {
        Player p = (Player) e;
        InventoryMoveItemEvent chest = (InventoryMoveItemEvent) e;
        Material openEvent = Material.CHEST_MINECART;

        if (openEvent.equals("coffre")) {
            System.out.println("Code Yes");
            p.sendMessage("Le code fonctionne");
        }else {
            Objects.requireNonNull(e.getItem().getItemMeta()).getDisplayName().equalsIgnoreCase(" coffre");
            p.sendMessage("f");
        }
        {
            p.sendMessage("Ok ok Nice");
        }
    }
}