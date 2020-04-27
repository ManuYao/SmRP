/**package fr.mineboyfr.SmRp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class Bed implements Listener {

    @EventHandler
    public void  PlayerBedEnterEvent(PlayerBedEnterEvent e){
        Player p = e.getPlayer();
        if (e.useBed() == e.useBed() && Bukkit.getOnlinePlayers().size() >= 2){
            p.sendMessage(  ChatColor.GOLD + p.getName()+ " Veut dormir");
        }
    }
}**/
