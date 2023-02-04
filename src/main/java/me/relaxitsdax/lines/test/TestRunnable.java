package me.relaxitsdax.lines.test;

import me.relaxitsdax.lines.control.Control;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class TestRunnable {

    public void startTheCube(World world, double r) {
        int t = new Control().getT();
        double t1 = Math.toRadians(t);
        double t2 = Math.toRadians(t + 90);
        double t3 = Math.toRadians(t + 180);
        double t4 = Math.toRadians(t + 270);

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

}
