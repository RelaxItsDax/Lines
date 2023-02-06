package me.relaxitsdax.lines.util;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;

public class INeedToThinkOfAName {

    public Location getLooking(LivingEntity livingEntity, double distance) {
        // Getting eye location
        Location eyeLocation = livingEntity.getEyeLocation();
        // Get dir the eyes are looking at
        Vector direction = eyeLocation.getDirection();
        // Normalize (set lenght to 1) then scale
        Vector scaledDir = direction.clone().normalize().multiply(distance);
        // Adding scaled direction to eye location
        World world = eyeLocation.getWorld();
        double x = scaledDir.getX() + eyeLocation.getX();
        double y = scaledDir.getY() + eyeLocation.getY();
        double z = scaledDir.getZ() + eyeLocation.getZ();

        return new Location(world, x, y, z);

    }
}
