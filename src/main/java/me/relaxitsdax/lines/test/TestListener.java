package me.relaxitsdax.lines.test;

import me.relaxitsdax.lines.control.Control;
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
import org.bukkit.util.Vector;

public class TestListener implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            //if(event.getItem().isSimilar(Material.DIAMOND_SWORD)) {

            }

            new DrawStraightLine().drawLine1(new INeedToThinkOfAName().getLooking(player, 10), player.getEyeLocation(), Particle.CRIT_MAGIC);

        }



    @EventHandler
    public void onEgg(PlayerEggThrowEvent event) {
        new Control().startControl();
    }
}
