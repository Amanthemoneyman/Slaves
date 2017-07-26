package me.amanthemoneyman.Slaves.Utils.InventoryAPI;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.Utils.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexm on 7/21/2017.
 */
public class PlayerMenu implements Listener{

    private String name;
    private HashMap<Integer, MenuButton> menuButtons;
    private int size;
    private Slaves plugin;
    private ArrayList<String> viewing;

    public PlayerMenu(String name, Slaves plug)
    {

        this.name = ChatColor.translateAlternateColorCodes('&', name);
        this.menuButtons = new HashMap<Integer, MenuButton>();
        this.plugin = plug;
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);


    }

    public PlayerMenu size(int i)
    {
        if(Utilities.isMultipleOf(8, i))
        {
            this.size = size;


        } else
        {
            Utilities.error(i + " Is not a possible inventory size \n Error while setting size of menu : " + name);


        }
        return this;

    }

    public PlayerMenu setButton(MenuButton button, int pos)
    {
        if(pos >= 0 )
        {
            if(pos < size)
            {
                menuButtons.put(pos, button);

            }

        }
        return this;

    }

    public boolean isViewing(String player)
    {
        if(viewing.contains(player)) return true;
        return false;
    }

    public void removeViewing(String player)
    {
        this.viewing.remove(player);
    }

    public void addViewing(String player)
    {
        if(isViewing(player))
        {
            return;
        }
        viewing.add(player);
    }
    public String getName() {
        return name;
    }

    public HashMap<Integer, MenuButton> getMenuButtons() {
        return menuButtons;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {

        this.name = name;
    }

    public PlayerMenu setMenuButtons(HashMap<Integer, MenuButton> menuButtons) {
        this.menuButtons = menuButtons;

    return this;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayerMenu removeButton(int pos)
    {
        if(menuButtons.containsKey(pos))
        {
            menuButtons.remove(pos);
        }
        return this;

    }

    public void openPlayer(Player p)
    {
        Inventory inv = genInventory(p);
        p.openInventory(inv);

        this.viewing.add(p.getName());

    }

    public MenuButton getMenuButton(ItemStack is)
    {
        for(Map.Entry e : this.menuButtons.entrySet())
        {
            if(((MenuButton)e.getValue()).getItemStack().equals(is))
            {

                return (MenuButton)e.getValue();

            }

        }
        return null;


    }

    public Inventory genInventory(Player p)
    {
        Inventory i = Bukkit.createInventory(null, this.getSize(), this.getName());

        for(Map.Entry e : this.menuButtons.entrySet())
        {

            i.setItem((Integer) e.getKey(), ((MenuButton) e.getValue()).getItemStack());

        }



        return i;

    }

    @EventHandler
    private void onClick(InventoryClickEvent e)
    {
        if(this.viewing.contains(e.getWhoClicked().getName()))
        {
            if(getMenuButton(e.getCurrentItem()) != null)
            {
                getMenuButton(e.getCurrentItem()).onClick(e);
            }


        }


    }

    @EventHandler
    public void onClose(InventoryCloseEvent e)
    {
        if(this.viewing.contains(e.getPlayer().getName()))
        {
            if(e.getPlayer().getInventory().getName().equals(this.getName()))
            {
                this.viewing.remove(e.getPlayer().getName());
            }


        }


    }





    public int getAvailableSpace()
    {


        return this.getSize()-this.getMenuButtons().size();
    }


}
