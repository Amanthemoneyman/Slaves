package me.amanthemoneyman.Slaves.AuctionHouse;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.Utils.InventoryAPI.MenuButton;
import me.amanthemoneyman.Slaves.Utils.InventoryAPI.PlayerMenu;

import java.util.ArrayList;

/**
 * Created by alexm on 7/25/2017.
 */
public class AuctionMenu extends PlayerMenu {

    private Slaves plugin;
    private ArrayList<MenuButton> bottomRow;

    public AuctionMenu(String name, Slaves plug)
    {
        super(name, plug);
        this.plugin = plug;


    }


}
