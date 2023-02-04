package me.relaxitsdax.lines;

import me.relaxitsdax.lines.control.Control;
import me.relaxitsdax.lines.test.TestListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lines extends JavaPlugin {

    private static Lines INSTANCE;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TestListener(), this);

        INSTANCE = this;

        new Control().startControl();

    }

    @Override
    public void onDisable() {



    }
    public static Lines getInstance() {
        return INSTANCE;
    }
}
