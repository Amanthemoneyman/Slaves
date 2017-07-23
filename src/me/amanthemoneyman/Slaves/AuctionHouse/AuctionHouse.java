package me.amanthemoneyman.Slaves.AuctionHouse;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.Utils.InventoryAPI.PlayerMenu;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * Created by alexm on 7/22/2017.
 */
public class AuctionHouse {

    private Slaves plugin;
    private ArrayList<PlayerMenu> ahmenus;
    private ArrayList<SlaveButton> slaves;
    private int pages;


    public AuctionHouse(Slaves plugin)
    {
        this.plugin = plugin;

        ahmenus = new ArrayList<PlayerMenu>();
        slaves = new ArrayList<SlaveButton>();
        pages = 0;


    }

    public ArrayList<PlayerMenu> getAhmenus() {
        return ahmenus;
    }

    public ArrayList<SlaveButton> getSlaveButtons() {
        return slaves;
    }

    public void setSlavesButtons(ArrayList<SlaveButton> slaves) {
        this.slaves = slaves;
    }

    public void addSlaveButton(SlaveButton slaveButton)
    {
        if(slaves.contains(slaveButton)) return;
        slaves.add(slaveButton);

    }

    public void updateAh()
    {
      //  for(int i = 0; pages <= 47 ; )


    }

    public void open(Player p)
    {

    }

}
