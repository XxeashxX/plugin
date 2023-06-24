package Gio.example;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    public void onEnable(){
        System.out.println("hello");
        getServer().getPluginManager().registerEvents((Listener) new BlockBreak(), this);
        getServer().getPluginManager().registerEvents((Listener) new BlockPlace(), this);
        
    }
}
