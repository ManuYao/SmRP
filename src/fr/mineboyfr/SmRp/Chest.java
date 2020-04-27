package fr.mineboyfr.SmRp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public class Chest implements Listener {

    @EventHandler
    private void chest (InventoryMoveItemEvent e){
        Player p = (Player) e;

    }
}
