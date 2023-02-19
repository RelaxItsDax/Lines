package me.relaxitsdax.lines.test;

import me.relaxitsdax.lines.control.Control;
import me.relaxitsdax.lines.linetypes.DrawStraightLine;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static me.relaxitsdax.lines.control.Control.t;

public class TestRunnable {

    /*
    public void startTheCube(World world, double r) {
        double t1 = Math.toRadians(t);
        double t2 = Math.toRadians(t + 90);
        double t3 = Math.toRadians(t + 180);
        double t4 = Math.toRadians(t + 270);

        Map<Integer, Location> pointMap = new HashMap<>();

        for (int i = 1; i < 5; i++) {
            pointMap.put(i, new Location(world, r * cos(Math.toRadians(t + i * 90)), 69, r * sin(Math.toRadians(t + i * 90))));
            pointMap.put(i + 4, new Location(world, r * cos(Math.toRadians(t + i * 90)), 69 + r, r * sin(Math.toRadians(t + i * 90))));
        }

        for (int i = 0; i < 9; i++) {
            if (i != 8) {
                new DrawStraightLine().drawLine1(pointMap.get(i), pointMap.get(i++), Particle.FLAME);
            }  else {
                new DrawStraightLine().drawLine1(pointMap.get(i), pointMap.get(1), Particle.FLAME);
            }
        }



                //Location(world, r * cos(t), 69, r * sin(t));

        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t1), 69, r * sin(t1)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t2), 69, r * sin(t2)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t3), 69, r * sin(t3)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t4), 69, r * sin(t4)), 1, 0, 0, 0, 0);

        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t1), 69 + r, r * sin(t1)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t2), 69 + r, r * sin(t2)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t3), 69 + r, r * sin(t3)), 1, 0, 0, 0, 0);
        world.spawnParticle(Particle.FLAME, new Location(world, r * cos(t4), 69 + r, r * sin(t4)), 1, 0, 0, 0, 0);




    }

     */

}
