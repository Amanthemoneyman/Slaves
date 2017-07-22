package me.amanthemoneyman.Slaves.Utils.InventoryAPI;

import me.amanthemoneyman.Slaves.Slaves;

import java.util.ArrayList;

/**
 * Created by alexm on 7/21/2017.
 */
public class PlayerMenuManager {

    private ArrayList<PlayerMenu> menus;
    private Slaves plugin;


    public PlayerMenuManager(Slaves slaves)
    {
        this.plugin = slaves;
        menus = new ArrayList<PlayerMenu>();


    }

    public ArrayList<PlayerMenu> getMenus() {
        return menus;
    }

    public void addMenu(PlayerMenu m)
    {
        if(menus.contains(m))
        {
            return;
        }
        menus.add(m);
    }

    public void removeMenu(PlayerMenu m)
    {
        menus.remove(m);
    }

    public boolean isMenu(PlayerMenu m)
    {
        if(menus.contains(m)) return true;
        return false;


    }
}
