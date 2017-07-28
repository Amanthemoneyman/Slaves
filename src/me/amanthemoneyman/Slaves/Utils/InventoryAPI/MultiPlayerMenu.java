package me.amanthemoneyman.Slaves.Utils.InventoryAPI;

import me.amanthemoneyman.Slaves.Slaves;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexm on 7/22/2017.
 */
public class MultiPlayerMenu {

    private Slaves plugin;
    private HashMap<Integer, PlayerMenu> menus;
    private ArrayList<MenuButton> bottomrow;


    public MultiPlayerMenu(Slaves plugin)
    {
        this.plugin = plugin;
        bottomrow = new ArrayList<MenuButton>();
        createButtions();



    }

    public MultiPlayerMenu setMenus(HashMap<Integer, PlayerMenu> setMenus)
    {
        this.menus = setMenus;
    return this;
    }

    public MultiPlayerMenu addMenu()
    {


        return this;
    }

    public MultiPlayerMenu removeMenu(Integer pos)
    {
        if(menus.containsKey(pos))
        {
            menus.remove(pos);
        }
        return this;


    }

    private boolean isLastMenu(Inventory e)
    {

    }

    private void createButtions()
    {
        MenuButton backward;
        MenuButton forward;
        MenuButton filler;
        forward = new MenuButton("&4Forward")

        {
            @Override
            public void onClick(InventoryClickEvent e) {


            }
        };
    }


}
