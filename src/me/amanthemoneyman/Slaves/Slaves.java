package me.amanthemoneyman.Slaves;

import me.amanthemoneyman.Slaves.SlavesClasses.Managers.SlaveTracker;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by alexm on 6/30/2017.
 */
public class Slaves extends JavaPlugin {
    /**
     * -Slaves-
     * Goal: Create a plugin that allows players to buy, sell, and find slaves that will do various jobs for them
     * Slave >> Does work for player, can have different strengths that apply to different jobs such as good at stealing (Not getting caught by police)
     * Slave Auction House >> Choose from a variety of different slaves that are either generated or sold by fellow players
     * Different Abilities >> Stealing, Mining, Farming, ???
     *  Stealing > The better the slave is the less chance of getting caught, if caught a fine has to be paid by the owner or the slave is taken away for multiple days (Real Days) depending on the value of stolen goods
     *  Mining > The better the slave is at mining the more resources it can gather in a time period and the higher tier of resource it can mine (Coal, Iron, Gold, Diamond)
     *  Growing/Harvesting > The better the slave is at Growing/Harvesting the more it can produce in a single harvest, each harvest will take an hour.
     *
     *
     */
    public static final String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Slaves" + ChatColor.DARK_GRAY + "]";

    public void onEnable()
    {
        loadClasses();


    }

    public void onDisable()
    {




    }
    public SlaveTracker st;

    private void loadClasses(){
        st = new SlaveTracker(this);



    }
}
