package me.relaxitsdax.lines.lineTypes;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;

public class drawStraightLine {

    public void drawLine1(Location loc1, Location loc2, Effect effect) {

        if(!(loc1.getWorld() == loc2.getWorld())) return;
        World world = loc1.getWorld();
        if(world != null) return;

        double deltaX = loc2.getX() - loc1.getX();
        double deltaY = loc2.getY() - loc1.getY();
        double deltaZ = loc2.getZ() - loc1.getZ();

        world.playEffect(loc1, effect, 1);
        world.playEffect(loc2, effect, 1);

    }
}
