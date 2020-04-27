package fr.mineboyfr.SmRp;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;



/**
 * @author : MineBoyFR
 * @deprecated : Lorsque l'utilisateur exécute la command plusieurs conditions seront demandées
 */
public class SpawnPng {
    public static class SmRpCmd implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender commandP, Command cmd, String pS, String[] strings) {
            // /smrp
            if (commandP instanceof Player) {
                Player p = (Player) commandP;

                //Spawn Mob condition
                ItemStack it1 = new ItemStack(Material.DIAMOND_BLOCK, 30);
                ItemStack it2 = new ItemStack(Material.DIAMOND_BLOCK, 64);
                if (p.getInventory().contains(it1) || p.getInventory().contains(it2)) {
                    Villager v = (Villager) p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
                    v.setCustomName(ChatColor.BOLD + "SmRP" + ChatColor.GOLD + "Test");
                    v.setAI(false);
                    v.setCustomNameVisible(true);
                    v.getEquipment().setHelmet(new ItemStack(Material.BELL, 1));
                    Bukkit.getWorld("world").playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 10, 1);
                    p.sendTitle(ChatColor.GOLD + "Tu vien d'invoquer le " + ChatColor.AQUA + "Guide", null);

                        //clear que le Diamand
                        if (p.getInventory().contains(it1) || p.getInventory().contains(it2)) {
                            p.getInventory().remove(it1);
                            //p.getInventory().remove(it2);
                        }
                } else {
                    p.sendMessage(ChatColor.DARK_GRAY + "Vous n'avez pas " + ChatColor.WHITE + "" + ChatColor.BOLD + " || " + ChatColor.AQUA + "30 Block Diamond");
                    Bukkit.getWorld("world").playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 10, 1);
                }
            }
            return true;
        }
    }

}
