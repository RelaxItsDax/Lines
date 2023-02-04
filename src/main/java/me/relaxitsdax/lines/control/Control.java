package me.relaxitsdax.lines.control;

import me.relaxitsdax.lines.Lines;
import org.bukkit.scheduler.BukkitRunnable;

public class Control {

    private int t = 0;

    public Control() {
        this.t = t;
    }

    public int getT() {return t;}

    public void startControl() {

        new BukkitRunnable() {
            @Override
            public void run() {

                t++;

                if (t == 360) {
                    t = 0;
                    t--;
                }
                t++;
            }
        }.runTaskTimer(Lines.getInstance(), 20, 20);

    }



}
