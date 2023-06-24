package Gio.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockPlace implements Listener{

    @EventHandler
    public void BlockPlace(BlockPlace event){
        System.out.println("El bloque ha sido colocado");
    }
}
