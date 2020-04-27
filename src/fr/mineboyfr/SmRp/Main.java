package fr.mineboyfr.SmRp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author YAO
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("smrp").setExecutor(new SpawnPng.SmRpCmd());
        getServer().getPluginManager().registerEvents((Listener) new PlayerEntity(),this);
        getServer().getPluginManager().registerEvents((Listener) new killEntity(), this);
        //getServer().getPluginManager().registerEvents((Listener)new Bed(),this);

        System.out.println("----------------------------");
        System.out.println("----------ON-SMRP-----------");
        System.out.println("----------------------------");
    }

    @Override
    public void onDisable() {
        System.out.println("-----------------------------");
        System.out.println("----------OFF-SMRP-----------");
        System.out.println("-----------------------------");
    }
}
