package Gio.example;

import java.net.http.WebSocket.Listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener, org.bukkit.event.Listener{

    @EventHandler   
    public void BlockBreak(BlockBreakEvent event){
        
        System.out.println("El bloque ha sido roto");

        Block block = event.getBlock();

        if (block.getType() == Material.STONE){
            block.setType(Material.DIRT);
        
            event.setCancelled(true);
        }
        else{
            Player player = event.getPlayer();
            String name = player.getName();
            player.sendMessage("que lo que" + name);
        }
    }
}
