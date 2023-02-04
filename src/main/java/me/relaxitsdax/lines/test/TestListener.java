package me.relaxitsdax.lines.test;

import me.relaxitsdax.lines.linetypes.DrawStraightLine;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TestListener implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {

            Location loc1 = player.getTargetBlock(null, 10).getLocation();


            new DrawStraightLine().drawLine1(loc1, player.getEyeLocation(), Particle.FLAME);
        }
    }
}
