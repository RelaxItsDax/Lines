package me.relaxitsdax.lines.control;

import me.relaxitsdax.lines.Lines;
import me.relaxitsdax.lines.linetypes.DrawCircle;
import me.relaxitsdax.lines.linetypes.DrawStraightLine;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Control {

    public static int t = 0;

    public void startControl(Player player) {
        World world = player.getWorld();
        double r = 5;
        int vertices = 4;
        new BukkitRunnable() {
            @Override
            public void run() {

                //int vertices = (int) 1 + Math.round(t / 20);

                Location loc = player.getLocation();

                if (vertices != 0) {
                    for (int i = 0; i < vertices; i++) {
                        //loc.getWorld().spawnParticle(Particle.CRIT_MAGIC, loc.getX() + cos(Math.toRadians(t + i * 120)), loc.getY() + 1 + sin(Math.toRadians(t)), loc.getZ() + sin(Math.toRadians(t + i * 120)), 1, 0, 0, 0, 0);
                        new DrawStraightLine().drawLine1(new Location(world, loc.getX() + 4 * cos(Math.toRadians(t + (i + 1) * 360 / vertices)), loc.getY(), loc.getZ() + 4 * sin(Math.toRadians(t + (i + 1) * 360 / vertices))), new Location(world, loc.getX() + 4 * cos(Math.toRadians(t + i * 360 / vertices)), loc.getY(), loc.getZ() + 4 * sin(Math.toRadians(t + i * 360 / vertices))), Particle.FLAME);
                    }
                }
                //new DrawCircle().drawEllipse1(loc, 5, 10, 1 + cos(Math.toRadians((t))), 1 + sin(Math.toRadians((t))), Particle.FLAME);

                //new DrawCircle().drawCircle2(loc, 4 * (cos(Math.toRadians(t)) + 2), 10, Particle.FLAME);



                /*
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
                */
                if (t == 360) {
                    t = -1;
                }
                t++;

            }
        }.runTaskTimer(Lines.getInstance(), 1, 1);

    }



}
