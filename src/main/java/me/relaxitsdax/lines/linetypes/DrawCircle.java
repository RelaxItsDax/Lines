package me.relaxitsdax.lines.linetypes;


import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import static java.lang.Math.cos;

public class DrawCircle {
    public void drawCircle1(Location loc1, Location loc2, int scalar, Particle particle) {
        if (loc1.getWorld() == loc2.getWorld() && (loc1.getWorld() != null)) {

            double rad = Math.sqrt(Math.pow(loc2.getX() - loc1.getX(), 2) + Math.pow(loc2.getZ() - loc1.getZ(), 2));
            int points = (int) Math.round(rad) * scalar;

            for (int i = 0; i < points; i++) {

                Location pointLoc = new Location(loc1.getWorld(),
                        loc1.getX() + rad * Math.cos(i * 2 * Math.PI / points),
                        loc1.getY(),
                        loc1.getZ() + rad * Math.sin(i * 2 * Math.PI / points));

                loc1.getWorld().spawnParticle(particle, pointLoc, 1, 0, 0, 0, 0);

            }
        } else {
            System.out.println("Bro you gotta make them the same world lmao");
        }
    }

    public void drawCircle2(Location loc, double rad, int scalar, Particle particle) {
        int points = (int) Math.round(rad) * scalar;

        for (int i = 0; i < points; i++) {

            Location pointLoc = new Location(loc.getWorld(),
                    loc.getX() + rad * Math.cos(i * 2 * Math.PI / points),
                    loc.getY(),
                    loc.getZ() + rad * Math.sin(i * 2 * Math.PI / points));

            loc.getWorld().spawnParticle(particle, pointLoc, 1, 0, 0, 0, 0);

        }
    }


    public void drawArc(Location loc, double radius, double startDeg, double stopDeg, int scalar, Particle particle) {

        startDeg = Math.toRadians(startDeg);
        stopDeg = Math.toRadians(stopDeg);

        int points = (int) Math.round(radius) * scalar;

        for (int i = 0; i < points; i++) {

            double deg = i * 2 * Math.PI / points;

            if (startDeg < deg && deg < stopDeg) {
                Location pointLoc = new Location(loc.getWorld(),

                        loc.getX() + radius * Math.cos(deg),
                        loc.getY(),
                        loc.getZ() + radius * Math.sin(deg));

                loc.getWorld().spawnParticle(particle, pointLoc, 1, 0, 0, 0, 0);

            }


        }
    }
}
