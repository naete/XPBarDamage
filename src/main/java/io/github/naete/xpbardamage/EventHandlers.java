package io.github.naete.xpbardamage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EventHandlers implements Listener {


    @EventHandler
    public void onEntityDamageByEntity (EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {

            int damage = (int) event.getDamage();
            Player damager = (Player) event.getDamager();

            damager.setLevel(damage);
        }
    }

}
