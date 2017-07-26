package me.amanthemoneyman.Slaves.Utils;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.SlavesClasses.Slave;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Administrator on 7/14/2017.
 */
public class Utilities {
    /**
     *
     * @param bottom - The lowest the integer gets
     * @param top - The highest the integer gets
     * @return - The random integer
     */
    public static Integer getRandomInteger(int bottom, int top)
    {
        return ThreadLocalRandom.current().nextInt(bottom, top ) + 1;


    }

    public static void error(String str)
    {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Slaves.prefix + "&4ERROR : " + str));


    }

    public static void debug(String str)
    {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Slaves.prefix  + "&4DEBUG : " + str));
    }

    public static boolean isMultipleOf(int multiple, int check)
    {
        if(multiple/check == 0)
        {
            return true;
        }
        return false;


    }

    public static boolean isValidInventorySize(int size)
    {
        if(size <= 55)
        {
            if(size+1/9 == 0)
            {
                return true;
            }
        }
        return false;

    }

    public static List<String> slaveToLore(Slave s) {
        /* Slave Lore Format???
           Name : Bob
           Owner : Alex
           Mining : 22
           Farming : 80
           Stealing : 10

           Price :

         */
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Name : " + ChatColor.BLUE + s.getName() + "\n");
        lore.add(ChatColor.GRAY + "Owner : " + ChatColor.BLUE + Bukkit.getPlayer(s.getOwner()).getName()+ "\n");
        lore.add(ChatColor.GRAY + "Mining : " + ChatColor.BLUE + s.getStrengths().getMining()+ "\n");
        lore.add(ChatColor.GRAY + "Farming : " + ChatColor.BLUE + s.getStrengths().getFarming()+ "\n");
        lore.add(ChatColor.GRAY + "Stealing : " + ChatColor.BLUE + s.getStrengths().getStealing()+ "\n");
        lore.add(ChatColor.GREEN + "Price : " + ChatColor.WHITE + s.getSellPrice()+ "\n");

        return lore;
    }

    public static int getMaxInventorySize(Integer rows)
    {

        if(rows > 6)
        {
            throw new ArrayIndexOutOfBoundsException("Valid number of rows is equal to or less than 6");
        }
        return (9*rows)-1;


    }





}
