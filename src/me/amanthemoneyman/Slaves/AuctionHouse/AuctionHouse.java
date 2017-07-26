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
    private ArrayList<PlayerMenu> ahpages;
    private ArrayList<SlaveButton> slaves;
    private ArrayList<String> viewing;
    private int pagecount;


    public AuctionHouse(Slaves plugin)
    {
        this.plugin = plugin;

        ahpages = new ArrayList<PlayerMenu>();
        slaves = new ArrayList<SlaveButton>();
        pagecount = 0;


    }

    public ArrayList<PlayerMenu> getAhPages() {
        return ahpages;
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
        int i = 0;
        for(SlaveButton s : this.slaves)
        {
            i++;

            if(i == 45)
            {


            }

        }



    }

    public void open(Player p)
    {

    }

    public void removeViewing(String playerName)
    {
       this.viewing.remove(playerName);


    }

    public boolean isViewing(String playerName)
    {
        if(this.viewing.contains(playerName))return true;
        return false;

    }

    public void addViewing(String playerName)
    {
        if(this.viewing.contains(playerName))
        {
            return;
        }
        this.viewing.add(playerName);

    }

}
