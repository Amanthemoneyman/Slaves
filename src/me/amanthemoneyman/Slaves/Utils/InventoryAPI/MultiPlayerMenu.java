package me.amanthemoneyman.Slaves.Utils.InventoryAPI;

import me.amanthemoneyman.Slaves.Slaves;

import java.util.HashMap;

/**
 * Created by alexm on 7/22/2017.
 */
public class MultiPlayerMenu {

    private Slaves plugin;
    private HashMap<Integer, PlayerMenu> menus;
    private MenuButton forward;
    private MenuButton backward;


    public MultiPlayerMenu(Slaves plugin)
    {
        this.plugin = plugin;


    }

    public MultiPlayerMenu setMenus(HashMap<Integer, PlayerMenu> setMenus)
    {
        this.menus = setMenus;
    return this;
    }

    public MultiPlayerMenu addMenu(Integer pos, PlayerMenu menu)
    {
        if(menus.containsKey(pos))
        {
            return this;
        }
        menus.put(pos, menu);

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

}
