package me.relaxitsdax.lines.test;

import me.relaxitsdax.lines.Lines;
import me.relaxitsdax.lines.control.Control;
import me.relaxitsdax.lines.linetypes.DrawCircle;
import me.relaxitsdax.lines.linetypes.DrawStraightLine;
import me.relaxitsdax.lines.util.INeedToThinkOfAName;
import org.bukkit.*;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class TestListener implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            //if(event.getItem().isSimilar(Material.DIAMOND_SWORD)) {

            }

            //new DrawStraightLine().drawLine1(new INeedToThinkOfAName().getLooking(player, 10), player.getEyeLocation(), Particle.CRIT_MAGIC);
            //new DrawCircle().drawCircle2(player.getLocation(), 3, 100, Particle.FLAME);
            //new DrawCircle().drawCircle1(player.getEyeLocation(), player.getEyeLocation().add(3, 0, 0), 100, Particle.FLAME);

        new DrawCircle().drawArc(player.getLocation(), 1.5, player.getLocation().getYaw() + 180 - 90 - 30, player.getLocation().getYaw() + 180 - 90 + 30, 100, Particle.FLAME);


    }



    @EventHandler
    public void onEgg(PlayerEggThrowEvent event) {
        new Control().startControl();
    }
}
