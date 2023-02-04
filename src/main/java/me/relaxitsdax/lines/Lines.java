package me.relaxitsdax.lines;

import me.relaxitsdax.lines.test.TestListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lines extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TestListener(), this);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
