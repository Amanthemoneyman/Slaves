package me.amanthemoneyman.Slaves.Utils.InventoryAPI;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

/**
 * Created by alexm on 7/21/2017.
 */
public abstract class MenuButton {

    private String name;
    private List<String> lore;
    private ItemStack item;

    /**
     *
     * @param name - Name of item (Auto Color Coded)
     * @param lores - Lore lines
     */
    public MenuButton(String name, String... lores)
    {
        this.name = name;
        for(String s : lores)
        {
            this.lore.add(s);
        }


    }

    public abstract void onClick(InventoryClickEvent e);

    /**
     *
     * @param name - Name of item (Auto Color Coded)
     * @param lore - Lore list
     */
    public MenuButton(String name, List<String> lore)
    {
        this.name = name;
        this.lore = lore;


    }

    public String getName()
    {
        return name;
    }

    public List<String> getLore()
    {
        return lore;
    }

    public MenuButton setName(String newName)
    {
        this.name = newName;
        return this;
    }

    public MenuButton setLore(List<String> newLore)
    {
        this.lore = newLore;
        return this;
    }

    public MenuButton setItemStack(ItemStack m)
    {
        this.item = m;
        return this;
    }

    public ItemStack getItemStack() {
        return item;
    }
    public ItemMeta getItemMeta()
    {
        return item.getItemMeta();
    }

    public MenuButton createItemStack(Material m, Integer amount)
    {

        this.item = new ItemStack(m, amount);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(getName());
        im.setLore(getLore());
        item.setItemMeta(im);
        return this;

    }

    /**
     *
     * @param m
     * @param amount
     * @param b - For wool use DyeColor.<COLOR>.getWoolData
     * @return
     */
    public MenuButton createItemStack(Material m, Integer amount, Byte b)
    {

        this.item = new ItemStack(m, amount, b);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(getName());
        im.setLore(getLore());
        item.setItemMeta(im);
        return this;

    }

}
