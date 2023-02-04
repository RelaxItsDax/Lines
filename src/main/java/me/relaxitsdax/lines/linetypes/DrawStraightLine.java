package me.relaxitsdax.lines.linetypes;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

public class DrawStraightLine {

    public void drawLine1(Location loc1, Location loc2, Particle particle) {

        //if(!(loc1.getWorld() == loc2.getWorld())) return; These weren't working when i tried them, it just goofed out :D
        World world = loc1.getWorld();
        //if(world != null) return;

        double deltaX = loc2.getX() - loc1.getX();
        double deltaY = loc2.getY() - loc1.getY();
        double deltaZ = loc2.getZ() - loc1.getZ();



        double c = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2) + Math.pow(deltaZ, 2));

        int divisions = (int) Math.round(c / 0.3);

        for (int i = 1; i < divisions; i++) {
            world.spawnParticle(particle, new Location(world, loc1.getX() + (deltaX) * i / divisions, loc1.getY() + (deltaY) * i / divisions, loc1.getZ() + (deltaZ) * i / divisions), 1, 0, 0, 0, 0);
        }

    }
}
