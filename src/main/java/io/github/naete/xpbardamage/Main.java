package io.github.naete.xpbardamage;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    PluginManager manager = getServer().getPluginManager();

    @Override
    public void onEnable() {

        // Events
        manager.registerEvents(new EventHandlers(), this);

    }

}
