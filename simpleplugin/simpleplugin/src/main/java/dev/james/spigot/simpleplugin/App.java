package dev.james.spigot.simpleplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Welcome to MC");
    }
    public void onEnable() {

        Bukkit.getServer().getLogger().info(" Simple Plugin enabled!");
    
        
    }
    public void onDisable() {

        Bukkit.getServer().getLogger().info(" Simple Plugin disabled correctly!");
    }

}

